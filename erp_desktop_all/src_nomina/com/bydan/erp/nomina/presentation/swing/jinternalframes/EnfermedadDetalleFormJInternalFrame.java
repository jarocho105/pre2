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
import com.bydan.erp.nomina.util.EnfermedadConstantesFunciones;

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
public class EnfermedadDetalleFormJInternalFrame extends EnfermedadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEnfermedad;
	
	protected JMenuBar jmenuBarDetalleEnfermedad;
	
	protected JMenu jmenuDetalleEnfermedad;
	protected JMenu jmenuDetalleArchivoEnfermedad;
	protected JMenu jmenuDetalleAccionesEnfermedad;
	protected JMenu jmenuDetalleDatosEnfermedad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEnfermedad;	
	protected GridBagConstraints gridBagConstraintsEnfermedad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EnfermedadBeanSwingJInternalFrameAdditional jInternalFrameDetalleEnfermedad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoEnfermedadBeanSwingJInternalFrame tipoenfermedadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoenfermedad="";
	
	public EnfermedadSessionBean enfermedadSessionBean;
	
	

	public EmpleadoEnferBeanSwingJInternalFrame empleadoenferBeanSwingJInternalFrame=null;
	public EmpleadoEnferBeanSwingJInternalFrame empleadoenferBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoEnfer=false;
	public EmpleadoEnferSessionBean empleadoenferSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoEnfermedadSessionBean tipoenfermedadSessionBean;	
	
	public EnfermedadLogic enfermedadLogic;
	
	public JScrollPane jScrollPanelDatosEnfermedad;
	public JScrollPane jScrollPanelDatosEdicionEnfermedad;
	public JScrollPane jScrollPanelDatosGeneralEnfermedad;
	
	protected JPanel jPanelCamposEnfermedad;    
	protected JPanel jPanelCamposOcultosEnfermedad;    	
	protected JPanel jPanelAccionesEnfermedad;
	protected JPanel jPanelAccionesFormularioEnfermedad;
    
	
	
	protected Integer iXPanelCamposEnfermedad=0;
	protected Integer iYPanelCamposEnfermedad=0;
	
	protected Integer iXPanelCamposOcultosEnfermedad=0;
	protected Integer iYPanelCamposOcultosEnfermedad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEnfermedad;
	public JButton jButtonModificarEnfermedad;
	public JButton jButtonActualizarEnfermedad;
    public JButton jButtonEliminarEnfermedad;
	public JButton jButtonCancelarEnfermedad;
    public JButton jButtonGuardarCambiosEnfermedad;
	public JButton jButtonGuardarCambiosTablaEnfermedad;
	protected JButton jButtonCerrarEnfermedad;
	
	
	protected JButton jButtonProcesarInformacionEnfermedad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEnfermedad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEnfermedad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEnfermedad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEnfermedad;
	protected JButton jButtonModificarToolBarEnfermedad;
	protected JButton jButtonActualizarToolBarEnfermedad;
    protected JButton jButtonEliminarToolBarEnfermedad;
	protected JButton jButtonCancelarToolBarEnfermedad;
    protected JButton jButtonGuardarCambiosToolBarEnfermedad;
	protected JButton jButtonGuardarCambiosTablaToolBarEnfermedad;
	protected JButton jButtonMostrarOcultarTablaToolBarEnfermedad;
	protected JButton jButtonCerrarToolBarEnfermedad;
	
	protected JButton jButtonProcesarInformacionToolBarEnfermedad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEnfermedad;
	protected JMenuItem jMenuItemModificarEnfermedad;
	protected JMenuItem jMenuItemActualizarEnfermedad;
    protected JMenuItem jMenuItemEliminarEnfermedad;
	protected JMenuItem jMenuItemCancelarEnfermedad;
    protected JMenuItem jMenuItemGuardarCambiosEnfermedad;
	protected JMenuItem jMenuItemGuardarCambiosTablaEnfermedad;
	protected JMenuItem jMenuItemCerrarEnfermedad;
	protected JMenuItem jMenuItemDetalleCerrarEnfermedad;
	protected JMenuItem jMenuItemDetalleMostarOcultarEnfermedad;
	
	protected JMenuItem jMenuItemProcesarInformacionEnfermedad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEnfermedad;
	protected JMenuItem jMenuItemMostrarOcultarEnfermedad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEnfermedad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEnfermedad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEnfermedad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEnfermedad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEnfermedad;
	public JLabel jLabelIdEnfermedad;
	public JLabel jLabelidEnfermedad;
	public JButton jButtonidEnfermedadBusqueda= new JButtonMe();

	public JPanel jPanelnombreEnfermedad;
	public JLabel jLabelnombreEnfermedad;
	public JTextArea jTextAreanombreEnfermedad;
	public JScrollPane jscrollPanenombreEnfermedad;
	public JButton jButtonnombreEnfermedadBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEnfermedad;
	public JLabel jLabeldescripcionEnfermedad;
	public JTextArea jTextAreadescripcionEnfermedad;
	public JScrollPane jscrollPanedescripcionEnfermedad;
	public JButton jButtondescripcionEnfermedadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEnfermedad;
	public JLabel jLabelid_empresaEnfermedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEnfermedad;
	public JButton jButtonid_empresaEnfermedad= new JButtonMe();
	public JButton jButtonid_empresaEnfermedadUpdate= new JButtonMe();
	public JButton jButtonid_empresaEnfermedadBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_enfermedadEnfermedad;
	public JLabel jLabelid_tipo_enfermedadEnfermedad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_enfermedadEnfermedad;
	public JButton jButtonid_tipo_enfermedadEnfermedad= new JButtonMe();
	public JButton jButtonid_tipo_enfermedadEnfermedadUpdate= new JButtonMe();
	public JButton jButtonid_tipo_enfermedadEnfermedadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEnfermedad;
	
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
	
	public EnfermedadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEnfermedad=new JPanel();
				this.jPanelAccionesFormularioEnfermedad=new JPanel();
				this.jmenuBarDetalleEnfermedad=new JMenuBar();
				this.jTtoolBarDetalleEnfermedad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EnfermedadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EnfermedadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EnfermedadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EnfermedadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EnfermedadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Enfermedad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEnfermedad() {
		return this.jButtonActualizarToolBarEnfermedad;
	}
	
	public JButton getjButtonEliminarToolBarEnfermedad() {
		return this.jButtonEliminarToolBarEnfermedad;
	}
	
	public JButton getjButtonCancelarToolBarEnfermedad() {
		return this.jButtonCancelarToolBarEnfermedad;
	}		
	
	public JButton getjButtonProcesarInformacionEnfermedad() {
		return this.jButtonProcesarInformacionEnfermedad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEnfermedad)	{
		this.jButtonProcesarInformacionEnfermedad = jButtonProcesarInformacionEnfermedad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEnfermedad() {
		return this.jComboBoxTiposAccionesEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEnfermedad(
			JComboBox jComboBoxTiposRelacionesEnfermedad) {
		this.jComboBoxTiposRelacionesEnfermedad = jComboBoxTiposRelacionesEnfermedad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEnfermedad(
			JComboBox jComboBoxTiposAccionesEnfermedad) {
		this.jComboBoxTiposAccionesEnfermedad = jComboBoxTiposAccionesEnfermedad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEnfermedad() {
		return this.jComboBoxTiposAccionesFormularioEnfermedad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEnfermedad(
			JComboBox jComboBoxTiposAccionesFormularioEnfermedad) {
		this.jComboBoxTiposAccionesFormularioEnfermedad = jComboBoxTiposAccionesFormularioEnfermedad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.enfermedadSessionBean=new EnfermedadSessionBean();
		
		this.enfermedadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.enfermedadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.enfermedadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EnfermedadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Enfermedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
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
	
		EnfermedadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEnfermedad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEnfermedad=new JButtonMe();
				this.jButtonModificarToolBarEnfermedad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEnfermedad,this.jTtoolBarDetalleEnfermedad,
							"actualizar","actualizar","Actualizar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEnfermedad,this.jTtoolBarDetalleEnfermedad,
							"eliminar","eliminar","Eliminar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEnfermedad,this.jTtoolBarDetalleEnfermedad,
							"cancelar","cancelar","Cancelar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEnfermedad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEnfermedad,this.jTtoolBarDetalleEnfermedad,
							"guardarcambios","guardarcambios","Guardar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEnfermedad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEnfermedad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEnfermedad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEnfermedad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEnfermedad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEnfermedad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEnfermedad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEnfermedad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEnfermedad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEnfermedad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEnfermedad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEnfermedad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEnfermedad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEnfermedad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEnfermedad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEnfermedad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEnfermedad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEnfermedad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEnfermedad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEnfermedad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEnfermedad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEnfermedad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEnfermedad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEnfermedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEnfermedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEnfermedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEnfermedad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEnfermedad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEnfermedad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEnfermedad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEnfermedad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEnfermedad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEnfermedad.add(this.jMenuItemDetalleCerrarEnfermedad);
		
		this.jmenuDetalleAccionesEnfermedad.add(this.jMenuItemActualizarEnfermedad);
		this.jmenuDetalleAccionesEnfermedad.add(this.jMenuItemEliminarEnfermedad);
		this.jmenuDetalleAccionesEnfermedad.add(this.jMenuItemCancelarEnfermedad);		
		
		//this.jmenuDetalleDatosEnfermedad.add(this.jMenuItemDetalleAbrirOrderByEnfermedad);				
		this.jmenuDetalleDatosEnfermedad.add(this.jMenuItemDetalleMostarOcultarEnfermedad);				
				
		//this.jmenuDetalleAccionesEnfermedad.add(this.jMenuItemGuardarCambiosEnfermedad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEnfermedad.add(this.jmenuDetalleArchivoEnfermedad);		
		this.jmenuBarDetalleEnfermedad.add(this.jmenuDetalleAccionesEnfermedad);		
		this.jmenuBarDetalleEnfermedad.add(this.jmenuDetalleDatosEnfermedad);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEnfermedad.add(this.jmenuDetalleEnfermedad);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEnfermedad);				
	}
	
	
	public void inicializarElementosCamposEnfermedad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEnfermedad = new JLabelMe();
		jLabelIdEnfermedad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEnfermedad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEnfermedad.setToolTipText(EnfermedadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEnfermedad= new GridBagLayout();

		this.jPanelidEnfermedad.setLayout(this.gridaBagLayoutEnfermedad);

		jLabelidEnfermedad = new JLabel();
		jLabelidEnfermedad.setText("Id");

		jLabelidEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreEnfermedad = new JLabelMe();
		this.jLabelnombreEnfermedad.setText(""+EnfermedadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEnfermedad.setToolTipText("Nombre");
		this.jLabelnombreEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEnfermedad.setToolTipText(EnfermedadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEnfermedad = new GridBagLayout();
		this.jPanelnombreEnfermedad.setLayout(this.gridaBagLayoutEnfermedad);


		jTextAreanombreEnfermedad= new JTextAreaMe();
		jTextAreanombreEnfermedad.setEnabled(false);
		jTextAreanombreEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEnfermedad.setLineWrap(true);
		jTextAreanombreEnfermedad.setWrapStyleWord(true);
		jTextAreanombreEnfermedad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEnfermedad.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEnfermedad = new JScrollPane(jTextAreanombreEnfermedad);
		jscrollPanenombreEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEnfermedadBusqueda= new JButtonMe();
		this.jButtonnombreEnfermedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEnfermedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEnfermedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEnfermedadBusqueda.setText("U");
		this.jButtonnombreEnfermedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEnfermedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEnfermedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEnfermedadBusqueda"));

		if(this.enfermedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEnfermedadBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEnfermedad = new JLabelMe();
		this.jLabeldescripcionEnfermedad.setText(""+EnfermedadConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionEnfermedad.setToolTipText("Descripcion");
		this.jLabeldescripcionEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEnfermedad.setToolTipText(EnfermedadConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEnfermedad = new GridBagLayout();
		this.jPaneldescripcionEnfermedad.setLayout(this.gridaBagLayoutEnfermedad);


		jTextAreadescripcionEnfermedad= new JTextAreaMe();
		jTextAreadescripcionEnfermedad.setEnabled(false);
		jTextAreadescripcionEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEnfermedad.setLineWrap(true);
		jTextAreadescripcionEnfermedad.setWrapStyleWord(true);
		jTextAreadescripcionEnfermedad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEnfermedad.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEnfermedad = new JScrollPane(jTextAreadescripcionEnfermedad);
		jscrollPanedescripcionEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionEnfermedadBusqueda= new JButtonMe();
		this.jButtondescripcionEnfermedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEnfermedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEnfermedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEnfermedadBusqueda.setText("U");
		this.jButtondescripcionEnfermedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEnfermedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEnfermedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEnfermedadBusqueda"));

		if(this.enfermedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEnfermedadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEnfermedad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEnfermedad = new JLabelMe();
		this.jLabelid_empresaEnfermedad.setText(""+EnfermedadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEnfermedad.setToolTipText("Empresa");
		this.jLabelid_empresaEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEnfermedad.setToolTipText(EnfermedadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEnfermedad = new GridBagLayout();
		this.jPanelid_empresaEnfermedad.setLayout(this.gridaBagLayoutEnfermedad);


		jComboBoxid_empresaEnfermedad= new JComboBoxMe();
		jComboBoxid_empresaEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEnfermedad.setEnabled(false);

		this.jButtonid_empresaEnfermedad= new JButtonMe();
		this.jButtonid_empresaEnfermedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEnfermedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEnfermedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEnfermedad.setText("Buscar");
		this.jButtonid_empresaEnfermedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEnfermedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEnfermedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEnfermedad"));

		this.jButtonid_empresaEnfermedadBusqueda= new JButtonMe();
		this.jButtonid_empresaEnfermedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEnfermedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEnfermedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEnfermedadBusqueda.setText("U");
		this.jButtonid_empresaEnfermedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEnfermedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEnfermedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEnfermedadBusqueda"));

		if(this.enfermedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEnfermedadBusqueda.setVisible(false);		}

		this.jButtonid_empresaEnfermedadUpdate= new JButtonMe();
		this.jButtonid_empresaEnfermedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEnfermedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEnfermedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEnfermedadUpdate.setText("U");
		this.jButtonid_empresaEnfermedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEnfermedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEnfermedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEnfermedadUpdate"));



					
		this.jLabelid_tipo_enfermedadEnfermedad = new JLabelMe();
		this.jLabelid_tipo_enfermedadEnfermedad.setText(""+EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD+" : *");
		this.jLabelid_tipo_enfermedadEnfermedad.setToolTipText("Tipo Enfermedad");
		this.jLabelid_tipo_enfermedadEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_enfermedadEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_enfermedadEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_enfermedadEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_enfermedadEnfermedad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_enfermedadEnfermedad.setToolTipText(EnfermedadConstantesFunciones.LABEL_IDTIPOENFERMEDAD);
		this.gridaBagLayoutEnfermedad = new GridBagLayout();
		this.jPanelid_tipo_enfermedadEnfermedad.setLayout(this.gridaBagLayoutEnfermedad);


		jComboBoxid_tipo_enfermedadEnfermedad= new JComboBoxMe();
		jComboBoxid_tipo_enfermedadEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_enfermedadEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_enfermedadEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_enfermedadEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_enfermedadEnfermedad= new JButtonMe();
		this.jButtonid_tipo_enfermedadEnfermedad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_enfermedadEnfermedad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_enfermedadEnfermedad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_enfermedadEnfermedad.setText("Buscar");
		this.jButtonid_tipo_enfermedadEnfermedad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_enfermedadEnfermedad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_enfermedadEnfermedad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_enfermedadEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_enfermedadEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_enfermedadEnfermedad"));

		this.jButtonid_tipo_enfermedadEnfermedadBusqueda= new JButtonMe();
		this.jButtonid_tipo_enfermedadEnfermedadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_enfermedadEnfermedadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_enfermedadEnfermedadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_enfermedadEnfermedadBusqueda.setText("U");
		this.jButtonid_tipo_enfermedadEnfermedadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_enfermedadEnfermedadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_enfermedadEnfermedadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_enfermedadEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_enfermedadEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_enfermedadEnfermedadBusqueda"));

		if(this.enfermedadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_enfermedadEnfermedadBusqueda.setVisible(false);		}

		this.jButtonid_tipo_enfermedadEnfermedadUpdate= new JButtonMe();
		this.jButtonid_tipo_enfermedadEnfermedadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_enfermedadEnfermedadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_enfermedadEnfermedadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_enfermedadEnfermedadUpdate.setText("U");
		this.jButtonid_tipo_enfermedadEnfermedadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_enfermedadEnfermedadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_enfermedadEnfermedadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_enfermedadEnfermedad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_enfermedadEnfermedad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_enfermedadEnfermedadUpdate"));



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
		//this.jInternalFrameDetalleEnfermedad = new EnfermedadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Enfermedad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEnfermedad= new GridBagLayout();
		

		
		String sToolTipEnfermedad="";
		sToolTipEnfermedad=EnfermedadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEnfermedad+="(Nomina.Enfermedad)";
		}
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			sToolTipEnfermedad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEnfermedad = new JButtonMe();
		this.jButtonModificarEnfermedad = new JButtonMe();
        this.jButtonActualizarEnfermedad = new JButtonMe();
        this.jButtonEliminarEnfermedad = new JButtonMe();
        this.jButtonCancelarEnfermedad = new JButtonMe();
        this.jButtonGuardarCambiosEnfermedad = new JButtonMe();
		this.jButtonGuardarCambiosTablaEnfermedad = new JButtonMe();
		this.jButtonCerrarEnfermedad = new JButtonMe();
		
		this.jScrollPanelDatosEnfermedad = new JScrollPane();   
        this.jScrollPanelDatosEdicionEnfermedad = new JScrollPane();
		this.jScrollPanelDatosGeneralEnfermedad = new JScrollPane();
				
		
		
		this.jPanelCamposEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Enfermedad";
		
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Enfermedades" + this.sPath));
		} else {
			this.jScrollPanelDatosEnfermedad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEnfermedad.setName("jPanelCamposEnfermedad"); 

		this.jPanelCamposOcultosEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEnfermedad.setName("jPanelCamposOcultosEnfermedad"); 

        this.jPanelAccionesEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEnfermedad.setToolTipText("Acciones");
        this.jPanelAccionesEnfermedad.setName("Acciones"); 

		this.jPanelAccionesFormularioEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEnfermedad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEnfermedad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEnfermedad.setText("Nuevo");
		this.jButtonModificarEnfermedad.setText("Editar");
        this.jButtonActualizarEnfermedad.setText("Actualizar");
        this.jButtonEliminarEnfermedad.setText("Eliminar");
        this.jButtonCancelarEnfermedad.setText("Cancelar");
        this.jButtonGuardarCambiosEnfermedad.setText("Guardar");
		this.jButtonGuardarCambiosTablaEnfermedad.setText("Guardar");
		this.jButtonCerrarEnfermedad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEnfermedad,"nuevo_button","Nuevo",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEnfermedad,"modificar_button","Editar",this.enfermedadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEnfermedad,"actualizar_button","Actualizar",this.enfermedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEnfermedad,"eliminar_button","Eliminar",this.enfermedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEnfermedad,"cancelar_button","Cancelar",this.enfermedadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEnfermedad,"guardarcambios_button","Guardar",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEnfermedad,"guardarcambiostabla_button","Guardar",this.enfermedadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEnfermedad,"cerrar_button","Salir",this.enfermedadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEnfermedad.setToolTipText("Nuevo"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEnfermedad.setToolTipText("Editar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEnfermedad.setToolTipText("Actualizar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEnfermedad.setToolTipText("Eliminar)"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEnfermedad.setToolTipText("Cancelar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEnfermedad.setToolTipText("Guardar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEnfermedad.setToolTipText("Guardar"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEnfermedad.setToolTipText("Salir"+" "+EnfermedadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEnfermedad";
		inputMap = this.jButtonNuevoEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEnfermedad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEnfermedad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEnfermedad";
		inputMap = this.jButtonActualizarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEnfermedad"));
		
		//ELIMINAR
		sMapKey = "EliminarEnfermedad";
		inputMap = this.jButtonEliminarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEnfermedad"));
		
		//CANCELAR	
		sMapKey = "CancelarEnfermedad";
		inputMap = this.jButtonCancelarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEnfermedad"));
		
		//CERRAR		
		sMapKey = "CerrarEnfermedad";
		inputMap = this.jButtonCerrarEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEnfermedad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEnfermedad";
		inputMap = this.jButtonGuardarCambiosTablaEnfermedad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEnfermedad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEnfermedad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEnfermedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEnfermedad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEnfermedad.setToolTipText("Nuevo Enfermedad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEnfermedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEnfermedad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEnfermedad.setToolTipText("Sin Cerrar Ventana Enfermedad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEnfermedad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEnfermedad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEnfermedad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEnfermedad.setText("Accion");
		this.jComboBoxTiposAccionesEnfermedad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEnfermedad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEnfermedad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEnfermedad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEnfermedad = new JLabelMe();
		
		this.jLabelAccionesEnfermedad.setText("Acciones");		
		this.jLabelAccionesEnfermedad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEnfermedad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEnfermedad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEnfermedad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEnfermedad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEnfermedad=new JTabbedPane();
		this.jTabbedPaneRelacionesEnfermedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEnfermedad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEnfermedad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEnfermedad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEnfermedad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEnfermedad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEnfermedad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEnfermedad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEnfermedad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEnfermedad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEnfermedad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEnfermedad = new GridBagLayout();
		
		this.jPanelCamposEnfermedad.setLayout(gridaBagLayoutCamposEnfermedad);
		this.jPanelCamposOcultosEnfermedad.setLayout(gridaBagLayoutCamposOcultosEnfermedad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 0;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEnfermedad.add(jLabelIdEnfermedad, this.gridBagConstraintsEnfermedad);



	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 1;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEnfermedad.add(jLabelidEnfermedad, this.gridBagConstraintsEnfermedad);


	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 0;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEnfermedad.add(jLabelid_empresaEnfermedad, this.gridBagConstraintsEnfermedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = 2;
		this.gridBagConstraintsEnfermedad.ipadx = 0;
		this.gridBagConstraintsEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEnfermedad.add(jButtonid_empresaEnfermedadBusqueda, this.gridBagConstraintsEnfermedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = 3;
		this.gridBagConstraintsEnfermedad.ipadx = 0;
		this.gridBagConstraintsEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEnfermedad.add(jButtonid_empresaEnfermedadUpdate, this.gridBagConstraintsEnfermedad);
	}

	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 1;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEnfermedad.add(jComboBoxid_empresaEnfermedad, this.gridBagConstraintsEnfermedad);


	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 0;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_enfermedadEnfermedad.add(jLabelid_tipo_enfermedadEnfermedad, this.gridBagConstraintsEnfermedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = 2;
		this.gridBagConstraintsEnfermedad.ipadx = 0;
		this.gridBagConstraintsEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_enfermedadEnfermedad.add(jButtonid_tipo_enfermedadEnfermedadBusqueda, this.gridBagConstraintsEnfermedad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = 3;
		this.gridBagConstraintsEnfermedad.ipadx = 0;
		this.gridBagConstraintsEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_enfermedadEnfermedad.add(jButtonid_tipo_enfermedadEnfermedadUpdate, this.gridBagConstraintsEnfermedad);
	}

	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 1;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_enfermedadEnfermedad.add(jComboBoxid_tipo_enfermedadEnfermedad, this.gridBagConstraintsEnfermedad);


	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 0;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEnfermedad.add(jLabelnombreEnfermedad, this.gridBagConstraintsEnfermedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = 2;
		this.gridBagConstraintsEnfermedad.ipadx = 0;
		this.gridBagConstraintsEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEnfermedad.add(jButtonnombreEnfermedadBusqueda, this.gridBagConstraintsEnfermedad);
	}

	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 1;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEnfermedad.add(jscrollPanenombreEnfermedad, this.gridBagConstraintsEnfermedad);


	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 0;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEnfermedad.add(jLabeldescripcionEnfermedad, this.gridBagConstraintsEnfermedad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		//this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = 2;
		this.gridBagConstraintsEnfermedad.ipadx = 0;
		this.gridBagConstraintsEnfermedad.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEnfermedad.add(jButtondescripcionEnfermedadBusqueda, this.gridBagConstraintsEnfermedad);
	}

	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEnfermedad.gridy = 0;
	this.gridBagConstraintsEnfermedad.gridx = 1;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEnfermedad.add(jscrollPanedescripcionEnfermedad, this.gridBagConstraintsEnfermedad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEnfermedad.gridy = iYPanelCamposEnfermedad;
	this.gridBagConstraintsEnfermedad.gridx = iXPanelCamposEnfermedad++;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEnfermedad.add(this.jPanelidEnfermedad, this.gridBagConstraintsEnfermedad);



	if(iXPanelCamposEnfermedad % 1==0) {
		iXPanelCamposEnfermedad=0;
		iYPanelCamposEnfermedad++;
	}
	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEnfermedad.gridy = iYPanelCamposEnfermedad;
	this.gridBagConstraintsEnfermedad.gridx = iXPanelCamposEnfermedad++;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEnfermedad.add(this.jPanelid_tipo_enfermedadEnfermedad, this.gridBagConstraintsEnfermedad);



	if(iXPanelCamposEnfermedad % 1==0) {
		iXPanelCamposEnfermedad=0;
		iYPanelCamposEnfermedad++;
	}
	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEnfermedad.gridy = iYPanelCamposEnfermedad;
	this.gridBagConstraintsEnfermedad.gridx = iXPanelCamposEnfermedad++;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEnfermedad.add(this.jPanelnombreEnfermedad, this.gridBagConstraintsEnfermedad);



	if(iXPanelCamposEnfermedad % 1==0) {
		iXPanelCamposEnfermedad=0;
		iYPanelCamposEnfermedad++;
	}
	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEnfermedad.gridy = iYPanelCamposEnfermedad;
	this.gridBagConstraintsEnfermedad.gridx = iXPanelCamposEnfermedad++;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEnfermedad.add(this.jPaneldescripcionEnfermedad, this.gridBagConstraintsEnfermedad);



	if(iXPanelCamposEnfermedad % 1==0) {
		iXPanelCamposEnfermedad=0;
		iYPanelCamposEnfermedad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEnfermedad.gridy = iYPanelCamposOcultosEnfermedad;
	this.gridBagConstraintsEnfermedad.gridx = iXPanelCamposOcultosEnfermedad++;
	this.gridBagConstraintsEnfermedad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEnfermedad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEnfermedad.add(this.jPanelid_empresaEnfermedad, this.gridBagConstraintsEnfermedad);



	if(iXPanelCamposOcultosEnfermedad % 1==0) {
		iXPanelCamposOcultosEnfermedad=0;
		iYPanelCamposOcultosEnfermedad++;
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
			
		GridBagLayout gridaBagLayoutAccionesEnfermedad= new GridBagLayout();
		this.jPanelAccionesEnfermedad.setLayout(gridaBagLayoutAccionesEnfermedad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEnfermedad= new GridBagLayout();
		this.jPanelAccionesFormularioEnfermedad.setLayout(gridaBagLayoutAccionesFormularioEnfermedad);
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEnfermedad.add(this.jComboBoxTiposAccionesFormularioEnfermedad, this.gridBagConstraintsEnfermedad);

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEnfermedad.add(this.jCheckBoxPostAccionNuevoEnfermedad, this.gridBagConstraintsEnfermedad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.enfermedadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEnfermedad.add(this.jCheckBoxPostAccionSinCerrarEnfermedad, this.gridBagConstraintsEnfermedad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.enfermedadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.enfermedadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEnfermedad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEnfermedad.add(this.jCheckBoxPostAccionSinMensajeEnfermedad, this.gridBagConstraintsEnfermedad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx = iPosXAccion++;
			
		this.jPanelAccionesEnfermedad.add(this.jButtonModificarEnfermedad, this.gridBagConstraintsEnfermedad);							

		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEnfermedad.gridy = 0;
		this.gridBagConstraintsEnfermedad.gridx =iPosXAccion++;
			
		this.jPanelAccionesEnfermedad.add(this.jButtonEliminarEnfermedad, this.gridBagConstraintsEnfermedad);
		
			
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = 0;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXAccion++;
		
		this.jPanelAccionesEnfermedad.add(this.jButtonActualizarEnfermedad, this.gridBagConstraintsEnfermedad);


		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = 0;		
		this.gridBagConstraintsEnfermedad.gridx = iPosXAccion++;
		
		this.jPanelAccionesEnfermedad.add(this.jButtonGuardarCambiosEnfermedad, this.gridBagConstraintsEnfermedad);	
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = 0;		
		this.gridBagConstraintsEnfermedad.gridx =iPosXAccion++;
		
		this.jPanelAccionesEnfermedad.add(this.jButtonCancelarEnfermedad, this.gridBagConstraintsEnfermedad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEnfermedad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEnfermedad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.enfermedadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();						
			this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEnfermedad.gridx = 0;		
			//this.gridBagConstraintsEnfermedad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEnfermedad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEnfermedad.gridx =0;
		this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEnfermedad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEnfermedad, this.gridBagConstraintsEnfermedad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EnfermedadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEnfermedad = new EnfermedadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Enfermedad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Enfermedad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Enfermedad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EnfermedadModel enfermedadModel=new EnfermedadModel(this);
			
			//SI USARA CLASE INTERNA
			//EnfermedadModel.EnfermedadFocusTraversalPolicy enfermedadFocusTraversalPolicy = enfermedadModel.new EnfermedadFocusTraversalPolicy(this);
			
			//enfermedadFocusTraversalPolicy.setenfermedadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(enfermedadModel);
			
			
			this.jContentPaneDetalleEnfermedad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEnfermedad = new GridBagLayout();	
			this.jContentPaneDetalleEnfermedad.setLayout(gridaBagLayoutDetalleEnfermedad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEnfermedad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEnfermedad = new GridBagConstraints();
				this.gridBagConstraintsEnfermedad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEnfermedad.gridx = 0;
					
				
				this.jContentPaneDetalleEnfermedad.add(jTtoolBarDetalleEnfermedad, gridBagConstraintsEnfermedad);								
				
}
			
			this.jScrollPanelDatosEdicionEnfermedad=   new JScrollPane(jContentPaneDetalleEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEnfermedad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEnfermedad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEnfermedad.gridx = 0;
	        
			this.jContentPaneDetalleEnfermedad.add(jPanelCamposEnfermedad, gridBagConstraintsEnfermedad);
			
			
			
			
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
						&& enfermedadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEnfer(this.puedeCargarPorParteEmpleadoEnfer,false,-1);
					
					if(this.enfermedadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEnfermedad= new GridBagConstraints();
						this.gridBagConstraintsEnfermedad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEnfermedad.gridx = 0;
						this.jContentPaneDetalleEnfermedad.add(this.jTabbedPaneRelacionesEnfermedad, this.gridBagConstraintsEnfermedad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEnfermedad.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoEnfer(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEnfermedad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEnfermedad = new GridBagConstraints();
					this.gridBagConstraintsEnfermedad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEnfermedad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEnfermedad.gridx = 0;
					
				
					this.jContentPaneDetalleEnfermedad.add(jPanelCamposOcultosEnfermedad, gridBagConstraintsEnfermedad);
				
					this.jPanelCamposOcultosEnfermedad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEnfermedad.gridx = 0;
	        this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEnfermedad.add(this.jPanelAccionesFormularioEnfermedad, this.gridBagConstraintsEnfermedad);							
			
			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
	        this.gridBagConstraintsEnfermedad.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEnfermedad.gridx = 0;
	        
			
			this.jContentPaneDetalleEnfermedad.add(this.jPanelAccionesEnfermedad, this.gridBagConstraintsEnfermedad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEnfermedad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEnfermedad=   new JScrollPane(this.jPanelCamposEnfermedad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEnfermedad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEnfermedad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEnfermedad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEnfermedad.gridx = 0;
			this.gridBagConstraintsEnfermedad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEnfermedad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEnfermedad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEnfermedad, this.gridBagConstraintsEnfermedad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEnfermedad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEnfermedad, this.gridBagConstraintsEnfermedad);			
			
			this.gridBagConstraintsEnfermedad = new GridBagConstraints();
			this.gridBagConstraintsEnfermedad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEnfermedad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEnfermedad, this.gridBagConstraintsEnfermedad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEnfermedad, this.gridBagConstraintsEnfermedad);
			
			
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEnfermedad, this.gridBagConstraintsEnfermedad);
		
			
		this.gridBagConstraintsEnfermedad = new GridBagConstraints();
		this.gridBagConstraintsEnfermedad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEnfermedad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEnfermedad, this.gridBagConstraintsEnfermedad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEnfermedad;//jContentPane;
		
		return jScrollPanelDatosEdicionEnfermedad;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoEnfer(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoenferSessionBean=new EmpleadoEnferSessionBean();
		this.empleadoenferSessionBean.setConGuardarRelaciones(false);
		this.empleadoenferSessionBean.setEsGuardarRelacionado(true);

		this.empleadoenferBeanSwingJInternalFrame=null;//new EmpleadoEnferBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoenferBeanSwingJInternalFramePopup=new EmpleadoEnferBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoenferBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {

				EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL=EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoEnferJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EnfermedadJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoenferSessionBean.setEsGuardarRelacionado(true);

				this.empleadoenferBeanSwingJInternalFrame=new EmpleadoEnferBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoenferBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoenferBeanSwingJInternalFrame.setempleadoenferSessionBean(this.empleadoenferSessionBean);

				//this.gridBagConstraintsEnfermedad = new GridBagConstraints();
				//this.gridBagConstraintsEnfermedad.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEnfermedad.gridx = 0;
				//this.jContentPaneDetalleEnfermedad.add(this.empleadoenferBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEnfermedad);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEnfermedad.add("Empleado Enferes",this.empleadoenferBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEnfermedad.setComponentAt(iIndexTab,this.empleadoenferBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoEnferJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoenferSessionBean.setEsGuardarRelacionado(false);
				this.empleadoenferBeanSwingJInternalFrame=null;//new EmpleadoEnferBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoenferSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoEnfer) {
					this.jTabbedPaneRelacionesEnfermedad.add("Empleado Enferes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoEnferBeanSwingJInternalFrame(List<Enfermedad> enfermedads,Enfermedad enfermedad,EmpleadoEnferBeanSwingJInternalFrame empleadoenferBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoenferBeanSwingJInternalFrame=new EmpleadoEnferBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoenferBeanSwingJInternalFrame.getEmpleadoEnferLogic().setConnexion(this.enfermedadLogic.getConnexion());

					empleadoenferBeanSwingJInternalFrame.setenfermedadsForeignKey(enfermedads);
					empleadoenferBeanSwingJInternalFrame.setenfermedadForeignKey(enfermedad);
					empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setisBusquedaDesdeForeignKeySesionEnfermedad(true);
					empleadoenferBeanSwingJInternalFrame.empleadoenferSessionBean.setlidEnfermedadActual(enfermedad.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoenferBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoEnfer(empleadoenferBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoenferBeanSwingJInternalFrame.setVisibilidadBusquedasParaEnfermedad(true);
					empleadoenferBeanSwingJInternalFrame.setid_enfermedadFK_IdEnfermedad(enfermedad.getId());

					if(!this.conCargarFormDetalle) {
						empleadoenferBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoenferBeanSwingJInternalFrame.setSelectedItemCombosFrameEnfermedadForeignKey(enfermedad,1,false,true,true);
					empleadoenferBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoenferBeanSwingJInternalFrame.procesarBusqueda("FK_IdEnfermedad");
					empleadoenferBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEnfermedad");
					empleadoenferBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEnfer(true);
					empleadoenferBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoEnfer("n",empleadoenferBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoenferBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoenferBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoenferBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoenferBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEnfer("relacionado");
					} else {
						empleadoenferBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEnfer("no_relacionado");
					}

					empleadoenferBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoEnfer().setVisible(false);

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
