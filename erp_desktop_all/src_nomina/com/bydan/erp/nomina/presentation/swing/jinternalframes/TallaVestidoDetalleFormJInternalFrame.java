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
import com.bydan.erp.nomina.util.TallaVestidoConstantesFunciones;

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
public class TallaVestidoDetalleFormJInternalFrame extends TallaVestidoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTallaVestido;
	
	protected JMenuBar jmenuBarDetalleTallaVestido;
	
	protected JMenu jmenuDetalleTallaVestido;
	protected JMenu jmenuDetalleArchivoTallaVestido;
	protected JMenu jmenuDetalleAccionesTallaVestido;
	protected JMenu jmenuDetalleDatosTallaVestido;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTallaVestido;	
	protected GridBagConstraints gridBagConstraintsTallaVestido;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TallaVestidoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTallaVestido;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected VestimentaBeanSwingJInternalFrame vestimentaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vestimenta="";
	
	public TallaVestidoSessionBean tallavestidoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public VestimentaSessionBean vestimentaSessionBean;	
	
	public TallaVestidoLogic tallavestidoLogic;
	
	public JScrollPane jScrollPanelDatosTallaVestido;
	public JScrollPane jScrollPanelDatosEdicionTallaVestido;
	public JScrollPane jScrollPanelDatosGeneralTallaVestido;
	
	protected JPanel jPanelCamposTallaVestido;    
	protected JPanel jPanelCamposOcultosTallaVestido;    	
	protected JPanel jPanelAccionesTallaVestido;
	protected JPanel jPanelAccionesFormularioTallaVestido;
    
	
	
	protected Integer iXPanelCamposTallaVestido=0;
	protected Integer iYPanelCamposTallaVestido=0;
	
	protected Integer iXPanelCamposOcultosTallaVestido=0;
	protected Integer iYPanelCamposOcultosTallaVestido=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTallaVestido;
	public JButton jButtonModificarTallaVestido;
	public JButton jButtonActualizarTallaVestido;
    public JButton jButtonEliminarTallaVestido;
	public JButton jButtonCancelarTallaVestido;
    public JButton jButtonGuardarCambiosTallaVestido;
	public JButton jButtonGuardarCambiosTablaTallaVestido;
	protected JButton jButtonCerrarTallaVestido;
	
	
	protected JButton jButtonProcesarInformacionTallaVestido;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTallaVestido;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTallaVestido;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTallaVestido;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTallaVestido;
	protected JButton jButtonModificarToolBarTallaVestido;
	protected JButton jButtonActualizarToolBarTallaVestido;
    protected JButton jButtonEliminarToolBarTallaVestido;
	protected JButton jButtonCancelarToolBarTallaVestido;
    protected JButton jButtonGuardarCambiosToolBarTallaVestido;
	protected JButton jButtonGuardarCambiosTablaToolBarTallaVestido;
	protected JButton jButtonMostrarOcultarTablaToolBarTallaVestido;
	protected JButton jButtonCerrarToolBarTallaVestido;
	
	protected JButton jButtonProcesarInformacionToolBarTallaVestido;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTallaVestido;
	protected JMenuItem jMenuItemModificarTallaVestido;
	protected JMenuItem jMenuItemActualizarTallaVestido;
    protected JMenuItem jMenuItemEliminarTallaVestido;
	protected JMenuItem jMenuItemCancelarTallaVestido;
    protected JMenuItem jMenuItemGuardarCambiosTallaVestido;
	protected JMenuItem jMenuItemGuardarCambiosTablaTallaVestido;
	protected JMenuItem jMenuItemCerrarTallaVestido;
	protected JMenuItem jMenuItemDetalleCerrarTallaVestido;
	protected JMenuItem jMenuItemDetalleMostarOcultarTallaVestido;
	
	protected JMenuItem jMenuItemProcesarInformacionTallaVestido;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTallaVestido;
	protected JMenuItem jMenuItemMostrarOcultarTallaVestido;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTallaVestido;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTallaVestido;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTallaVestido;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTallaVestido;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTallaVestido;
	public JLabel jLabelIdTallaVestido;
	public JLabel jLabelidTallaVestido;
	public JButton jButtonidTallaVestidoBusqueda= new JButtonMe();

	public JPanel jPaneltallaTallaVestido;
	public JLabel jLabeltallaTallaVestido;
	public JTextField jTextFieldtallaTallaVestido;
	public JButton jButtontallaTallaVestidoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadTallaVestido;
	public JLabel jLabelcantidadTallaVestido;
	public JTextField jTextFieldcantidadTallaVestido;
	public JButton jButtoncantidadTallaVestidoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTallaVestido;
	public JLabel jLabeldescripcionTallaVestido;
	public JTextArea jTextAreadescripcionTallaVestido;
	public JScrollPane jscrollPanedescripcionTallaVestido;
	public JButton jButtondescripcionTallaVestidoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTallaVestido;
	public JLabel jLabelid_empresaTallaVestido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTallaVestido;
	public JButton jButtonid_empresaTallaVestido= new JButtonMe();
	public JButton jButtonid_empresaTallaVestidoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTallaVestidoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoTallaVestido;
	public JLabel jLabelid_empleadoTallaVestido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoTallaVestido;
	public JButton jButtonid_empleadoTallaVestido= new JButtonMe();
	public JButton jButtonid_empleadoTallaVestidoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoTallaVestidoBusqueda= new JButtonMe();

	public JPanel jPanelid_vestimentaTallaVestido;
	public JLabel jLabelid_vestimentaTallaVestido;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vestimentaTallaVestido;
	public JButton jButtonid_vestimentaTallaVestido= new JButtonMe();
	public JButton jButtonid_vestimentaTallaVestidoUpdate= new JButtonMe();
	public JButton jButtonid_vestimentaTallaVestidoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTallaVestido;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TallaVestidoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTallaVestido=new JPanel();
				this.jPanelAccionesFormularioTallaVestido=new JPanel();
				this.jmenuBarDetalleTallaVestido=new JMenuBar();
				this.jTtoolBarDetalleTallaVestido=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaVestidoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TallaVestidoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaVestidoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaVestidoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TallaVestidoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TallaVestido No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTallaVestido() {
		return this.jButtonActualizarToolBarTallaVestido;
	}
	
	public JButton getjButtonEliminarToolBarTallaVestido() {
		return this.jButtonEliminarToolBarTallaVestido;
	}
	
	public JButton getjButtonCancelarToolBarTallaVestido() {
		return this.jButtonCancelarToolBarTallaVestido;
	}		
	
	public JButton getjButtonProcesarInformacionTallaVestido() {
		return this.jButtonProcesarInformacionTallaVestido;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTallaVestido)	{
		this.jButtonProcesarInformacionTallaVestido = jButtonProcesarInformacionTallaVestido;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTallaVestido() {
		return this.jComboBoxTiposAccionesTallaVestido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTallaVestido(
			JComboBox jComboBoxTiposRelacionesTallaVestido) {
		this.jComboBoxTiposRelacionesTallaVestido = jComboBoxTiposRelacionesTallaVestido;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTallaVestido(
			JComboBox jComboBoxTiposAccionesTallaVestido) {
		this.jComboBoxTiposAccionesTallaVestido = jComboBoxTiposAccionesTallaVestido;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTallaVestido() {
		return this.jComboBoxTiposAccionesFormularioTallaVestido;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTallaVestido(
			JComboBox jComboBoxTiposAccionesFormularioTallaVestido) {
		this.jComboBoxTiposAccionesFormularioTallaVestido = jComboBoxTiposAccionesFormularioTallaVestido;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		
		this.tallavestidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tallavestidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tallavestidoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TallaVestidoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Talla Vestido MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
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
	
		TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTallaVestido= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTallaVestido=new JButtonMe();
				this.jButtonModificarToolBarTallaVestido=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTallaVestido,this.jTtoolBarDetalleTallaVestido,
							"actualizar","actualizar","Actualizar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTallaVestido,this.jTtoolBarDetalleTallaVestido,
							"eliminar","eliminar","Eliminar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTallaVestido,this.jTtoolBarDetalleTallaVestido,
							"cancelar","cancelar","Cancelar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTallaVestido=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTallaVestido,this.jTtoolBarDetalleTallaVestido,
							"guardarcambios","guardarcambios","Guardar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTallaVestido=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTallaVestido=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTallaVestido=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTallaVestido=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTallaVestido=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTallaVestido= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTallaVestido.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTallaVestido,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTallaVestido= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTallaVestido.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTallaVestido,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTallaVestido= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTallaVestido.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTallaVestido,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTallaVestido= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTallaVestido.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTallaVestido,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTallaVestido= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTallaVestido.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTallaVestido,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTallaVestido= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTallaVestido.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTallaVestido,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTallaVestido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTallaVestido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTallaVestido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTallaVestido= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTallaVestido.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTallaVestido,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTallaVestido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTallaVestido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTallaVestido,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTallaVestido= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTallaVestido.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTallaVestido,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTallaVestido.add(this.jMenuItemDetalleCerrarTallaVestido);
		
		this.jmenuDetalleAccionesTallaVestido.add(this.jMenuItemActualizarTallaVestido);
		this.jmenuDetalleAccionesTallaVestido.add(this.jMenuItemEliminarTallaVestido);
		this.jmenuDetalleAccionesTallaVestido.add(this.jMenuItemCancelarTallaVestido);		
		
		//this.jmenuDetalleDatosTallaVestido.add(this.jMenuItemDetalleAbrirOrderByTallaVestido);				
		this.jmenuDetalleDatosTallaVestido.add(this.jMenuItemDetalleMostarOcultarTallaVestido);				
				
		//this.jmenuDetalleAccionesTallaVestido.add(this.jMenuItemGuardarCambiosTallaVestido);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTallaVestido.add(this.jmenuDetalleArchivoTallaVestido);		
		this.jmenuBarDetalleTallaVestido.add(this.jmenuDetalleAccionesTallaVestido);		
		this.jmenuBarDetalleTallaVestido.add(this.jmenuDetalleDatosTallaVestido);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTallaVestido);				
	}
	
	
	public void inicializarElementosCamposTallaVestido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTallaVestido = new JLabelMe();
		jLabelIdTallaVestido.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTallaVestido = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTallaVestido.setToolTipText(TallaVestidoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTallaVestido= new GridBagLayout();

		this.jPanelidTallaVestido.setLayout(this.gridaBagLayoutTallaVestido);

		jLabelidTallaVestido = new JLabel();
		jLabelidTallaVestido.setText("Id");

		jLabelidTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeltallaTallaVestido = new JLabelMe();
		this.jLabeltallaTallaVestido.setText(""+TallaVestidoConstantesFunciones.LABEL_TALLA+" : *");
		this.jLabeltallaTallaVestido.setToolTipText("Talla");
		this.jLabeltallaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltallaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltallaTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltallaTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltallaTallaVestido.setToolTipText(TallaVestidoConstantesFunciones.LABEL_TALLA);
		this.gridaBagLayoutTallaVestido = new GridBagLayout();
		this.jPaneltallaTallaVestido.setLayout(this.gridaBagLayoutTallaVestido);


		jTextFieldtallaTallaVestido= new JTextFieldMe();
		jTextFieldtallaTallaVestido.setEnabled(false);
		jTextFieldtallaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtallaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtallaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtallaTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtallaTallaVestido.setText("0.0");

		this.jButtontallaTallaVestidoBusqueda= new JButtonMe();
		this.jButtontallaTallaVestidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallaTallaVestidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontallaTallaVestidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontallaTallaVestidoBusqueda.setText("U");
		this.jButtontallaTallaVestidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontallaTallaVestidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontallaTallaVestidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtallaTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtallaTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tallaTallaVestidoBusqueda"));

		if(this.tallavestidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontallaTallaVestidoBusqueda.setVisible(false);		}


					
		this.jLabelcantidadTallaVestido = new JLabelMe();
		this.jLabelcantidadTallaVestido.setText(""+TallaVestidoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadTallaVestido.setToolTipText("Cantidad");
		this.jLabelcantidadTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadTallaVestido.setToolTipText(TallaVestidoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutTallaVestido = new GridBagLayout();
		this.jPanelcantidadTallaVestido.setLayout(this.gridaBagLayoutTallaVestido);


		jTextFieldcantidadTallaVestido= new JTextFieldMe();
		jTextFieldcantidadTallaVestido.setEnabled(false);
		jTextFieldcantidadTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadTallaVestido.setText("0");

		this.jButtoncantidadTallaVestidoBusqueda= new JButtonMe();
		this.jButtoncantidadTallaVestidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadTallaVestidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadTallaVestidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadTallaVestidoBusqueda.setText("U");
		this.jButtoncantidadTallaVestidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadTallaVestidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadTallaVestidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadTallaVestidoBusqueda"));

		if(this.tallavestidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadTallaVestidoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTallaVestido = new JLabelMe();
		this.jLabeldescripcionTallaVestido.setText(""+TallaVestidoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTallaVestido.setToolTipText("Descripcion");
		this.jLabeldescripcionTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTallaVestido.setToolTipText(TallaVestidoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTallaVestido = new GridBagLayout();
		this.jPaneldescripcionTallaVestido.setLayout(this.gridaBagLayoutTallaVestido);


		jTextAreadescripcionTallaVestido= new JTextAreaMe();
		jTextAreadescripcionTallaVestido.setEnabled(false);
		jTextAreadescripcionTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTallaVestido.setLineWrap(true);
		jTextAreadescripcionTallaVestido.setWrapStyleWord(true);
		jTextAreadescripcionTallaVestido.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTallaVestido.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTallaVestido = new JScrollPane(jTextAreadescripcionTallaVestido);
		jscrollPanedescripcionTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTallaVestidoBusqueda= new JButtonMe();
		this.jButtondescripcionTallaVestidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTallaVestidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTallaVestidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTallaVestidoBusqueda.setText("U");
		this.jButtondescripcionTallaVestidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTallaVestidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTallaVestidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTallaVestidoBusqueda"));

		if(this.tallavestidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTallaVestidoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTallaVestido() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTallaVestido = new JLabelMe();
		this.jLabelid_empresaTallaVestido.setText(""+TallaVestidoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTallaVestido.setToolTipText("Empresa");
		this.jLabelid_empresaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTallaVestido.setToolTipText(TallaVestidoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTallaVestido = new GridBagLayout();
		this.jPanelid_empresaTallaVestido.setLayout(this.gridaBagLayoutTallaVestido);


		jComboBoxid_empresaTallaVestido= new JComboBoxMe();
		jComboBoxid_empresaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTallaVestido.setEnabled(false);

		this.jButtonid_empresaTallaVestido= new JButtonMe();
		this.jButtonid_empresaTallaVestido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTallaVestido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTallaVestido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTallaVestido.setText("Buscar");
		this.jButtonid_empresaTallaVestido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTallaVestido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTallaVestido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTallaVestido"));

		this.jButtonid_empresaTallaVestidoBusqueda= new JButtonMe();
		this.jButtonid_empresaTallaVestidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaVestidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaVestidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTallaVestidoBusqueda.setText("U");
		this.jButtonid_empresaTallaVestidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTallaVestidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTallaVestidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTallaVestidoBusqueda"));

		if(this.tallavestidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTallaVestidoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTallaVestidoUpdate= new JButtonMe();
		this.jButtonid_empresaTallaVestidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaVestidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTallaVestidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTallaVestidoUpdate.setText("U");
		this.jButtonid_empresaTallaVestidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTallaVestidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTallaVestidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTallaVestidoUpdate"));



					
		this.jLabelid_empleadoTallaVestido = new JLabelMe();
		this.jLabelid_empleadoTallaVestido.setText(""+TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoTallaVestido.setToolTipText("Empleado");
		this.jLabelid_empleadoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoTallaVestido.setToolTipText(TallaVestidoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutTallaVestido = new GridBagLayout();
		this.jPanelid_empleadoTallaVestido.setLayout(this.gridaBagLayoutTallaVestido);


		jComboBoxid_empleadoTallaVestido= new JComboBoxMe();
		jComboBoxid_empleadoTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoTallaVestido= new JButtonMe();
		this.jButtonid_empleadoTallaVestido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTallaVestido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTallaVestido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTallaVestido.setText("Buscar");
		this.jButtonid_empleadoTallaVestido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoTallaVestido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTallaVestido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTallaVestido"));

		this.jButtonid_empleadoTallaVestidoBusqueda= new JButtonMe();
		this.jButtonid_empleadoTallaVestidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTallaVestidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTallaVestidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoTallaVestidoBusqueda.setText("U");
		this.jButtonid_empleadoTallaVestidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoTallaVestidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTallaVestidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTallaVestidoBusqueda"));

		if(this.tallavestidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoTallaVestidoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoTallaVestidoUpdate= new JButtonMe();
		this.jButtonid_empleadoTallaVestidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTallaVestidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTallaVestidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoTallaVestidoUpdate.setText("U");
		this.jButtonid_empleadoTallaVestidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoTallaVestidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTallaVestidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTallaVestidoUpdate"));



					
		this.jLabelid_vestimentaTallaVestido = new JLabelMe();
		this.jLabelid_vestimentaTallaVestido.setText(""+TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA+" : *");
		this.jLabelid_vestimentaTallaVestido.setToolTipText("Vestimenta");
		this.jLabelid_vestimentaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vestimentaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vestimentaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vestimentaTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vestimentaTallaVestido=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vestimentaTallaVestido.setToolTipText(TallaVestidoConstantesFunciones.LABEL_IDVESTIMENTA);
		this.gridaBagLayoutTallaVestido = new GridBagLayout();
		this.jPanelid_vestimentaTallaVestido.setLayout(this.gridaBagLayoutTallaVestido);


		jComboBoxid_vestimentaTallaVestido= new JComboBoxMe();
		jComboBoxid_vestimentaTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vestimentaTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vestimentaTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vestimentaTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vestimentaTallaVestido= new JButtonMe();
		this.jButtonid_vestimentaTallaVestido.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vestimentaTallaVestido.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vestimentaTallaVestido.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vestimentaTallaVestido.setText("Buscar");
		this.jButtonid_vestimentaTallaVestido.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vestimentaTallaVestido.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vestimentaTallaVestido,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vestimentaTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vestimentaTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vestimentaTallaVestido"));

		this.jButtonid_vestimentaTallaVestidoBusqueda= new JButtonMe();
		this.jButtonid_vestimentaTallaVestidoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vestimentaTallaVestidoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vestimentaTallaVestidoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vestimentaTallaVestidoBusqueda.setText("U");
		this.jButtonid_vestimentaTallaVestidoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vestimentaTallaVestidoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vestimentaTallaVestidoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vestimentaTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vestimentaTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vestimentaTallaVestidoBusqueda"));

		if(this.tallavestidoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vestimentaTallaVestidoBusqueda.setVisible(false);		}

		this.jButtonid_vestimentaTallaVestidoUpdate= new JButtonMe();
		this.jButtonid_vestimentaTallaVestidoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vestimentaTallaVestidoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vestimentaTallaVestidoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vestimentaTallaVestidoUpdate.setText("U");
		this.jButtonid_vestimentaTallaVestidoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vestimentaTallaVestidoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vestimentaTallaVestidoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vestimentaTallaVestido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vestimentaTallaVestido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vestimentaTallaVestidoUpdate"));



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
		//this.jInternalFrameDetalleTallaVestido = new TallaVestidoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Talla Vestido DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTallaVestido= new GridBagLayout();
		

		
		String sToolTipTallaVestido="";
		sToolTipTallaVestido=TallaVestidoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTallaVestido+="(Nomina.TallaVestido)";
		}
		
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTallaVestido+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTallaVestido = new JButtonMe();
		this.jButtonModificarTallaVestido = new JButtonMe();
        this.jButtonActualizarTallaVestido = new JButtonMe();
        this.jButtonEliminarTallaVestido = new JButtonMe();
        this.jButtonCancelarTallaVestido = new JButtonMe();
        this.jButtonGuardarCambiosTallaVestido = new JButtonMe();
		this.jButtonGuardarCambiosTablaTallaVestido = new JButtonMe();
		this.jButtonCerrarTallaVestido = new JButtonMe();
		
		this.jScrollPanelDatosTallaVestido = new JScrollPane();   
        this.jScrollPanelDatosEdicionTallaVestido = new JScrollPane();
		this.jScrollPanelDatosGeneralTallaVestido = new JScrollPane();
				
		
		
		this.jPanelCamposTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Talla Vestido";
		
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Talla Vestidos" + this.sPath));
		} else {
			this.jScrollPanelDatosTallaVestido.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTallaVestido.setName("jPanelCamposTallaVestido"); 

		this.jPanelCamposOcultosTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTallaVestido.setName("jPanelCamposOcultosTallaVestido"); 

        this.jPanelAccionesTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTallaVestido.setToolTipText("Acciones");
        this.jPanelAccionesTallaVestido.setName("Acciones"); 

		this.jPanelAccionesFormularioTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTallaVestido.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTallaVestido.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTallaVestido.setText("Nuevo");
		this.jButtonModificarTallaVestido.setText("Editar");
        this.jButtonActualizarTallaVestido.setText("Actualizar");
        this.jButtonEliminarTallaVestido.setText("Eliminar");
        this.jButtonCancelarTallaVestido.setText("Cancelar");
        this.jButtonGuardarCambiosTallaVestido.setText("Guardar");
		this.jButtonGuardarCambiosTablaTallaVestido.setText("Guardar");
		this.jButtonCerrarTallaVestido.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTallaVestido,"nuevo_button","Nuevo",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTallaVestido,"modificar_button","Editar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTallaVestido,"actualizar_button","Actualizar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTallaVestido,"eliminar_button","Eliminar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTallaVestido,"cancelar_button","Cancelar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTallaVestido,"guardarcambios_button","Guardar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTallaVestido,"guardarcambiostabla_button","Guardar",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTallaVestido,"cerrar_button","Salir",this.tallavestidoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTallaVestido.setToolTipText("Nuevo"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTallaVestido.setToolTipText("Editar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTallaVestido.setToolTipText("Actualizar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTallaVestido.setToolTipText("Eliminar)"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTallaVestido.setToolTipText("Cancelar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTallaVestido.setToolTipText("Guardar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTallaVestido.setToolTipText("Guardar"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTallaVestido.setToolTipText("Salir"+" "+TallaVestidoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTallaVestido";
		inputMap = this.jButtonNuevoTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTallaVestido.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTallaVestido"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTallaVestido";
		inputMap = this.jButtonActualizarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTallaVestido"));
		
		//ELIMINAR
		sMapKey = "EliminarTallaVestido";
		inputMap = this.jButtonEliminarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTallaVestido"));
		
		//CANCELAR	
		sMapKey = "CancelarTallaVestido";
		inputMap = this.jButtonCancelarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTallaVestido"));
		
		//CERRAR		
		sMapKey = "CerrarTallaVestido";
		inputMap = this.jButtonCerrarTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTallaVestido"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTallaVestido";
		inputMap = this.jButtonGuardarCambiosTablaTallaVestido.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTallaVestido.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTallaVestido"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTallaVestido = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTallaVestido.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTallaVestido.setToolTipText("Nuevo TallaVestido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTallaVestido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTallaVestido.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTallaVestido.setToolTipText("Sin Cerrar Ventana TallaVestido");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTallaVestido = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTallaVestido.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTallaVestido.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTallaVestido.setText("Accion");
		this.jComboBoxTiposAccionesTallaVestido.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTallaVestido = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTallaVestido.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTallaVestido.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTallaVestido = new JLabelMe();
		
		this.jLabelAccionesTallaVestido.setText("Acciones");		
		this.jLabelAccionesTallaVestido.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaVestido.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTallaVestido.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTallaVestido();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTallaVestido();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTallaVestido=new JTabbedPane();
		this.jTabbedPaneRelacionesTallaVestido.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTallaVestido,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTallaVestido.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaVestido.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTallaVestido.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTallaVestido, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTallaVestido.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTallaVestido.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTallaVestido.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTallaVestido, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTallaVestido = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTallaVestido = new GridBagLayout();
		
		this.jPanelCamposTallaVestido.setLayout(gridaBagLayoutCamposTallaVestido);
		this.jPanelCamposOcultosTallaVestido.setLayout(gridaBagLayoutCamposOcultosTallaVestido);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 0;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTallaVestido.add(jLabelIdTallaVestido, this.gridBagConstraintsTallaVestido);



	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 1;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTallaVestido.add(jLabelidTallaVestido, this.gridBagConstraintsTallaVestido);


	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 0;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTallaVestido.add(jLabelid_empresaTallaVestido, this.gridBagConstraintsTallaVestido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 2;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTallaVestido.add(jButtonid_empresaTallaVestidoBusqueda, this.gridBagConstraintsTallaVestido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 3;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTallaVestido.add(jButtonid_empresaTallaVestidoUpdate, this.gridBagConstraintsTallaVestido);
	}

	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 1;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTallaVestido.add(jComboBoxid_empresaTallaVestido, this.gridBagConstraintsTallaVestido);


	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 0;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoTallaVestido.add(jLabelid_empleadoTallaVestido, this.gridBagConstraintsTallaVestido);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 2;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoTallaVestido.add(jButtonid_empleadoTallaVestido, this.gridBagConstraintsTallaVestido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 3;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoTallaVestido.add(jButtonid_empleadoTallaVestidoBusqueda, this.gridBagConstraintsTallaVestido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 4;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoTallaVestido.add(jButtonid_empleadoTallaVestidoUpdate, this.gridBagConstraintsTallaVestido);
	}

	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 1;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoTallaVestido.add(jComboBoxid_empleadoTallaVestido, this.gridBagConstraintsTallaVestido);


	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 0;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vestimentaTallaVestido.add(jLabelid_vestimentaTallaVestido, this.gridBagConstraintsTallaVestido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 2;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vestimentaTallaVestido.add(jButtonid_vestimentaTallaVestidoBusqueda, this.gridBagConstraintsTallaVestido);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 3;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vestimentaTallaVestido.add(jButtonid_vestimentaTallaVestidoUpdate, this.gridBagConstraintsTallaVestido);
	}

	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 1;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vestimentaTallaVestido.add(jComboBoxid_vestimentaTallaVestido, this.gridBagConstraintsTallaVestido);


	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 0;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltallaTallaVestido.add(jLabeltallaTallaVestido, this.gridBagConstraintsTallaVestido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 2;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPaneltallaTallaVestido.add(jButtontallaTallaVestidoBusqueda, this.gridBagConstraintsTallaVestido);
	}

	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 1;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltallaTallaVestido.add(jTextFieldtallaTallaVestido, this.gridBagConstraintsTallaVestido);


	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 0;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadTallaVestido.add(jLabelcantidadTallaVestido, this.gridBagConstraintsTallaVestido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 2;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadTallaVestido.add(jButtoncantidadTallaVestidoBusqueda, this.gridBagConstraintsTallaVestido);
	}

	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 1;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadTallaVestido.add(jTextFieldcantidadTallaVestido, this.gridBagConstraintsTallaVestido);


	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 0;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTallaVestido.add(jLabeldescripcionTallaVestido, this.gridBagConstraintsTallaVestido);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		//this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = 2;
		this.gridBagConstraintsTallaVestido.ipadx = 0;
		this.gridBagConstraintsTallaVestido.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTallaVestido.add(jButtondescripcionTallaVestidoBusqueda, this.gridBagConstraintsTallaVestido);
	}

	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTallaVestido.gridy = 0;
	this.gridBagConstraintsTallaVestido.gridx = 1;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTallaVestido.add(jscrollPanedescripcionTallaVestido, this.gridBagConstraintsTallaVestido);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaVestido.gridy = iYPanelCamposTallaVestido;
	this.gridBagConstraintsTallaVestido.gridx = iXPanelCamposTallaVestido++;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaVestido.add(this.jPanelidTallaVestido, this.gridBagConstraintsTallaVestido);



	if(iXPanelCamposTallaVestido % 1==0) {
		iXPanelCamposTallaVestido=0;
		iYPanelCamposTallaVestido++;
	}
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaVestido.gridy = iYPanelCamposTallaVestido;
	this.gridBagConstraintsTallaVestido.gridx = iXPanelCamposTallaVestido++;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaVestido.add(this.jPanelid_empleadoTallaVestido, this.gridBagConstraintsTallaVestido);



	if(iXPanelCamposTallaVestido % 1==0) {
		iXPanelCamposTallaVestido=0;
		iYPanelCamposTallaVestido++;
	}
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaVestido.gridy = iYPanelCamposTallaVestido;
	this.gridBagConstraintsTallaVestido.gridx = iXPanelCamposTallaVestido++;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaVestido.add(this.jPanelid_vestimentaTallaVestido, this.gridBagConstraintsTallaVestido);



	if(iXPanelCamposTallaVestido % 1==0) {
		iXPanelCamposTallaVestido=0;
		iYPanelCamposTallaVestido++;
	}
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaVestido.gridy = iYPanelCamposTallaVestido;
	this.gridBagConstraintsTallaVestido.gridx = iXPanelCamposTallaVestido++;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaVestido.add(this.jPaneltallaTallaVestido, this.gridBagConstraintsTallaVestido);



	if(iXPanelCamposTallaVestido % 1==0) {
		iXPanelCamposTallaVestido=0;
		iYPanelCamposTallaVestido++;
	}
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaVestido.gridy = iYPanelCamposTallaVestido;
	this.gridBagConstraintsTallaVestido.gridx = iXPanelCamposTallaVestido++;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaVestido.add(this.jPanelcantidadTallaVestido, this.gridBagConstraintsTallaVestido);



	if(iXPanelCamposTallaVestido % 1==0) {
		iXPanelCamposTallaVestido=0;
		iYPanelCamposTallaVestido++;
	}
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaVestido.gridy = iYPanelCamposTallaVestido;
	this.gridBagConstraintsTallaVestido.gridx = iXPanelCamposTallaVestido++;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTallaVestido.add(this.jPaneldescripcionTallaVestido, this.gridBagConstraintsTallaVestido);



	if(iXPanelCamposTallaVestido % 1==0) {
		iXPanelCamposTallaVestido=0;
		iYPanelCamposTallaVestido++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTallaVestido.gridy = iYPanelCamposOcultosTallaVestido;
	this.gridBagConstraintsTallaVestido.gridx = iXPanelCamposOcultosTallaVestido++;
	this.gridBagConstraintsTallaVestido.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTallaVestido.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTallaVestido.add(this.jPanelid_empresaTallaVestido, this.gridBagConstraintsTallaVestido);



	if(iXPanelCamposOcultosTallaVestido % 1==0) {
		iXPanelCamposOcultosTallaVestido=0;
		iYPanelCamposOcultosTallaVestido++;
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
			
		GridBagLayout gridaBagLayoutAccionesTallaVestido= new GridBagLayout();
		this.jPanelAccionesTallaVestido.setLayout(gridaBagLayoutAccionesTallaVestido);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTallaVestido= new GridBagLayout();
		this.jPanelAccionesFormularioTallaVestido.setLayout(gridaBagLayoutAccionesFormularioTallaVestido);
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTallaVestido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTallaVestido.add(this.jComboBoxTiposAccionesFormularioTallaVestido, this.gridBagConstraintsTallaVestido);

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTallaVestido.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTallaVestido.add(this.jCheckBoxPostAccionNuevoTallaVestido, this.gridBagConstraintsTallaVestido);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tallavestidoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTallaVestido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTallaVestido.add(this.jCheckBoxPostAccionSinCerrarTallaVestido, this.gridBagConstraintsTallaVestido);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tallavestidoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tallavestidoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTallaVestido.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTallaVestido.add(this.jCheckBoxPostAccionSinMensajeTallaVestido, this.gridBagConstraintsTallaVestido);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx = iPosXAccion++;
			
		this.jPanelAccionesTallaVestido.add(this.jButtonModificarTallaVestido, this.gridBagConstraintsTallaVestido);							

		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTallaVestido.gridy = 0;
		this.gridBagConstraintsTallaVestido.gridx =iPosXAccion++;
			
		this.jPanelAccionesTallaVestido.add(this.jButtonEliminarTallaVestido, this.gridBagConstraintsTallaVestido);
		
			
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = 0;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXAccion++;
		
		this.jPanelAccionesTallaVestido.add(this.jButtonActualizarTallaVestido, this.gridBagConstraintsTallaVestido);


		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = 0;		
		this.gridBagConstraintsTallaVestido.gridx = iPosXAccion++;
		
		this.jPanelAccionesTallaVestido.add(this.jButtonGuardarCambiosTallaVestido, this.gridBagConstraintsTallaVestido);	
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = 0;		
		this.gridBagConstraintsTallaVestido.gridx =iPosXAccion++;
		
		this.jPanelAccionesTallaVestido.add(this.jButtonCancelarTallaVestido, this.gridBagConstraintsTallaVestido);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTallaVestido = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTallaVestido);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tallavestidoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();						
			this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTallaVestido.gridx = 0;		
			//this.gridBagConstraintsTallaVestido.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTallaVestido.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTallaVestido.gridx =0;
		this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTallaVestido.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTallaVestido, this.gridBagConstraintsTallaVestido);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TallaVestidoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTallaVestido = new TallaVestidoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Talla Vestido DATOS");
			
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
			
	        //this.setTitle("[FOR] - Talla Vestido DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Talla Vestido Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TallaVestidoModel tallavestidoModel=new TallaVestidoModel(this);
			
			//SI USARA CLASE INTERNA
			//TallaVestidoModel.TallaVestidoFocusTraversalPolicy tallavestidoFocusTraversalPolicy = tallavestidoModel.new TallaVestidoFocusTraversalPolicy(this);
			
			//tallavestidoFocusTraversalPolicy.settallavestidoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tallavestidoModel);
			
			
			this.jContentPaneDetalleTallaVestido = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTallaVestido = new GridBagLayout();	
			this.jContentPaneDetalleTallaVestido.setLayout(gridaBagLayoutDetalleTallaVestido);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTallaVestido = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTallaVestido = new GridBagConstraints();
				this.gridBagConstraintsTallaVestido.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTallaVestido.gridx = 0;
					
				
				this.jContentPaneDetalleTallaVestido.add(jTtoolBarDetalleTallaVestido, gridBagConstraintsTallaVestido);								
				
}
			
			this.jScrollPanelDatosEdicionTallaVestido=   new JScrollPane(jContentPaneDetalleTallaVestido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTallaVestido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaVestido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaVestido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTallaVestido=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTallaVestido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaVestido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTallaVestido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTallaVestido.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTallaVestido.gridx = 0;
	        
			this.jContentPaneDetalleTallaVestido.add(jPanelCamposTallaVestido, gridBagConstraintsTallaVestido);
			
			
			
			
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
						&& tallavestidoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tallavestidoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTallaVestido= new GridBagConstraints();
						this.gridBagConstraintsTallaVestido.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTallaVestido.gridx = 0;
						this.jContentPaneDetalleTallaVestido.add(this.jTabbedPaneRelacionesTallaVestido, this.gridBagConstraintsTallaVestido);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTallaVestido.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTallaVestido.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTallaVestido = new GridBagConstraints();
					this.gridBagConstraintsTallaVestido.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTallaVestido.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTallaVestido.gridx = 0;
					
				
					this.jContentPaneDetalleTallaVestido.add(jPanelCamposOcultosTallaVestido, gridBagConstraintsTallaVestido);
				
					this.jPanelCamposOcultosTallaVestido.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTallaVestido.gridx = 0;
	        this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTallaVestido.add(this.jPanelAccionesFormularioTallaVestido, this.gridBagConstraintsTallaVestido);							
			
			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
	        this.gridBagConstraintsTallaVestido.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTallaVestido.gridx = 0;
	        
			
			this.jContentPaneDetalleTallaVestido.add(this.jPanelAccionesTallaVestido, this.gridBagConstraintsTallaVestido);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTallaVestido);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTallaVestido=   new JScrollPane(this.jPanelCamposTallaVestido,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTallaVestido.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaVestido.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTallaVestido.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTallaVestido.gridx = 0;
			this.gridBagConstraintsTallaVestido.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTallaVestido.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTallaVestido.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTallaVestido, this.gridBagConstraintsTallaVestido);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTallaVestido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTallaVestido, this.gridBagConstraintsTallaVestido);			
			
			this.gridBagConstraintsTallaVestido = new GridBagConstraints();
			this.gridBagConstraintsTallaVestido.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTallaVestido.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTallaVestido, this.gridBagConstraintsTallaVestido);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTallaVestido, this.gridBagConstraintsTallaVestido);
			
			
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTallaVestido, this.gridBagConstraintsTallaVestido);
		
			
		this.gridBagConstraintsTallaVestido = new GridBagConstraints();
		this.gridBagConstraintsTallaVestido.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTallaVestido.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTallaVestido, this.gridBagConstraintsTallaVestido);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTallaVestido;//jContentPane;
		
		return jScrollPanelDatosEdicionTallaVestido;
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
