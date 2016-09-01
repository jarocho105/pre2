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
import com.bydan.erp.nomina.util.ReferenciaConstantesFunciones;

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
public class ReferenciaDetalleFormJInternalFrame extends ReferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleReferencia;
	
	protected JMenuBar jmenuBarDetalleReferencia;
	
	protected JMenu jmenuDetalleReferencia;
	protected JMenu jmenuDetalleArchivoReferencia;
	protected JMenu jmenuDetalleAccionesReferencia;
	protected JMenu jmenuDetalleDatosReferencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReferencia;	
	protected GridBagConstraints gridBagConstraintsReferencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ReferenciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleReferencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected ParentezcoBeanSwingJInternalFrame parentezcoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parentezco="";

	protected ProfesionBeanSwingJInternalFrame profesionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_profesion="";
	
	public ReferenciaSessionBean referenciaSessionBean;
	
	

	public TelefonoReferenciaBeanSwingJInternalFrame telefonoreferenciaBeanSwingJInternalFrame=null;
	public TelefonoReferenciaBeanSwingJInternalFrame telefonoreferenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTelefonoReferencia=false;
	public TelefonoReferenciaSessionBean telefonoreferenciaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public ParentezcoSessionBean parentezcoSessionBean;
	public ProfesionSessionBean profesionSessionBean;	
	
	public ReferenciaLogic referenciaLogic;
	
	public JScrollPane jScrollPanelDatosReferencia;
	public JScrollPane jScrollPanelDatosEdicionReferencia;
	public JScrollPane jScrollPanelDatosGeneralReferencia;
	
	protected JPanel jPanelCamposReferencia;    
	protected JPanel jPanelCamposOcultosReferencia;    	
	protected JPanel jPanelAccionesReferencia;
	protected JPanel jPanelAccionesFormularioReferencia;
    
	
	
	protected Integer iXPanelCamposReferencia=0;
	protected Integer iYPanelCamposReferencia=0;
	
	protected Integer iXPanelCamposOcultosReferencia=0;
	protected Integer iYPanelCamposOcultosReferencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoReferencia;
	public JButton jButtonModificarReferencia;
	public JButton jButtonActualizarReferencia;
    public JButton jButtonEliminarReferencia;
	public JButton jButtonCancelarReferencia;
    public JButton jButtonGuardarCambiosReferencia;
	public JButton jButtonGuardarCambiosTablaReferencia;
	protected JButton jButtonCerrarReferencia;
	
	
	protected JButton jButtonProcesarInformacionReferencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoReferencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarReferencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeReferencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReferencia;
	protected JButton jButtonModificarToolBarReferencia;
	protected JButton jButtonActualizarToolBarReferencia;
    protected JButton jButtonEliminarToolBarReferencia;
	protected JButton jButtonCancelarToolBarReferencia;
    protected JButton jButtonGuardarCambiosToolBarReferencia;
	protected JButton jButtonGuardarCambiosTablaToolBarReferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarReferencia;
	protected JButton jButtonCerrarToolBarReferencia;
	
	protected JButton jButtonProcesarInformacionToolBarReferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReferencia;
	protected JMenuItem jMenuItemModificarReferencia;
	protected JMenuItem jMenuItemActualizarReferencia;
    protected JMenuItem jMenuItemEliminarReferencia;
	protected JMenuItem jMenuItemCancelarReferencia;
    protected JMenuItem jMenuItemGuardarCambiosReferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaReferencia;
	protected JMenuItem jMenuItemCerrarReferencia;
	protected JMenuItem jMenuItemDetalleCerrarReferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarReferencia;
	
	protected JMenuItem jMenuItemProcesarInformacionReferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReferencia;
	protected JMenuItem jMenuItemMostrarOcultarReferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReferencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReferencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioReferencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidReferencia;
	public JLabel jLabelIdReferencia;
	public JLabel jLabelidReferencia;
	public JButton jButtonidReferenciaBusqueda= new JButtonMe();

	public JPanel jPanelcedulaReferencia;
	public JLabel jLabelcedulaReferencia;
	public JTextField jTextFieldcedulaReferencia;
	public JButton jButtoncedulaReferenciaBusqueda= new JButtonMe();

	public JPanel jPanelapellidoReferencia;
	public JLabel jLabelapellidoReferencia;
	public JTextField jTextFieldapellidoReferencia;
	public JButton jButtonapellidoReferenciaBusqueda= new JButtonMe();

	public JPanel jPanelnombreReferencia;
	public JLabel jLabelnombreReferencia;
	public JTextField jTextFieldnombreReferencia;
	public JButton jButtonnombreReferenciaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionReferencia;
	public JLabel jLabeldireccionReferencia;
	public JTextArea jTextAreadireccionReferencia;
	public JScrollPane jscrollPanedireccionReferencia;
	public JButton jButtondireccionReferenciaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoReferencia;
	public JLabel jLabeltelefonoReferencia;
	public JTextField jTextFieldtelefonoReferencia;
	public JButton jButtontelefonoReferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaReferencia;
	public JLabel jLabelid_empresaReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaReferencia;
	public JButton jButtonid_empresaReferencia= new JButtonMe();
	public JButton jButtonid_empresaReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaReferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoReferencia;
	public JLabel jLabelid_empleadoReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoReferencia;
	public JButton jButtonid_empleadoReferencia= new JButtonMe();
	public JButton jButtonid_empleadoReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoReferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_parentezcoReferencia;
	public JLabel jLabelid_parentezcoReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parentezcoReferencia;
	public JButton jButtonid_parentezcoReferencia= new JButtonMe();
	public JButton jButtonid_parentezcoReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_parentezcoReferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_profesionReferencia;
	public JLabel jLabelid_profesionReferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_profesionReferencia;
	public JButton jButtonid_profesionReferencia= new JButtonMe();
	public JButton jButtonid_profesionReferenciaUpdate= new JButtonMe();
	public JButton jButtonid_profesionReferenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesReferencia;
	
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
	public int iHeightFormulario=946;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ReferenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposReferencia=new JPanel();
				this.jPanelAccionesFormularioReferencia=new JPanel();
				this.jmenuBarDetalleReferencia=new JMenuBar();
				this.jTtoolBarDetalleReferencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ReferenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReferenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Referencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarReferencia() {
		return this.jButtonActualizarToolBarReferencia;
	}
	
	public JButton getjButtonEliminarToolBarReferencia() {
		return this.jButtonEliminarToolBarReferencia;
	}
	
	public JButton getjButtonCancelarToolBarReferencia() {
		return this.jButtonCancelarToolBarReferencia;
	}		
	
	public JButton getjButtonProcesarInformacionReferencia() {
		return this.jButtonProcesarInformacionReferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReferencia)	{
		this.jButtonProcesarInformacionReferencia = jButtonProcesarInformacionReferencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReferencia() {
		return this.jComboBoxTiposAccionesReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReferencia(
			JComboBox jComboBoxTiposRelacionesReferencia) {
		this.jComboBoxTiposRelacionesReferencia = jComboBoxTiposRelacionesReferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReferencia(
			JComboBox jComboBoxTiposAccionesReferencia) {
		this.jComboBoxTiposAccionesReferencia = jComboBoxTiposAccionesReferencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioReferencia() {
		return this.jComboBoxTiposAccionesFormularioReferencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioReferencia(
			JComboBox jComboBoxTiposAccionesFormularioReferencia) {
		this.jComboBoxTiposAccionesFormularioReferencia = jComboBoxTiposAccionesFormularioReferencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.referenciaSessionBean=new ReferenciaSessionBean();
		
		this.referenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.referenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Referencia MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleReferencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarReferencia=new JButtonMe();
				this.jButtonModificarToolBarReferencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarReferencia,this.jTtoolBarDetalleReferencia,
							"actualizar","actualizar","Actualizar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarReferencia,this.jTtoolBarDetalleReferencia,
							"eliminar","eliminar","Eliminar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarReferencia,this.jTtoolBarDetalleReferencia,
							"cancelar","cancelar","Cancelar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarReferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarReferencia,this.jTtoolBarDetalleReferencia,
							"guardarcambios","guardarcambios","Guardar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleReferencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleReferencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoReferencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesReferencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosReferencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarReferencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarReferencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarReferencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarReferencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarReferencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarReferencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarReferencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarReferencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarReferencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarReferencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarReferencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarReferencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosReferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarReferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarReferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarReferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoReferencia.add(this.jMenuItemDetalleCerrarReferencia);
		
		this.jmenuDetalleAccionesReferencia.add(this.jMenuItemActualizarReferencia);
		this.jmenuDetalleAccionesReferencia.add(this.jMenuItemEliminarReferencia);
		this.jmenuDetalleAccionesReferencia.add(this.jMenuItemCancelarReferencia);		
		
		//this.jmenuDetalleDatosReferencia.add(this.jMenuItemDetalleAbrirOrderByReferencia);				
		this.jmenuDetalleDatosReferencia.add(this.jMenuItemDetalleMostarOcultarReferencia);				
				
		//this.jmenuDetalleAccionesReferencia.add(this.jMenuItemGuardarCambiosReferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleReferencia.add(this.jmenuDetalleArchivoReferencia);		
		this.jmenuBarDetalleReferencia.add(this.jmenuDetalleAccionesReferencia);		
		this.jmenuBarDetalleReferencia.add(this.jmenuDetalleDatosReferencia);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleReferencia.add(this.jmenuDetalleReferencia);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleReferencia);				
	}
	
	
	public void inicializarElementosCamposReferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdReferencia = new JLabelMe();
		jLabelIdReferencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidReferencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutReferencia= new GridBagLayout();

		this.jPanelidReferencia.setLayout(this.gridaBagLayoutReferencia);

		jLabelidReferencia = new JLabel();
		jLabelidReferencia.setText("Id");

		jLabelidReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcedulaReferencia = new JLabelMe();
		this.jLabelcedulaReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_CEDULA+" : *");
		this.jLabelcedulaReferencia.setToolTipText("Cedula");
		this.jLabelcedulaReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcedulaReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcedulaReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcedulaReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcedulaReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_CEDULA);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPanelcedulaReferencia.setLayout(this.gridaBagLayoutReferencia);


		jTextFieldcedulaReferencia= new JTextFieldMe();

		jTextFieldcedulaReferencia.setEnabled(false);
		jTextFieldcedulaReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcedulaReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcedulaReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncedulaReferenciaBusqueda= new JButtonMe();
		this.jButtoncedulaReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncedulaReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncedulaReferenciaBusqueda.setText("U");
		this.jButtoncedulaReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncedulaReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncedulaReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcedulaReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcedulaReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cedulaReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncedulaReferenciaBusqueda.setVisible(false);		}


					
		this.jLabelapellidoReferencia = new JLabelMe();
		this.jLabelapellidoReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoReferencia.setToolTipText("Apellido");
		this.jLabelapellidoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPanelapellidoReferencia.setLayout(this.gridaBagLayoutReferencia);


		jTextFieldapellidoReferencia= new JTextFieldMe();

		jTextFieldapellidoReferencia.setEnabled(false);
		jTextFieldapellidoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldapellidoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldapellidoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldapellidoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonapellidoReferenciaBusqueda= new JButtonMe();
		this.jButtonapellidoReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoReferenciaBusqueda.setText("U");
		this.jButtonapellidoReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldapellidoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldapellidoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoReferenciaBusqueda.setVisible(false);		}


					
		this.jLabelnombreReferencia = new JLabelMe();
		this.jLabelnombreReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreReferencia.setToolTipText("Nombre");
		this.jLabelnombreReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPanelnombreReferencia.setLayout(this.gridaBagLayoutReferencia);


		jTextFieldnombreReferencia= new JTextFieldMe();

		jTextFieldnombreReferencia.setEnabled(false);
		jTextFieldnombreReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreReferenciaBusqueda= new JButtonMe();
		this.jButtonnombreReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreReferenciaBusqueda.setText("U");
		this.jButtonnombreReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreReferenciaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionReferencia = new JLabelMe();
		this.jLabeldireccionReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionReferencia.setToolTipText("Direccion");
		this.jLabeldireccionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPaneldireccionReferencia.setLayout(this.gridaBagLayoutReferencia);


		jTextAreadireccionReferencia= new JTextAreaMe();
		jTextAreadireccionReferencia.setEnabled(false);
		jTextAreadireccionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionReferencia.setLineWrap(true);
		jTextAreadireccionReferencia.setWrapStyleWord(true);
		jTextAreadireccionReferencia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionReferencia.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionReferencia = new JScrollPane(jTextAreadireccionReferencia);
		jscrollPanedireccionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionReferenciaBusqueda= new JButtonMe();
		this.jButtondireccionReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionReferenciaBusqueda.setText("U");
		this.jButtondireccionReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionReferenciaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoReferencia = new JLabelMe();
		this.jLabeltelefonoReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoReferencia.setToolTipText("Telefono");
		this.jLabeltelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPaneltelefonoReferencia.setLayout(this.gridaBagLayoutReferencia);


		jTextFieldtelefonoReferencia= new JTextFieldMe();

		jTextFieldtelefonoReferencia.setEnabled(false);
		jTextFieldtelefonoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoReferenciaBusqueda= new JButtonMe();
		this.jButtontelefonoReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoReferenciaBusqueda.setText("U");
		this.jButtontelefonoReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoReferenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysReferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaReferencia = new JLabelMe();
		this.jLabelid_empresaReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaReferencia.setToolTipText("Empresa");
		this.jLabelid_empresaReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPanelid_empresaReferencia.setLayout(this.gridaBagLayoutReferencia);


		jComboBoxid_empresaReferencia= new JComboBoxMe();
		jComboBoxid_empresaReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaReferencia.setEnabled(false);

		this.jButtonid_empresaReferencia= new JButtonMe();
		this.jButtonid_empresaReferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaReferencia.setText("Buscar");
		this.jButtonid_empresaReferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaReferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferencia"));

		this.jButtonid_empresaReferenciaBusqueda= new JButtonMe();
		this.jButtonid_empresaReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaBusqueda.setText("U");
		this.jButtonid_empresaReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaReferenciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaReferenciaUpdate= new JButtonMe();
		this.jButtonid_empresaReferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaReferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaReferenciaUpdate.setText("U");
		this.jButtonid_empresaReferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaReferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaReferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaReferenciaUpdate"));



					
		this.jLabelid_empleadoReferencia = new JLabelMe();
		this.jLabelid_empleadoReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoReferencia.setToolTipText("Empleado");
		this.jLabelid_empleadoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPanelid_empleadoReferencia.setLayout(this.gridaBagLayoutReferencia);


		jComboBoxid_empleadoReferencia= new JComboBoxMe();
		jComboBoxid_empleadoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoReferencia= new JButtonMe();
		this.jButtonid_empleadoReferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoReferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoReferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoReferencia.setText("Buscar");
		this.jButtonid_empleadoReferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoReferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoReferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoReferencia"));

		this.jButtonid_empleadoReferenciaBusqueda= new JButtonMe();
		this.jButtonid_empleadoReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoReferenciaBusqueda.setText("U");
		this.jButtonid_empleadoReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoReferenciaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoReferenciaUpdate= new JButtonMe();
		this.jButtonid_empleadoReferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoReferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoReferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoReferenciaUpdate.setText("U");
		this.jButtonid_empleadoReferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoReferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoReferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoReferenciaUpdate"));



					
		this.jLabelid_parentezcoReferencia = new JLabelMe();
		this.jLabelid_parentezcoReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO+" : *");
		this.jLabelid_parentezcoReferencia.setToolTipText("Parentezco");
		this.jLabelid_parentezcoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parentezcoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parentezcoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_parentezcoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_parentezcoReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_parentezcoReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_IDPARENTEZCO);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPanelid_parentezcoReferencia.setLayout(this.gridaBagLayoutReferencia);


		jComboBoxid_parentezcoReferencia= new JComboBoxMe();
		jComboBoxid_parentezcoReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parentezcoReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parentezcoReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parentezcoReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_parentezcoReferencia= new JButtonMe();
		this.jButtonid_parentezcoReferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parentezcoReferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parentezcoReferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parentezcoReferencia.setText("Buscar");
		this.jButtonid_parentezcoReferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_parentezcoReferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parentezcoReferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_parentezcoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parentezcoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parentezcoReferencia"));

		this.jButtonid_parentezcoReferenciaBusqueda= new JButtonMe();
		this.jButtonid_parentezcoReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parentezcoReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parentezcoReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parentezcoReferenciaBusqueda.setText("U");
		this.jButtonid_parentezcoReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_parentezcoReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parentezcoReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_parentezcoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parentezcoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parentezcoReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_parentezcoReferenciaBusqueda.setVisible(false);		}

		this.jButtonid_parentezcoReferenciaUpdate= new JButtonMe();
		this.jButtonid_parentezcoReferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parentezcoReferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parentezcoReferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parentezcoReferenciaUpdate.setText("U");
		this.jButtonid_parentezcoReferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_parentezcoReferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parentezcoReferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_parentezcoReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parentezcoReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parentezcoReferenciaUpdate"));



					
		this.jLabelid_profesionReferencia = new JLabelMe();
		this.jLabelid_profesionReferencia.setText(""+ReferenciaConstantesFunciones.LABEL_IDPROFESION+" : *");
		this.jLabelid_profesionReferencia.setToolTipText("Profesion");
		this.jLabelid_profesionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_profesionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_profesionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_profesionReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_profesionReferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_profesionReferencia.setToolTipText(ReferenciaConstantesFunciones.LABEL_IDPROFESION);
		this.gridaBagLayoutReferencia = new GridBagLayout();
		this.jPanelid_profesionReferencia.setLayout(this.gridaBagLayoutReferencia);


		jComboBoxid_profesionReferencia= new JComboBoxMe();
		jComboBoxid_profesionReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_profesionReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_profesionReferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_profesionReferencia= new JButtonMe();
		this.jButtonid_profesionReferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionReferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionReferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_profesionReferencia.setText("Buscar");
		this.jButtonid_profesionReferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_profesionReferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionReferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_profesionReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionReferencia"));

		this.jButtonid_profesionReferenciaBusqueda= new JButtonMe();
		this.jButtonid_profesionReferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionReferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionReferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_profesionReferenciaBusqueda.setText("U");
		this.jButtonid_profesionReferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_profesionReferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionReferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_profesionReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionReferenciaBusqueda"));

		if(this.referenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_profesionReferenciaBusqueda.setVisible(false);		}

		this.jButtonid_profesionReferenciaUpdate= new JButtonMe();
		this.jButtonid_profesionReferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionReferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_profesionReferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_profesionReferenciaUpdate.setText("U");
		this.jButtonid_profesionReferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_profesionReferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_profesionReferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_profesionReferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_profesionReferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_profesionReferenciaUpdate"));



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
		//this.jInternalFrameDetalleReferencia = new ReferenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Referencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReferencia= new GridBagLayout();
		

		
		String sToolTipReferencia="";
		sToolTipReferencia=ReferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReferencia+="(Nomina.Referencia)";
		}
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipReferencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoReferencia = new JButtonMe();
		this.jButtonModificarReferencia = new JButtonMe();
        this.jButtonActualizarReferencia = new JButtonMe();
        this.jButtonEliminarReferencia = new JButtonMe();
        this.jButtonCancelarReferencia = new JButtonMe();
        this.jButtonGuardarCambiosReferencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaReferencia = new JButtonMe();
		this.jButtonCerrarReferencia = new JButtonMe();
		
		this.jScrollPanelDatosReferencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionReferencia = new JScrollPane();
		this.jScrollPanelDatosGeneralReferencia = new JScrollPane();
				
		
		
		this.jPanelCamposReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Referencia";
		
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Referencias" + this.sPath));
		} else {
			this.jScrollPanelDatosReferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposReferencia.setName("jPanelCamposReferencia"); 

		this.jPanelCamposOcultosReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosReferencia.setName("jPanelCamposOcultosReferencia"); 

        this.jPanelAccionesReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReferencia.setToolTipText("Acciones");
        this.jPanelAccionesReferencia.setName("Acciones"); 

		this.jPanelAccionesFormularioReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioReferencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioReferencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoReferencia.setText("Nuevo");
		this.jButtonModificarReferencia.setText("Editar");
        this.jButtonActualizarReferencia.setText("Actualizar");
        this.jButtonEliminarReferencia.setText("Eliminar");
        this.jButtonCancelarReferencia.setText("Cancelar");
        this.jButtonGuardarCambiosReferencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaReferencia.setText("Guardar");
		this.jButtonCerrarReferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReferencia,"nuevo_button","Nuevo",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarReferencia,"modificar_button","Editar",this.referenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarReferencia,"actualizar_button","Actualizar",this.referenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarReferencia,"eliminar_button","Eliminar",this.referenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarReferencia,"cancelar_button","Cancelar",this.referenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosReferencia,"guardarcambios_button","Guardar",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReferencia,"guardarcambiostabla_button","Guardar",this.referenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReferencia,"cerrar_button","Salir",this.referenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoReferencia.setToolTipText("Nuevo"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarReferencia.setToolTipText("Editar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarReferencia.setToolTipText("Actualizar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarReferencia.setToolTipText("Eliminar)"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarReferencia.setToolTipText("Cancelar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosReferencia.setToolTipText("Guardar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaReferencia.setToolTipText("Guardar"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReferencia.setToolTipText("Salir"+" "+ReferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReferencia";
		inputMap = this.jButtonNuevoReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReferencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarReferencia";
		inputMap = this.jButtonActualizarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarReferencia"));
		
		//ELIMINAR
		sMapKey = "EliminarReferencia";
		inputMap = this.jButtonEliminarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarReferencia"));
		
		//CANCELAR	
		sMapKey = "CancelarReferencia";
		inputMap = this.jButtonCancelarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarReferencia"));
		
		//CERRAR		
		sMapKey = "CerrarReferencia";
		inputMap = this.jButtonCerrarReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReferencia";
		inputMap = this.jButtonGuardarCambiosTablaReferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReferencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoReferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoReferencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoReferencia.setToolTipText("Nuevo Referencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarReferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarReferencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarReferencia.setToolTipText("Sin Cerrar Ventana Referencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarReferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeReferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeReferencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeReferencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeReferencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesReferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReferencia.setText("Accion");
		this.jComboBoxTiposAccionesReferencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioReferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioReferencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioReferencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesReferencia = new JLabelMe();
		
		this.jLabelAccionesReferencia.setText("Acciones");		
		this.jLabelAccionesReferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposReferencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysReferencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesReferencia=new JTabbedPane();
		this.jTabbedPaneRelacionesReferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesReferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesReferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioReferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReferencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioReferencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposReferencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosReferencia = new GridBagLayout();
		
		this.jPanelCamposReferencia.setLayout(gridaBagLayoutCamposReferencia);
		this.jPanelCamposOcultosReferencia.setLayout(gridaBagLayoutCamposOcultosReferencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidReferencia.add(jLabelIdReferencia, this.gridBagConstraintsReferencia);



	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidReferencia.add(jLabelidReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaReferencia.add(jLabelid_empresaReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferencia.add(jButtonid_empresaReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 3;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaReferencia.add(jButtonid_empresaReferenciaUpdate, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaReferencia.add(jComboBoxid_empresaReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoReferencia.add(jLabelid_empleadoReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 2;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoReferencia.add(jButtonid_empleadoReferencia, this.gridBagConstraintsReferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 3;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoReferencia.add(jButtonid_empleadoReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 4;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoReferencia.add(jButtonid_empleadoReferenciaUpdate, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoReferencia.add(jComboBoxid_empleadoReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_parentezcoReferencia.add(jLabelid_parentezcoReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parentezcoReferencia.add(jButtonid_parentezcoReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 3;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parentezcoReferencia.add(jButtonid_parentezcoReferenciaUpdate, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_parentezcoReferencia.add(jComboBoxid_parentezcoReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_profesionReferencia.add(jLabelid_profesionReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_profesionReferencia.add(jButtonid_profesionReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 3;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_profesionReferencia.add(jButtonid_profesionReferenciaUpdate, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_profesionReferencia.add(jComboBoxid_profesionReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcedulaReferencia.add(jLabelcedulaReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcedulaReferencia.add(jButtoncedulaReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcedulaReferencia.add(jTextFieldcedulaReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoReferencia.add(jLabelapellidoReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoReferencia.add(jButtonapellidoReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoReferencia.add(jTextFieldapellidoReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreReferencia.add(jLabelnombreReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreReferencia.add(jButtonnombreReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreReferencia.add(jTextFieldnombreReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionReferencia.add(jLabeldireccionReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionReferencia.add(jButtondireccionReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionReferencia.add(jscrollPanedireccionReferencia, this.gridBagConstraintsReferencia);


	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 0;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoReferencia.add(jLabeltelefonoReferencia, this.gridBagConstraintsReferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		//this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = 2;
		this.gridBagConstraintsReferencia.ipadx = 0;
		this.gridBagConstraintsReferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoReferencia.add(jButtontelefonoReferenciaBusqueda, this.gridBagConstraintsReferencia);
	}

	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReferencia.gridy = 0;
	this.gridBagConstraintsReferencia.gridx = 1;
	this.gridBagConstraintsReferencia.ipadx = 0;
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoReferencia.add(jTextFieldtelefonoReferencia, this.gridBagConstraintsReferencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPanelidReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPanelid_empleadoReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPanelid_parentezcoReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPanelid_profesionReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPanelcedulaReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPanelapellidoReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPanelnombreReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPaneldireccionReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReferencia.add(this.jPaneltelefonoReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposReferencia % 1==0) {
		iXPanelCamposReferencia=0;
		iYPanelCamposReferencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsReferencia = new GridBagConstraints();
	this.gridBagConstraintsReferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReferencia.gridy = iYPanelCamposOcultosReferencia;
	this.gridBagConstraintsReferencia.gridx = iXPanelCamposOcultosReferencia++;
	this.gridBagConstraintsReferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosReferencia.add(this.jPanelid_empresaReferencia, this.gridBagConstraintsReferencia);



	if(iXPanelCamposOcultosReferencia % 1==0) {
		iXPanelCamposOcultosReferencia=0;
		iYPanelCamposOcultosReferencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesReferencia= new GridBagLayout();
		this.jPanelAccionesReferencia.setLayout(gridaBagLayoutAccionesReferencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioReferencia= new GridBagLayout();
		this.jPanelAccionesFormularioReferencia.setLayout(gridaBagLayoutAccionesFormularioReferencia);
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferencia.add(this.jComboBoxTiposAccionesFormularioReferencia, this.gridBagConstraintsReferencia);

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReferencia.add(this.jCheckBoxPostAccionNuevoReferencia, this.gridBagConstraintsReferencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.referenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferencia.add(this.jCheckBoxPostAccionSinCerrarReferencia, this.gridBagConstraintsReferencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.referenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.referenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReferencia.add(this.jCheckBoxPostAccionSinMensajeReferencia, this.gridBagConstraintsReferencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesReferencia.add(this.jButtonModificarReferencia, this.gridBagConstraintsReferencia);							

		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReferencia.gridy = 0;
		this.gridBagConstraintsReferencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesReferencia.add(this.jButtonEliminarReferencia, this.gridBagConstraintsReferencia);
		
			
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = 0;		
		this.gridBagConstraintsReferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferencia.add(this.jButtonActualizarReferencia, this.gridBagConstraintsReferencia);


		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = 0;		
		this.gridBagConstraintsReferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesReferencia.add(this.jButtonGuardarCambiosReferencia, this.gridBagConstraintsReferencia);	
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = 0;		
		this.gridBagConstraintsReferencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesReferencia.add(this.jButtonCancelarReferencia, this.gridBagConstraintsReferencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReferencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.referenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReferencia = new GridBagConstraints();						
			this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReferencia.gridx = 0;		
			//this.gridBagConstraintsReferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReferencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReferencia.gridx =0;
		this.gridBagConstraintsReferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReferencia, this.gridBagConstraintsReferencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ReferenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleReferencia = new ReferenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Referencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Referencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ReferenciaModel referenciaModel=new ReferenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//ReferenciaModel.ReferenciaFocusTraversalPolicy referenciaFocusTraversalPolicy = referenciaModel.new ReferenciaFocusTraversalPolicy(this);
			
			//referenciaFocusTraversalPolicy.setreferenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(referenciaModel);
			
			
			this.jContentPaneDetalleReferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleReferencia = new GridBagLayout();	
			this.jContentPaneDetalleReferencia.setLayout(gridaBagLayoutDetalleReferencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReferencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsReferencia = new GridBagConstraints();
				this.gridBagConstraintsReferencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsReferencia.gridx = 0;
					
				
				this.jContentPaneDetalleReferencia.add(jTtoolBarDetalleReferencia, gridBagConstraintsReferencia);								
				
}
			
			this.jScrollPanelDatosEdicionReferencia=   new JScrollPane(jContentPaneDetalleReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralReferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsReferencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsReferencia.gridx = 0;
	        
			this.jContentPaneDetalleReferencia.add(jPanelCamposReferencia, gridBagConstraintsReferencia);
			
			
			
			
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
						&& referenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameTelefonoReferencia(this.puedeCargarPorParteTelefonoReferencia,false,-1);
					
					if(this.referenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsReferencia= new GridBagConstraints();
						this.gridBagConstraintsReferencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsReferencia.gridx = 0;
						this.jContentPaneDetalleReferencia.add(this.jTabbedPaneRelacionesReferencia, this.gridBagConstraintsReferencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesReferencia.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameTelefonoReferencia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosReferencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsReferencia = new GridBagConstraints();
					this.gridBagConstraintsReferencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsReferencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsReferencia.gridx = 0;
					
				
					this.jContentPaneDetalleReferencia.add(jPanelCamposOcultosReferencia, gridBagConstraintsReferencia);
				
					this.jPanelCamposOcultosReferencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsReferencia.gridx = 0;
	        this.gridBagConstraintsReferencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleReferencia.add(this.jPanelAccionesFormularioReferencia, this.gridBagConstraintsReferencia);							
			
			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
	        this.gridBagConstraintsReferencia.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsReferencia.gridx = 0;
	        
			
			this.jContentPaneDetalleReferencia.add(this.jPanelAccionesReferencia, this.gridBagConstraintsReferencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionReferencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionReferencia=   new JScrollPane(this.jPanelCamposReferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsReferencia.gridx = 0;
			this.gridBagConstraintsReferencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsReferencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsReferencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionReferencia, this.gridBagConstraintsReferencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioReferencia, this.gridBagConstraintsReferencia);			
			
			this.gridBagConstraintsReferencia = new GridBagConstraints();
			this.gridBagConstraintsReferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesReferencia, this.gridBagConstraintsReferencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReferencia, this.gridBagConstraintsReferencia);
			
			
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReferencia, this.gridBagConstraintsReferencia);
		
			
		this.gridBagConstraintsReferencia = new GridBagConstraints();
		this.gridBagConstraintsReferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReferencia, this.gridBagConstraintsReferencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralReferencia;//jContentPane;
		
		return jScrollPanelDatosEdicionReferencia;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameTelefonoReferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.telefonoreferenciaSessionBean=new TelefonoReferenciaSessionBean();
		this.telefonoreferenciaSessionBean.setConGuardarRelaciones(false);
		this.telefonoreferenciaSessionBean.setEsGuardarRelacionado(true);

		this.telefonoreferenciaBeanSwingJInternalFrame=null;//new TelefonoReferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.telefonoreferenciaBeanSwingJInternalFramePopup=new TelefonoReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.telefonoreferenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {

				TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TelefonoReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.telefonoreferenciaSessionBean.setEsGuardarRelacionado(true);

				this.telefonoreferenciaBeanSwingJInternalFrame=new TelefonoReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.telefonoreferenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.telefonoreferenciaBeanSwingJInternalFrame.settelefonoreferenciaSessionBean(this.telefonoreferenciaSessionBean);

				//this.gridBagConstraintsReferencia = new GridBagConstraints();
				//this.gridBagConstraintsReferencia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsReferencia.gridx = 0;
				//this.jContentPaneDetalleReferencia.add(this.telefonoreferenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsReferencia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesReferencia.add("Telefono Referencias",this.telefonoreferenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesReferencia.setComponentAt(iIndexTab,this.telefonoreferenciaBeanSwingJInternalFrame.getContentPane());
				}

				//TelefonoReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.telefonoreferenciaSessionBean.setEsGuardarRelacionado(false);
				this.telefonoreferenciaBeanSwingJInternalFrame=null;//new TelefonoReferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.telefonoreferenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTelefonoReferencia) {
					this.jTabbedPaneRelacionesReferencia.add("Telefono Referencias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTelefonoReferenciaBeanSwingJInternalFrame(List<Referencia> referencias,Referencia referencia,TelefonoReferenciaBeanSwingJInternalFrame telefonoreferenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//telefonoreferenciaBeanSwingJInternalFrame=new TelefonoReferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					telefonoreferenciaBeanSwingJInternalFrame.getTelefonoReferenciaLogic().setConnexion(this.referenciaLogic.getConnexion());

					telefonoreferenciaBeanSwingJInternalFrame.setreferenciasForeignKey(referencias);
					telefonoreferenciaBeanSwingJInternalFrame.setreferenciaForeignKey(referencia);
					telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.setisBusquedaDesdeForeignKeySesionReferencia(true);
					telefonoreferenciaBeanSwingJInternalFrame.telefonoreferenciaSessionBean.setlidReferenciaActual(referencia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					telefonoreferenciaBeanSwingJInternalFrame.cargarCombosForeignKeyTelefonoReferencia(telefonoreferenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					telefonoreferenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaReferencia(true);
					telefonoreferenciaBeanSwingJInternalFrame.setid_referenciaFK_IdReferencia(referencia.getId());

					if(!this.conCargarFormDetalle) {
						telefonoreferenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					telefonoreferenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameReferenciaForeignKey(referencia,1,false,true,true);
					telefonoreferenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					telefonoreferenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdReferencia");
					telefonoreferenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdReferencia");
					telefonoreferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefonoReferencia(true);
					telefonoreferenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTelefonoReferencia("n",telefonoreferenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, telefonoreferenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					telefonoreferenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					telefonoreferenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						telefonoreferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTelefonoReferencia("relacionado");
					} else {
						telefonoreferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsTelefonoReferencia("no_relacionado");
					}

					telefonoreferenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionTelefonoReferencia().setVisible(false);

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
