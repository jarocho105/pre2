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
import com.bydan.erp.nomina.util.HerramientaConstantesFunciones;

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
public class HerramientaDetalleFormJInternalFrame extends HerramientaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHerramienta;
	
	protected JMenuBar jmenuBarDetalleHerramienta;
	
	protected JMenu jmenuDetalleHerramienta;
	protected JMenu jmenuDetalleArchivoHerramienta;
	protected JMenu jmenuDetalleAccionesHerramienta;
	protected JMenu jmenuDetalleDatosHerramienta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHerramienta;	
	protected GridBagConstraints gridBagConstraintsHerramienta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HerramientaBeanSwingJInternalFrameAdditional jInternalFrameDetalleHerramienta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public HerramientaSessionBean herramientaSessionBean;
	
	

	public EmpleadoHerraBeanSwingJInternalFrame empleadoherraBeanSwingJInternalFrame=null;
	public EmpleadoHerraBeanSwingJInternalFrame empleadoherraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoHerra=false;
	public EmpleadoHerraSessionBean empleadoherraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public HerramientaLogic herramientaLogic;
	
	public JScrollPane jScrollPanelDatosHerramienta;
	public JScrollPane jScrollPanelDatosEdicionHerramienta;
	public JScrollPane jScrollPanelDatosGeneralHerramienta;
	
	protected JPanel jPanelCamposHerramienta;    
	protected JPanel jPanelCamposOcultosHerramienta;    	
	protected JPanel jPanelAccionesHerramienta;
	protected JPanel jPanelAccionesFormularioHerramienta;
    
	
	
	protected Integer iXPanelCamposHerramienta=0;
	protected Integer iYPanelCamposHerramienta=0;
	
	protected Integer iXPanelCamposOcultosHerramienta=0;
	protected Integer iYPanelCamposOcultosHerramienta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHerramienta;
	public JButton jButtonModificarHerramienta;
	public JButton jButtonActualizarHerramienta;
    public JButton jButtonEliminarHerramienta;
	public JButton jButtonCancelarHerramienta;
    public JButton jButtonGuardarCambiosHerramienta;
	public JButton jButtonGuardarCambiosTablaHerramienta;
	protected JButton jButtonCerrarHerramienta;
	
	
	protected JButton jButtonProcesarInformacionHerramienta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHerramienta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHerramienta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHerramienta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHerramienta;
	protected JButton jButtonModificarToolBarHerramienta;
	protected JButton jButtonActualizarToolBarHerramienta;
    protected JButton jButtonEliminarToolBarHerramienta;
	protected JButton jButtonCancelarToolBarHerramienta;
    protected JButton jButtonGuardarCambiosToolBarHerramienta;
	protected JButton jButtonGuardarCambiosTablaToolBarHerramienta;
	protected JButton jButtonMostrarOcultarTablaToolBarHerramienta;
	protected JButton jButtonCerrarToolBarHerramienta;
	
	protected JButton jButtonProcesarInformacionToolBarHerramienta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHerramienta;
	protected JMenuItem jMenuItemModificarHerramienta;
	protected JMenuItem jMenuItemActualizarHerramienta;
    protected JMenuItem jMenuItemEliminarHerramienta;
	protected JMenuItem jMenuItemCancelarHerramienta;
    protected JMenuItem jMenuItemGuardarCambiosHerramienta;
	protected JMenuItem jMenuItemGuardarCambiosTablaHerramienta;
	protected JMenuItem jMenuItemCerrarHerramienta;
	protected JMenuItem jMenuItemDetalleCerrarHerramienta;
	protected JMenuItem jMenuItemDetalleMostarOcultarHerramienta;
	
	protected JMenuItem jMenuItemProcesarInformacionHerramienta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHerramienta;
	protected JMenuItem jMenuItemMostrarOcultarHerramienta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHerramienta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHerramienta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHerramienta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHerramienta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHerramienta;
	public JLabel jLabelIdHerramienta;
	public JLabel jLabelidHerramienta;
	public JButton jButtonidHerramientaBusqueda= new JButtonMe();

	public JPanel jPanelnombreHerramienta;
	public JLabel jLabelnombreHerramienta;
	public JTextArea jTextAreanombreHerramienta;
	public JScrollPane jscrollPanenombreHerramienta;
	public JButton jButtonnombreHerramientaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionHerramienta;
	public JLabel jLabeldescripcionHerramienta;
	public JTextArea jTextAreadescripcionHerramienta;
	public JScrollPane jscrollPanedescripcionHerramienta;
	public JButton jButtondescripcionHerramientaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaHerramienta;
	public JLabel jLabelid_empresaHerramienta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHerramienta;
	public JButton jButtonid_empresaHerramienta= new JButtonMe();
	public JButton jButtonid_empresaHerramientaUpdate= new JButtonMe();
	public JButton jButtonid_empresaHerramientaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHerramienta;
	
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
	
	public HerramientaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHerramienta=new JPanel();
				this.jPanelAccionesFormularioHerramienta=new JPanel();
				this.jmenuBarDetalleHerramienta=new JMenuBar();
				this.jTtoolBarDetalleHerramienta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HerramientaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HerramientaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HerramientaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HerramientaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HerramientaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Herramienta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHerramienta() {
		return this.jButtonActualizarToolBarHerramienta;
	}
	
	public JButton getjButtonEliminarToolBarHerramienta() {
		return this.jButtonEliminarToolBarHerramienta;
	}
	
	public JButton getjButtonCancelarToolBarHerramienta() {
		return this.jButtonCancelarToolBarHerramienta;
	}		
	
	public JButton getjButtonProcesarInformacionHerramienta() {
		return this.jButtonProcesarInformacionHerramienta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHerramienta)	{
		this.jButtonProcesarInformacionHerramienta = jButtonProcesarInformacionHerramienta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHerramienta() {
		return this.jComboBoxTiposAccionesHerramienta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHerramienta(
			JComboBox jComboBoxTiposRelacionesHerramienta) {
		this.jComboBoxTiposRelacionesHerramienta = jComboBoxTiposRelacionesHerramienta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHerramienta(
			JComboBox jComboBoxTiposAccionesHerramienta) {
		this.jComboBoxTiposAccionesHerramienta = jComboBoxTiposAccionesHerramienta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHerramienta() {
		return this.jComboBoxTiposAccionesFormularioHerramienta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHerramienta(
			JComboBox jComboBoxTiposAccionesFormularioHerramienta) {
		this.jComboBoxTiposAccionesFormularioHerramienta = jComboBoxTiposAccionesFormularioHerramienta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.herramientaSessionBean=new HerramientaSessionBean();
		
		this.herramientaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.herramientaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.herramientaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HerramientaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Herramienta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
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
	
		HerramientaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHerramienta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHerramienta=new JButtonMe();
				this.jButtonModificarToolBarHerramienta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHerramienta,this.jTtoolBarDetalleHerramienta,
							"actualizar","actualizar","Actualizar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHerramienta,this.jTtoolBarDetalleHerramienta,
							"eliminar","eliminar","Eliminar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHerramienta,this.jTtoolBarDetalleHerramienta,
							"cancelar","cancelar","Cancelar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHerramienta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHerramienta,this.jTtoolBarDetalleHerramienta,
							"guardarcambios","guardarcambios","Guardar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHerramienta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHerramienta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHerramienta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHerramienta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHerramienta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHerramienta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHerramienta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHerramienta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHerramienta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHerramienta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHerramienta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHerramienta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHerramienta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHerramienta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHerramienta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHerramienta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHerramienta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHerramienta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHerramienta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHerramienta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHerramienta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHerramienta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHerramienta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHerramienta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHerramienta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHerramienta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHerramienta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHerramienta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHerramienta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHerramienta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHerramienta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHerramienta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHerramienta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHerramienta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHerramienta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHerramienta.add(this.jMenuItemDetalleCerrarHerramienta);
		
		this.jmenuDetalleAccionesHerramienta.add(this.jMenuItemActualizarHerramienta);
		this.jmenuDetalleAccionesHerramienta.add(this.jMenuItemEliminarHerramienta);
		this.jmenuDetalleAccionesHerramienta.add(this.jMenuItemCancelarHerramienta);		
		
		//this.jmenuDetalleDatosHerramienta.add(this.jMenuItemDetalleAbrirOrderByHerramienta);				
		this.jmenuDetalleDatosHerramienta.add(this.jMenuItemDetalleMostarOcultarHerramienta);				
				
		//this.jmenuDetalleAccionesHerramienta.add(this.jMenuItemGuardarCambiosHerramienta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHerramienta.add(this.jmenuDetalleArchivoHerramienta);		
		this.jmenuBarDetalleHerramienta.add(this.jmenuDetalleAccionesHerramienta);		
		this.jmenuBarDetalleHerramienta.add(this.jmenuDetalleDatosHerramienta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleHerramienta.add(this.jmenuDetalleHerramienta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHerramienta);				
	}
	
	
	public void inicializarElementosCamposHerramienta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHerramienta = new JLabelMe();
		jLabelIdHerramienta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHerramienta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHerramienta.setToolTipText(HerramientaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHerramienta= new GridBagLayout();

		this.jPanelidHerramienta.setLayout(this.gridaBagLayoutHerramienta);

		jLabelidHerramienta = new JLabel();
		jLabelidHerramienta.setText("Id");

		jLabelidHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreHerramienta = new JLabelMe();
		this.jLabelnombreHerramienta.setText(""+HerramientaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreHerramienta.setToolTipText("Nombre");
		this.jLabelnombreHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreHerramienta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreHerramienta.setToolTipText(HerramientaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutHerramienta = new GridBagLayout();
		this.jPanelnombreHerramienta.setLayout(this.gridaBagLayoutHerramienta);


		jTextAreanombreHerramienta= new JTextAreaMe();
		jTextAreanombreHerramienta.setEnabled(false);
		jTextAreanombreHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreHerramienta.setLineWrap(true);
		jTextAreanombreHerramienta.setWrapStyleWord(true);
		jTextAreanombreHerramienta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreHerramienta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreHerramienta = new JScrollPane(jTextAreanombreHerramienta);
		jscrollPanenombreHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreHerramientaBusqueda= new JButtonMe();
		this.jButtonnombreHerramientaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreHerramientaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreHerramientaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreHerramientaBusqueda.setText("U");
		this.jButtonnombreHerramientaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreHerramientaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreHerramientaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreHerramientaBusqueda"));

		if(this.herramientaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreHerramientaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionHerramienta = new JLabelMe();
		this.jLabeldescripcionHerramienta.setText(""+HerramientaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionHerramienta.setToolTipText("Descripcion");
		this.jLabeldescripcionHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionHerramienta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionHerramienta.setToolTipText(HerramientaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutHerramienta = new GridBagLayout();
		this.jPaneldescripcionHerramienta.setLayout(this.gridaBagLayoutHerramienta);


		jTextAreadescripcionHerramienta= new JTextAreaMe();
		jTextAreadescripcionHerramienta.setEnabled(false);
		jTextAreadescripcionHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHerramienta.setLineWrap(true);
		jTextAreadescripcionHerramienta.setWrapStyleWord(true);
		jTextAreadescripcionHerramienta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionHerramienta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionHerramienta = new JScrollPane(jTextAreadescripcionHerramienta);
		jscrollPanedescripcionHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionHerramientaBusqueda= new JButtonMe();
		this.jButtondescripcionHerramientaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionHerramientaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionHerramientaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionHerramientaBusqueda.setText("U");
		this.jButtondescripcionHerramientaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionHerramientaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionHerramientaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionHerramientaBusqueda"));

		if(this.herramientaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionHerramientaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHerramienta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaHerramienta = new JLabelMe();
		this.jLabelid_empresaHerramienta.setText(""+HerramientaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHerramienta.setToolTipText("Empresa");
		this.jLabelid_empresaHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHerramienta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHerramienta.setToolTipText(HerramientaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHerramienta = new GridBagLayout();
		this.jPanelid_empresaHerramienta.setLayout(this.gridaBagLayoutHerramienta);


		jComboBoxid_empresaHerramienta= new JComboBoxMe();
		jComboBoxid_empresaHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHerramienta.setEnabled(false);

		this.jButtonid_empresaHerramienta= new JButtonMe();
		this.jButtonid_empresaHerramienta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHerramienta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHerramienta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHerramienta.setText("Buscar");
		this.jButtonid_empresaHerramienta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHerramienta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHerramienta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHerramienta"));

		this.jButtonid_empresaHerramientaBusqueda= new JButtonMe();
		this.jButtonid_empresaHerramientaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHerramientaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHerramientaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHerramientaBusqueda.setText("U");
		this.jButtonid_empresaHerramientaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHerramientaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHerramientaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHerramientaBusqueda"));

		if(this.herramientaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHerramientaBusqueda.setVisible(false);		}

		this.jButtonid_empresaHerramientaUpdate= new JButtonMe();
		this.jButtonid_empresaHerramientaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHerramientaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHerramientaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHerramientaUpdate.setText("U");
		this.jButtonid_empresaHerramientaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHerramientaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHerramientaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHerramientaUpdate"));



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
		//this.jInternalFrameDetalleHerramienta = new HerramientaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Herramienta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHerramienta= new GridBagLayout();
		

		
		String sToolTipHerramienta="";
		sToolTipHerramienta=HerramientaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHerramienta+="(Nomina.Herramienta)";
		}
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			sToolTipHerramienta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHerramienta = new JButtonMe();
		this.jButtonModificarHerramienta = new JButtonMe();
        this.jButtonActualizarHerramienta = new JButtonMe();
        this.jButtonEliminarHerramienta = new JButtonMe();
        this.jButtonCancelarHerramienta = new JButtonMe();
        this.jButtonGuardarCambiosHerramienta = new JButtonMe();
		this.jButtonGuardarCambiosTablaHerramienta = new JButtonMe();
		this.jButtonCerrarHerramienta = new JButtonMe();
		
		this.jScrollPanelDatosHerramienta = new JScrollPane();   
        this.jScrollPanelDatosEdicionHerramienta = new JScrollPane();
		this.jScrollPanelDatosGeneralHerramienta = new JScrollPane();
				
		
		
		this.jPanelCamposHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Herramienta";
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Herramientas" + this.sPath));
		} else {
			this.jScrollPanelDatosHerramienta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHerramienta.setName("jPanelCamposHerramienta"); 

		this.jPanelCamposOcultosHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHerramienta.setName("jPanelCamposOcultosHerramienta"); 

        this.jPanelAccionesHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHerramienta.setToolTipText("Acciones");
        this.jPanelAccionesHerramienta.setName("Acciones"); 

		this.jPanelAccionesFormularioHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHerramienta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHerramienta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHerramienta.setText("Nuevo");
		this.jButtonModificarHerramienta.setText("Editar");
        this.jButtonActualizarHerramienta.setText("Actualizar");
        this.jButtonEliminarHerramienta.setText("Eliminar");
        this.jButtonCancelarHerramienta.setText("Cancelar");
        this.jButtonGuardarCambiosHerramienta.setText("Guardar");
		this.jButtonGuardarCambiosTablaHerramienta.setText("Guardar");
		this.jButtonCerrarHerramienta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHerramienta,"nuevo_button","Nuevo",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHerramienta,"modificar_button","Editar",this.herramientaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHerramienta,"actualizar_button","Actualizar",this.herramientaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHerramienta,"eliminar_button","Eliminar",this.herramientaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHerramienta,"cancelar_button","Cancelar",this.herramientaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHerramienta,"guardarcambios_button","Guardar",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHerramienta,"guardarcambiostabla_button","Guardar",this.herramientaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHerramienta,"cerrar_button","Salir",this.herramientaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHerramienta.setToolTipText("Nuevo"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHerramienta.setToolTipText("Editar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHerramienta.setToolTipText("Actualizar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHerramienta.setToolTipText("Eliminar)"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHerramienta.setToolTipText("Cancelar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHerramienta.setToolTipText("Guardar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHerramienta.setToolTipText("Guardar"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHerramienta.setToolTipText("Salir"+" "+HerramientaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHerramienta";
		inputMap = this.jButtonNuevoHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHerramienta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHerramienta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHerramienta";
		inputMap = this.jButtonActualizarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHerramienta"));
		
		//ELIMINAR
		sMapKey = "EliminarHerramienta";
		inputMap = this.jButtonEliminarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHerramienta"));
		
		//CANCELAR	
		sMapKey = "CancelarHerramienta";
		inputMap = this.jButtonCancelarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHerramienta"));
		
		//CERRAR		
		sMapKey = "CerrarHerramienta";
		inputMap = this.jButtonCerrarHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHerramienta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHerramienta";
		inputMap = this.jButtonGuardarCambiosTablaHerramienta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHerramienta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHerramienta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHerramienta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHerramienta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHerramienta.setToolTipText("Nuevo Herramienta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHerramienta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHerramienta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHerramienta.setToolTipText("Sin Cerrar Ventana Herramienta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHerramienta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHerramienta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHerramienta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHerramienta.setText("Accion");
		this.jComboBoxTiposAccionesHerramienta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHerramienta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHerramienta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHerramienta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHerramienta = new JLabelMe();
		
		this.jLabelAccionesHerramienta.setText("Acciones");		
		this.jLabelAccionesHerramienta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHerramienta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHerramienta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHerramienta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHerramienta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHerramienta=new JTabbedPane();
		this.jTabbedPaneRelacionesHerramienta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHerramienta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHerramienta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHerramienta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHerramienta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHerramienta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHerramienta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHerramienta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHerramienta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHerramienta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHerramienta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHerramienta = new GridBagLayout();
		
		this.jPanelCamposHerramienta.setLayout(gridaBagLayoutCamposHerramienta);
		this.jPanelCamposOcultosHerramienta.setLayout(gridaBagLayoutCamposOcultosHerramienta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 0;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHerramienta.add(jLabelIdHerramienta, this.gridBagConstraintsHerramienta);



	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 1;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHerramienta.add(jLabelidHerramienta, this.gridBagConstraintsHerramienta);


	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 0;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHerramienta.add(jLabelid_empresaHerramienta, this.gridBagConstraintsHerramienta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		//this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = 0;
		this.gridBagConstraintsHerramienta.gridx = 2;
		this.gridBagConstraintsHerramienta.ipadx = 0;
		this.gridBagConstraintsHerramienta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHerramienta.add(jButtonid_empresaHerramientaBusqueda, this.gridBagConstraintsHerramienta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		//this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = 0;
		this.gridBagConstraintsHerramienta.gridx = 3;
		this.gridBagConstraintsHerramienta.ipadx = 0;
		this.gridBagConstraintsHerramienta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHerramienta.add(jButtonid_empresaHerramientaUpdate, this.gridBagConstraintsHerramienta);
	}

	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 1;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHerramienta.add(jComboBoxid_empresaHerramienta, this.gridBagConstraintsHerramienta);


	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 0;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreHerramienta.add(jLabelnombreHerramienta, this.gridBagConstraintsHerramienta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		//this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = 0;
		this.gridBagConstraintsHerramienta.gridx = 2;
		this.gridBagConstraintsHerramienta.ipadx = 0;
		this.gridBagConstraintsHerramienta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreHerramienta.add(jButtonnombreHerramientaBusqueda, this.gridBagConstraintsHerramienta);
	}

	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 1;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreHerramienta.add(jscrollPanenombreHerramienta, this.gridBagConstraintsHerramienta);


	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 0;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionHerramienta.add(jLabeldescripcionHerramienta, this.gridBagConstraintsHerramienta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		//this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHerramienta.gridy = 0;
		this.gridBagConstraintsHerramienta.gridx = 2;
		this.gridBagConstraintsHerramienta.ipadx = 0;
		this.gridBagConstraintsHerramienta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionHerramienta.add(jButtondescripcionHerramientaBusqueda, this.gridBagConstraintsHerramienta);
	}

	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHerramienta.gridy = 0;
	this.gridBagConstraintsHerramienta.gridx = 1;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionHerramienta.add(jscrollPanedescripcionHerramienta, this.gridBagConstraintsHerramienta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHerramienta.gridy = iYPanelCamposHerramienta;
	this.gridBagConstraintsHerramienta.gridx = iXPanelCamposHerramienta++;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHerramienta.add(this.jPanelidHerramienta, this.gridBagConstraintsHerramienta);



	if(iXPanelCamposHerramienta % 1==0) {
		iXPanelCamposHerramienta=0;
		iYPanelCamposHerramienta++;
	}
	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHerramienta.gridy = iYPanelCamposHerramienta;
	this.gridBagConstraintsHerramienta.gridx = iXPanelCamposHerramienta++;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHerramienta.add(this.jPanelnombreHerramienta, this.gridBagConstraintsHerramienta);



	if(iXPanelCamposHerramienta % 1==0) {
		iXPanelCamposHerramienta=0;
		iYPanelCamposHerramienta++;
	}
	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHerramienta.gridy = iYPanelCamposHerramienta;
	this.gridBagConstraintsHerramienta.gridx = iXPanelCamposHerramienta++;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHerramienta.add(this.jPaneldescripcionHerramienta, this.gridBagConstraintsHerramienta);



	if(iXPanelCamposHerramienta % 1==0) {
		iXPanelCamposHerramienta=0;
		iYPanelCamposHerramienta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHerramienta = new GridBagConstraints();
	this.gridBagConstraintsHerramienta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHerramienta.gridy = iYPanelCamposOcultosHerramienta;
	this.gridBagConstraintsHerramienta.gridx = iXPanelCamposOcultosHerramienta++;
	this.gridBagConstraintsHerramienta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHerramienta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHerramienta.add(this.jPanelid_empresaHerramienta, this.gridBagConstraintsHerramienta);



	if(iXPanelCamposOcultosHerramienta % 1==0) {
		iXPanelCamposOcultosHerramienta=0;
		iYPanelCamposOcultosHerramienta++;
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
			
		GridBagLayout gridaBagLayoutAccionesHerramienta= new GridBagLayout();
		this.jPanelAccionesHerramienta.setLayout(gridaBagLayoutAccionesHerramienta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHerramienta= new GridBagLayout();
		this.jPanelAccionesFormularioHerramienta.setLayout(gridaBagLayoutAccionesFormularioHerramienta);
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHerramienta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHerramienta.add(this.jComboBoxTiposAccionesFormularioHerramienta, this.gridBagConstraintsHerramienta);

		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHerramienta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHerramienta.add(this.jCheckBoxPostAccionNuevoHerramienta, this.gridBagConstraintsHerramienta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.herramientaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHerramienta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHerramienta.add(this.jCheckBoxPostAccionSinCerrarHerramienta, this.gridBagConstraintsHerramienta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.herramientaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHerramienta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHerramienta.add(this.jCheckBoxPostAccionSinMensajeHerramienta, this.gridBagConstraintsHerramienta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = 0;
		this.gridBagConstraintsHerramienta.gridx = iPosXAccion++;
			
		this.jPanelAccionesHerramienta.add(this.jButtonModificarHerramienta, this.gridBagConstraintsHerramienta);							

		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHerramienta.gridy = 0;
		this.gridBagConstraintsHerramienta.gridx =iPosXAccion++;
			
		this.jPanelAccionesHerramienta.add(this.jButtonEliminarHerramienta, this.gridBagConstraintsHerramienta);
		
			
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = 0;		
		this.gridBagConstraintsHerramienta.gridx = iPosXAccion++;
		
		this.jPanelAccionesHerramienta.add(this.jButtonActualizarHerramienta, this.gridBagConstraintsHerramienta);


		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = 0;		
		this.gridBagConstraintsHerramienta.gridx = iPosXAccion++;
		
		this.jPanelAccionesHerramienta.add(this.jButtonGuardarCambiosHerramienta, this.gridBagConstraintsHerramienta);	
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = 0;		
		this.gridBagConstraintsHerramienta.gridx =iPosXAccion++;
		
		this.jPanelAccionesHerramienta.add(this.jButtonCancelarHerramienta, this.gridBagConstraintsHerramienta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHerramienta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHerramienta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHerramienta = new GridBagConstraints();						
			this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHerramienta.gridx = 0;		
			//this.gridBagConstraintsHerramienta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHerramienta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHerramienta.gridx =0;
		this.gridBagConstraintsHerramienta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHerramienta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHerramienta, this.gridBagConstraintsHerramienta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HerramientaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHerramienta = new HerramientaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Herramienta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Herramienta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Herramienta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HerramientaModel herramientaModel=new HerramientaModel(this);
			
			//SI USARA CLASE INTERNA
			//HerramientaModel.HerramientaFocusTraversalPolicy herramientaFocusTraversalPolicy = herramientaModel.new HerramientaFocusTraversalPolicy(this);
			
			//herramientaFocusTraversalPolicy.setherramientaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(herramientaModel);
			
			
			this.jContentPaneDetalleHerramienta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHerramienta = new GridBagLayout();	
			this.jContentPaneDetalleHerramienta.setLayout(gridaBagLayoutDetalleHerramienta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHerramienta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHerramienta = new GridBagConstraints();
				this.gridBagConstraintsHerramienta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHerramienta.gridx = 0;
					
				
				this.jContentPaneDetalleHerramienta.add(jTtoolBarDetalleHerramienta, gridBagConstraintsHerramienta);								
				
}
			
			this.jScrollPanelDatosEdicionHerramienta=   new JScrollPane(jContentPaneDetalleHerramienta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHerramienta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHerramienta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHerramienta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHerramienta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHerramienta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHerramienta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHerramienta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHerramienta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHerramienta.gridx = 0;
	        
			this.jContentPaneDetalleHerramienta.add(jPanelCamposHerramienta, gridBagConstraintsHerramienta);
			
			
			
			
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
						&& herramientaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHerra(this.puedeCargarPorParteEmpleadoHerra,false,-1);
					
					if(this.herramientaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHerramienta= new GridBagConstraints();
						this.gridBagConstraintsHerramienta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHerramienta.gridx = 0;
						this.jContentPaneDetalleHerramienta.add(this.jTabbedPaneRelacionesHerramienta, this.gridBagConstraintsHerramienta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHerramienta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHerra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHerramienta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHerramienta = new GridBagConstraints();
					this.gridBagConstraintsHerramienta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHerramienta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHerramienta.gridx = 0;
					
				
					this.jContentPaneDetalleHerramienta.add(jPanelCamposOcultosHerramienta, gridBagConstraintsHerramienta);
				
					this.jPanelCamposOcultosHerramienta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsHerramienta.gridx = 0;
	        this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHerramienta.add(this.jPanelAccionesFormularioHerramienta, this.gridBagConstraintsHerramienta);							
			
			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
	        this.gridBagConstraintsHerramienta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsHerramienta.gridx = 0;
	        
			
			this.jContentPaneDetalleHerramienta.add(this.jPanelAccionesHerramienta, this.gridBagConstraintsHerramienta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHerramienta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHerramienta=   new JScrollPane(this.jPanelCamposHerramienta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHerramienta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHerramienta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHerramienta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHerramienta.gridx = 0;
			this.gridBagConstraintsHerramienta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHerramienta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHerramienta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHerramienta, this.gridBagConstraintsHerramienta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHerramienta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHerramienta, this.gridBagConstraintsHerramienta);			
			
			this.gridBagConstraintsHerramienta = new GridBagConstraints();
			this.gridBagConstraintsHerramienta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHerramienta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHerramienta, this.gridBagConstraintsHerramienta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHerramienta, this.gridBagConstraintsHerramienta);
			
			
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHerramienta, this.gridBagConstraintsHerramienta);
		
			
		this.gridBagConstraintsHerramienta = new GridBagConstraints();
		this.gridBagConstraintsHerramienta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHerramienta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHerramienta, this.gridBagConstraintsHerramienta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHerramienta;//jContentPane;
		
		return jScrollPanelDatosEdicionHerramienta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoHerra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		this.empleadoherraSessionBean.setConGuardarRelaciones(false);
		this.empleadoherraSessionBean.setEsGuardarRelacionado(true);

		this.empleadoherraBeanSwingJInternalFrame=null;//new EmpleadoHerraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoherraBeanSwingJInternalFramePopup=new EmpleadoHerraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoherraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {

				EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL=HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoHerraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=HerramientaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoherraSessionBean.setEsGuardarRelacionado(true);

				this.empleadoherraBeanSwingJInternalFrame=new EmpleadoHerraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoherraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoherraBeanSwingJInternalFrame.setempleadoherraSessionBean(this.empleadoherraSessionBean);

				//this.gridBagConstraintsHerramienta = new GridBagConstraints();
				//this.gridBagConstraintsHerramienta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsHerramienta.gridx = 0;
				//this.jContentPaneDetalleHerramienta.add(this.empleadoherraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsHerramienta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesHerramienta.add("Empleado Herras",this.empleadoherraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesHerramienta.setComponentAt(iIndexTab,this.empleadoherraBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoherraSessionBean.setEsGuardarRelacionado(false);
				this.empleadoherraBeanSwingJInternalFrame=null;//new EmpleadoHerraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoHerra) {
					this.jTabbedPaneRelacionesHerramienta.add("Empleado Herras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoHerraBeanSwingJInternalFrame(List<Herramienta> herramientas,Herramienta herramienta,EmpleadoHerraBeanSwingJInternalFrame empleadoherraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoherraBeanSwingJInternalFrame=new EmpleadoHerraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoherraBeanSwingJInternalFrame.getEmpleadoHerraLogic().setConnexion(this.herramientaLogic.getConnexion());

					empleadoherraBeanSwingJInternalFrame.setherramientasForeignKey(herramientas);
					empleadoherraBeanSwingJInternalFrame.setherramientaForeignKey(herramienta);
					empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setisBusquedaDesdeForeignKeySesionHerramienta(true);
					empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setlidHerramientaActual(herramienta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoherraBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoHerra(empleadoherraBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoherraBeanSwingJInternalFrame.setVisibilidadBusquedasParaHerramienta(true);
					empleadoherraBeanSwingJInternalFrame.setid_herramientaFK_IdHerramienta(herramienta.getId());

					if(!this.conCargarFormDetalle) {
						empleadoherraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoherraBeanSwingJInternalFrame.setSelectedItemCombosFrameHerramientaForeignKey(herramienta,1,false,true,true);
					empleadoherraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoherraBeanSwingJInternalFrame.procesarBusqueda("FK_IdHerramienta");
					empleadoherraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdHerramienta");
					empleadoherraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHerra(true);
					empleadoherraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoHerra("n",empleadoherraBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoherraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoherraBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoherraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoherraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHerra("relacionado");
					} else {
						empleadoherraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHerra("no_relacionado");
					}

					empleadoherraBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoHerra().setVisible(false);

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
