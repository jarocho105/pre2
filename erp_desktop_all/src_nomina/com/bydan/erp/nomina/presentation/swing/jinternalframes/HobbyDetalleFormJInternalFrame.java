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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.HobbyConstantesFunciones;

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
public class HobbyDetalleFormJInternalFrame extends HobbyBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHobby;
	
	protected JMenuBar jmenuBarDetalleHobby;
	
	protected JMenu jmenuDetalleHobby;
	protected JMenu jmenuDetalleArchivoHobby;
	protected JMenu jmenuDetalleAccionesHobby;
	protected JMenu jmenuDetalleDatosHobby;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHobby;	
	protected GridBagConstraints gridBagConstraintsHobby;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HobbyBeanSwingJInternalFrameAdditional jInternalFrameDetalleHobby;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public HobbySessionBean hobbySessionBean;
	
	

	public EmpleadoHobbyBeanSwingJInternalFrame empleadohobbyBeanSwingJInternalFrame=null;
	public EmpleadoHobbyBeanSwingJInternalFrame empleadohobbyBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoHobby=false;
	public EmpleadoHobbySessionBean empleadohobbySessionBean;

	public HobbyClienteBeanSwingJInternalFrame hobbyclienteBeanSwingJInternalFrame=null;
	public HobbyClienteBeanSwingJInternalFrame hobbyclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteHobbyCliente=false;
	public HobbyClienteSessionBean hobbyclienteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public HobbyLogic hobbyLogic;
	
	public JScrollPane jScrollPanelDatosHobby;
	public JScrollPane jScrollPanelDatosEdicionHobby;
	public JScrollPane jScrollPanelDatosGeneralHobby;
	
	protected JPanel jPanelCamposHobby;    
	protected JPanel jPanelCamposOcultosHobby;    	
	protected JPanel jPanelAccionesHobby;
	protected JPanel jPanelAccionesFormularioHobby;
    
	
	
	protected Integer iXPanelCamposHobby=0;
	protected Integer iYPanelCamposHobby=0;
	
	protected Integer iXPanelCamposOcultosHobby=0;
	protected Integer iYPanelCamposOcultosHobby=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHobby;
	public JButton jButtonModificarHobby;
	public JButton jButtonActualizarHobby;
    public JButton jButtonEliminarHobby;
	public JButton jButtonCancelarHobby;
    public JButton jButtonGuardarCambiosHobby;
	public JButton jButtonGuardarCambiosTablaHobby;
	protected JButton jButtonCerrarHobby;
	
	
	protected JButton jButtonProcesarInformacionHobby;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHobby;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHobby;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHobby;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHobby;
	protected JButton jButtonModificarToolBarHobby;
	protected JButton jButtonActualizarToolBarHobby;
    protected JButton jButtonEliminarToolBarHobby;
	protected JButton jButtonCancelarToolBarHobby;
    protected JButton jButtonGuardarCambiosToolBarHobby;
	protected JButton jButtonGuardarCambiosTablaToolBarHobby;
	protected JButton jButtonMostrarOcultarTablaToolBarHobby;
	protected JButton jButtonCerrarToolBarHobby;
	
	protected JButton jButtonProcesarInformacionToolBarHobby;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHobby;
	protected JMenuItem jMenuItemModificarHobby;
	protected JMenuItem jMenuItemActualizarHobby;
    protected JMenuItem jMenuItemEliminarHobby;
	protected JMenuItem jMenuItemCancelarHobby;
    protected JMenuItem jMenuItemGuardarCambiosHobby;
	protected JMenuItem jMenuItemGuardarCambiosTablaHobby;
	protected JMenuItem jMenuItemCerrarHobby;
	protected JMenuItem jMenuItemDetalleCerrarHobby;
	protected JMenuItem jMenuItemDetalleMostarOcultarHobby;
	
	protected JMenuItem jMenuItemProcesarInformacionHobby;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHobby;
	protected JMenuItem jMenuItemMostrarOcultarHobby;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHobby;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHobby;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHobby;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHobby;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHobby;
	public JLabel jLabelIdHobby;
	public JLabel jLabelidHobby;
	public JButton jButtonidHobbyBusqueda= new JButtonMe();

	public JPanel jPanelcodigoHobby;
	public JLabel jLabelcodigoHobby;
	public JTextField jTextFieldcodigoHobby;
	public JButton jButtoncodigoHobbyBusqueda= new JButtonMe();

	public JPanel jPanelnombreHobby;
	public JLabel jLabelnombreHobby;
	public JTextArea jTextAreanombreHobby;
	public JScrollPane jscrollPanenombreHobby;
	public JButton jButtonnombreHobbyBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionHobby;
	public JLabel jLabeldescripcionHobby;
	public JTextArea jTextAreadescripcionHobby;
	public JScrollPane jscrollPanedescripcionHobby;
	public JButton jButtondescripcionHobbyBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaHobby;
	public JLabel jLabelid_empresaHobby;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHobby;
	public JButton jButtonid_empresaHobby= new JButtonMe();
	public JButton jButtonid_empresaHobbyUpdate= new JButtonMe();
	public JButton jButtonid_empresaHobbyBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHobby;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public HobbyDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHobby=new JPanel();
				this.jPanelAccionesFormularioHobby=new JPanel();
				this.jmenuBarDetalleHobby=new JMenuBar();
				this.jTtoolBarDetalleHobby=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HobbyDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Hobby No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHobby() {
		return this.jButtonActualizarToolBarHobby;
	}
	
	public JButton getjButtonEliminarToolBarHobby() {
		return this.jButtonEliminarToolBarHobby;
	}
	
	public JButton getjButtonCancelarToolBarHobby() {
		return this.jButtonCancelarToolBarHobby;
	}		
	
	public JButton getjButtonProcesarInformacionHobby() {
		return this.jButtonProcesarInformacionHobby;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHobby)	{
		this.jButtonProcesarInformacionHobby = jButtonProcesarInformacionHobby;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHobby() {
		return this.jComboBoxTiposAccionesHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHobby(
			JComboBox jComboBoxTiposRelacionesHobby) {
		this.jComboBoxTiposRelacionesHobby = jComboBoxTiposRelacionesHobby;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHobby(
			JComboBox jComboBoxTiposAccionesHobby) {
		this.jComboBoxTiposAccionesHobby = jComboBoxTiposAccionesHobby;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHobby() {
		return this.jComboBoxTiposAccionesFormularioHobby;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHobby(
			JComboBox jComboBoxTiposAccionesFormularioHobby) {
		this.jComboBoxTiposAccionesFormularioHobby = jComboBoxTiposAccionesFormularioHobby;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.hobbySessionBean=new HobbySessionBean();
		
		this.hobbySessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.hobbySessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.hobbySessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		//this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HobbyJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HobbyJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Hobby MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
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
	
		HobbyJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHobby= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHobby=new JButtonMe();
				this.jButtonModificarToolBarHobby=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHobby,this.jTtoolBarDetalleHobby,
							"actualizar","actualizar","Actualizar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHobby,this.jTtoolBarDetalleHobby,
							"eliminar","eliminar","Eliminar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHobby,this.jTtoolBarDetalleHobby,
							"cancelar","cancelar","Cancelar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHobby=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHobby,this.jTtoolBarDetalleHobby,
							"guardarcambios","guardarcambios","Guardar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHobby,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHobby=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHobby=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHobby=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHobby=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHobby=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHobby= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHobby.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHobby,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHobby= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHobby.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHobby,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHobby= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHobby.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHobby,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHobby= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHobby.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHobby,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHobby= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHobby.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHobby,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHobby= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHobby.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHobby,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHobby= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHobby.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHobby,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHobby= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHobby.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHobby,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHobby,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHobby= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHobby.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHobby,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHobby, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHobby.add(this.jMenuItemDetalleCerrarHobby);
		
		this.jmenuDetalleAccionesHobby.add(this.jMenuItemActualizarHobby);
		this.jmenuDetalleAccionesHobby.add(this.jMenuItemEliminarHobby);
		this.jmenuDetalleAccionesHobby.add(this.jMenuItemCancelarHobby);		
		
		//this.jmenuDetalleDatosHobby.add(this.jMenuItemDetalleAbrirOrderByHobby);				
		this.jmenuDetalleDatosHobby.add(this.jMenuItemDetalleMostarOcultarHobby);				
				
		//this.jmenuDetalleAccionesHobby.add(this.jMenuItemGuardarCambiosHobby);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHobby.add(this.jmenuDetalleArchivoHobby);		
		this.jmenuBarDetalleHobby.add(this.jmenuDetalleAccionesHobby);		
		this.jmenuBarDetalleHobby.add(this.jmenuDetalleDatosHobby);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleHobby, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleHobby.add(this.jmenuDetalleHobby);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHobby);				
	}
	
	
	public void inicializarElementosCamposHobby() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHobby = new JLabelMe();
		jLabelIdHobby.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHobby = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHobby.setToolTipText(HobbyConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHobby= new GridBagLayout();

		this.jPanelidHobby.setLayout(this.gridaBagLayoutHobby);

		jLabelidHobby = new JLabel();
		jLabelidHobby.setText("Id");

		jLabelidHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoHobby = new JLabelMe();
		this.jLabelcodigoHobby.setText(""+HobbyConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoHobby.setToolTipText("Codigo");
		this.jLabelcodigoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoHobby=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoHobby.setToolTipText(HobbyConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutHobby = new GridBagLayout();
		this.jPanelcodigoHobby.setLayout(this.gridaBagLayoutHobby);


		jTextFieldcodigoHobby= new JTextFieldMe();

		jTextFieldcodigoHobby.setEnabled(false);
		jTextFieldcodigoHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoHobbyBusqueda= new JButtonMe();
		this.jButtoncodigoHobbyBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoHobbyBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoHobbyBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoHobbyBusqueda.setText("U");
		this.jButtoncodigoHobbyBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoHobbyBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoHobbyBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoHobbyBusqueda"));

		if(this.hobbySessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoHobbyBusqueda.setVisible(false);		}


					
		this.jLabelnombreHobby = new JLabelMe();
		this.jLabelnombreHobby.setText(""+HobbyConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreHobby.setToolTipText("Nombre");
		this.jLabelnombreHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreHobby=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreHobby.setToolTipText(HobbyConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutHobby = new GridBagLayout();
		this.jPanelnombreHobby.setLayout(this.gridaBagLayoutHobby);


		jTextAreanombreHobby= new JTextAreaMe();
		jTextAreanombreHobby.setEnabled(false);
		jTextAreanombreHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreHobby.setLineWrap(true);
		jTextAreanombreHobby.setWrapStyleWord(true);
		jTextAreanombreHobby.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreHobby.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreHobby = new JScrollPane(jTextAreanombreHobby);
		jscrollPanenombreHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreHobbyBusqueda= new JButtonMe();
		this.jButtonnombreHobbyBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreHobbyBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreHobbyBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreHobbyBusqueda.setText("U");
		this.jButtonnombreHobbyBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreHobbyBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreHobbyBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreHobbyBusqueda"));

		if(this.hobbySessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreHobbyBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionHobby = new JLabelMe();
		this.jLabeldescripcionHobby.setText(""+HobbyConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionHobby.setToolTipText("Descripcion");
		this.jLabeldescripcionHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionHobby=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionHobby.setToolTipText(HobbyConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutHobby = new GridBagLayout();
		this.jPaneldescripcionHobby.setLayout(this.gridaBagLayoutHobby);


		jTextAreadescripcionHobby= new JTextAreaMe();
		jTextAreadescripcionHobby.setEnabled(false);
		jTextAreadescripcionHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHobby.setLineWrap(true);
		jTextAreadescripcionHobby.setWrapStyleWord(true);
		jTextAreadescripcionHobby.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionHobby.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionHobby = new JScrollPane(jTextAreadescripcionHobby);
		jscrollPanedescripcionHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionHobbyBusqueda= new JButtonMe();
		this.jButtondescripcionHobbyBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionHobbyBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionHobbyBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionHobbyBusqueda.setText("U");
		this.jButtondescripcionHobbyBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionHobbyBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionHobbyBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionHobbyBusqueda"));

		if(this.hobbySessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionHobbyBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHobby() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaHobby = new JLabelMe();
		this.jLabelid_empresaHobby.setText(""+HobbyConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHobby.setToolTipText("Empresa");
		this.jLabelid_empresaHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHobby,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHobby=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHobby.setToolTipText(HobbyConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHobby = new GridBagLayout();
		this.jPanelid_empresaHobby.setLayout(this.gridaBagLayoutHobby);


		jComboBoxid_empresaHobby= new JComboBoxMe();
		jComboBoxid_empresaHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHobby.setEnabled(false);

		this.jButtonid_empresaHobby= new JButtonMe();
		this.jButtonid_empresaHobby.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHobby.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHobby.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHobby.setText("Buscar");
		this.jButtonid_empresaHobby.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHobby.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHobby,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHobby"));

		this.jButtonid_empresaHobbyBusqueda= new JButtonMe();
		this.jButtonid_empresaHobbyBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHobbyBusqueda.setText("U");
		this.jButtonid_empresaHobbyBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHobbyBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHobbyBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHobbyBusqueda"));

		if(this.hobbySessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHobbyBusqueda.setVisible(false);		}

		this.jButtonid_empresaHobbyUpdate= new JButtonMe();
		this.jButtonid_empresaHobbyUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHobbyUpdate.setText("U");
		this.jButtonid_empresaHobbyUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHobbyUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHobbyUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHobby.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHobby.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHobbyUpdate"));



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
		//this.jInternalFrameDetalleHobby = new HobbyBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Hobby DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHobby= new GridBagLayout();
		

		
		String sToolTipHobby="";
		sToolTipHobby=HobbyConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHobby+="(Nomina.Hobby)";
		}
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			sToolTipHobby+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHobby = new JButtonMe();
		this.jButtonModificarHobby = new JButtonMe();
        this.jButtonActualizarHobby = new JButtonMe();
        this.jButtonEliminarHobby = new JButtonMe();
        this.jButtonCancelarHobby = new JButtonMe();
        this.jButtonGuardarCambiosHobby = new JButtonMe();
		this.jButtonGuardarCambiosTablaHobby = new JButtonMe();
		this.jButtonCerrarHobby = new JButtonMe();
		
		this.jScrollPanelDatosHobby = new JScrollPane();   
        this.jScrollPanelDatosEdicionHobby = new JScrollPane();
		this.jScrollPanelDatosGeneralHobby = new JScrollPane();
				
		
		
		this.jPanelCamposHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Hobby";
		
		if(!this.hobbySessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobbyes" + this.sPath));
		} else {
			this.jScrollPanelDatosHobby.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHobby.setName("jPanelCamposHobby"); 

		this.jPanelCamposOcultosHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHobby.setName("jPanelCamposOcultosHobby"); 

        this.jPanelAccionesHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHobby.setToolTipText("Acciones");
        this.jPanelAccionesHobby.setName("Acciones"); 

		this.jPanelAccionesFormularioHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHobby.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHobby.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHobby, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHobby, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHobby, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHobby.setText("Nuevo");
		this.jButtonModificarHobby.setText("Editar");
        this.jButtonActualizarHobby.setText("Actualizar");
        this.jButtonEliminarHobby.setText("Eliminar");
        this.jButtonCancelarHobby.setText("Cancelar");
        this.jButtonGuardarCambiosHobby.setText("Guardar");
		this.jButtonGuardarCambiosTablaHobby.setText("Guardar");
		this.jButtonCerrarHobby.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHobby,"nuevo_button","Nuevo",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHobby,"modificar_button","Editar",this.hobbySessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHobby,"actualizar_button","Actualizar",this.hobbySessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHobby,"eliminar_button","Eliminar",this.hobbySessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHobby,"cancelar_button","Cancelar",this.hobbySessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHobby,"guardarcambios_button","Guardar",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHobby,"guardarcambiostabla_button","Guardar",this.hobbySessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHobby,"cerrar_button","Salir",this.hobbySessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHobby, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHobby, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHobby.setToolTipText("Nuevo"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHobby.setToolTipText("Editar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHobby.setToolTipText("Actualizar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHobby.setToolTipText("Eliminar)"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHobby.setToolTipText("Cancelar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHobby.setToolTipText("Guardar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHobby.setToolTipText("Guardar"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHobby.setToolTipText("Salir"+" "+HobbyConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHobby";
		inputMap = this.jButtonNuevoHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHobby.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHobby"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHobby";
		inputMap = this.jButtonActualizarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHobby"));
		
		//ELIMINAR
		sMapKey = "EliminarHobby";
		inputMap = this.jButtonEliminarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHobby"));
		
		//CANCELAR	
		sMapKey = "CancelarHobby";
		inputMap = this.jButtonCancelarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHobby"));
		
		//CERRAR		
		sMapKey = "CerrarHobby";
		inputMap = this.jButtonCerrarHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHobby"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHobby";
		inputMap = this.jButtonGuardarCambiosTablaHobby.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHobby.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHobby"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHobby = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHobby.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHobby.setToolTipText("Nuevo Hobby");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHobby, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHobby = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHobby.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHobby.setToolTipText("Sin Cerrar Ventana Hobby");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHobby, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHobby = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHobby.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHobby.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHobby, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHobby = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHobby.setText("Accion");
		this.jComboBoxTiposAccionesHobby.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHobby = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHobby.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHobby.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHobby = new JLabelMe();
		
		this.jLabelAccionesHobby.setText("Acciones");		
		this.jLabelAccionesHobby.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobby.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobby.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHobby();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHobby();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHobby=new JTabbedPane();
		this.jTabbedPaneRelacionesHobby.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHobby,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHobby.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobby.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobby.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHobby, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHobby.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHobby.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHobby.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHobby, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHobby = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHobby = new GridBagLayout();
		
		this.jPanelCamposHobby.setLayout(gridaBagLayoutCamposHobby);
		this.jPanelCamposOcultosHobby.setLayout(gridaBagLayoutCamposOcultosHobby);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 0;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHobby.add(jLabelIdHobby, this.gridBagConstraintsHobby);



	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 1;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHobby.add(jLabelidHobby, this.gridBagConstraintsHobby);


	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 0;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHobby.add(jLabelid_empresaHobby, this.gridBagConstraintsHobby);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobby = new GridBagConstraints();
		//this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx = 2;
		this.gridBagConstraintsHobby.ipadx = 0;
		this.gridBagConstraintsHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHobby.add(jButtonid_empresaHobbyBusqueda, this.gridBagConstraintsHobby);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobby = new GridBagConstraints();
		//this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx = 3;
		this.gridBagConstraintsHobby.ipadx = 0;
		this.gridBagConstraintsHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHobby.add(jButtonid_empresaHobbyUpdate, this.gridBagConstraintsHobby);
	}

	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 1;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHobby.add(jComboBoxid_empresaHobby, this.gridBagConstraintsHobby);


	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 0;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoHobby.add(jLabelcodigoHobby, this.gridBagConstraintsHobby);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobby = new GridBagConstraints();
		//this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx = 2;
		this.gridBagConstraintsHobby.ipadx = 0;
		this.gridBagConstraintsHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoHobby.add(jButtoncodigoHobbyBusqueda, this.gridBagConstraintsHobby);
	}

	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 1;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoHobby.add(jTextFieldcodigoHobby, this.gridBagConstraintsHobby);


	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 0;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreHobby.add(jLabelnombreHobby, this.gridBagConstraintsHobby);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobby = new GridBagConstraints();
		//this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx = 2;
		this.gridBagConstraintsHobby.ipadx = 0;
		this.gridBagConstraintsHobby.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreHobby.add(jButtonnombreHobbyBusqueda, this.gridBagConstraintsHobby);
	}

	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 1;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreHobby.add(jscrollPanenombreHobby, this.gridBagConstraintsHobby);


	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 0;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionHobby.add(jLabeldescripcionHobby, this.gridBagConstraintsHobby);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobby = new GridBagConstraints();
		//this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx = 2;
		this.gridBagConstraintsHobby.ipadx = 0;
		this.gridBagConstraintsHobby.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionHobby.add(jButtondescripcionHobbyBusqueda, this.gridBagConstraintsHobby);
	}

	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobby.gridy = 0;
	this.gridBagConstraintsHobby.gridx = 1;
	this.gridBagConstraintsHobby.ipadx = 0;
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionHobby.add(jscrollPanedescripcionHobby, this.gridBagConstraintsHobby);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobby.gridy = iYPanelCamposHobby;
	this.gridBagConstraintsHobby.gridx = iXPanelCamposHobby++;
	this.gridBagConstraintsHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobby.add(this.jPanelidHobby, this.gridBagConstraintsHobby);



	if(iXPanelCamposHobby % 1==0) {
		iXPanelCamposHobby=0;
		iYPanelCamposHobby++;
	}
	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobby.gridy = iYPanelCamposHobby;
	this.gridBagConstraintsHobby.gridx = iXPanelCamposHobby++;
	this.gridBagConstraintsHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobby.add(this.jPanelcodigoHobby, this.gridBagConstraintsHobby);



	if(iXPanelCamposHobby % 1==0) {
		iXPanelCamposHobby=0;
		iYPanelCamposHobby++;
	}
	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobby.gridy = iYPanelCamposHobby;
	this.gridBagConstraintsHobby.gridx = iXPanelCamposHobby++;
	this.gridBagConstraintsHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobby.add(this.jPanelnombreHobby, this.gridBagConstraintsHobby);



	if(iXPanelCamposHobby % 1==0) {
		iXPanelCamposHobby=0;
		iYPanelCamposHobby++;
	}
	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobby.gridy = iYPanelCamposHobby;
	this.gridBagConstraintsHobby.gridx = iXPanelCamposHobby++;
	this.gridBagConstraintsHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobby.add(this.jPaneldescripcionHobby, this.gridBagConstraintsHobby);



	if(iXPanelCamposHobby % 1==0) {
		iXPanelCamposHobby=0;
		iYPanelCamposHobby++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHobby = new GridBagConstraints();
	this.gridBagConstraintsHobby.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobby.gridy = iYPanelCamposOcultosHobby;
	this.gridBagConstraintsHobby.gridx = iXPanelCamposOcultosHobby++;
	this.gridBagConstraintsHobby.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobby.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHobby.add(this.jPanelid_empresaHobby, this.gridBagConstraintsHobby);



	if(iXPanelCamposOcultosHobby % 1==0) {
		iXPanelCamposOcultosHobby=0;
		iYPanelCamposOcultosHobby++;
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
			
		GridBagLayout gridaBagLayoutAccionesHobby= new GridBagLayout();
		this.jPanelAccionesHobby.setLayout(gridaBagLayoutAccionesHobby);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHobby= new GridBagLayout();
		this.jPanelAccionesFormularioHobby.setLayout(gridaBagLayoutAccionesFormularioHobby);
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHobby.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHobby.add(this.jComboBoxTiposAccionesFormularioHobby, this.gridBagConstraintsHobby);

		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHobby.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHobby.add(this.jCheckBoxPostAccionNuevoHobby, this.gridBagConstraintsHobby);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.hobbySessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHobby.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHobby.add(this.jCheckBoxPostAccionSinCerrarHobby, this.gridBagConstraintsHobby);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.hobbySessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.hobbySessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHobby.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHobby.add(this.jCheckBoxPostAccionSinMensajeHobby, this.gridBagConstraintsHobby);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx = iPosXAccion++;
			
		this.jPanelAccionesHobby.add(this.jButtonModificarHobby, this.gridBagConstraintsHobby);							

		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobby.gridy = 0;
		this.gridBagConstraintsHobby.gridx =iPosXAccion++;
			
		this.jPanelAccionesHobby.add(this.jButtonEliminarHobby, this.gridBagConstraintsHobby);
		
			
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = 0;		
		this.gridBagConstraintsHobby.gridx = iPosXAccion++;
		
		this.jPanelAccionesHobby.add(this.jButtonActualizarHobby, this.gridBagConstraintsHobby);


		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = 0;		
		this.gridBagConstraintsHobby.gridx = iPosXAccion++;
		
		this.jPanelAccionesHobby.add(this.jButtonGuardarCambiosHobby, this.gridBagConstraintsHobby);	
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = 0;		
		this.gridBagConstraintsHobby.gridx =iPosXAccion++;
		
		this.jPanelAccionesHobby.add(this.jButtonCancelarHobby, this.gridBagConstraintsHobby);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHobby = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHobby);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.hobbySessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHobby = new GridBagConstraints();						
			this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHobby.gridx = 0;		
			//this.gridBagConstraintsHobby.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHobby.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHobby.gridx =0;
		this.gridBagConstraintsHobby.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHobby.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHobby, this.gridBagConstraintsHobby);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HobbyJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHobby = new HobbyBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Hobby DATOS");
			
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
			
	        //this.setTitle("[FOR] - Hobby DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Hobby Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HobbyModel hobbyModel=new HobbyModel(this);
			
			//SI USARA CLASE INTERNA
			//HobbyModel.HobbyFocusTraversalPolicy hobbyFocusTraversalPolicy = hobbyModel.new HobbyFocusTraversalPolicy(this);
			
			//hobbyFocusTraversalPolicy.sethobbyJInternalFrame(this);
			
			this.setFocusTraversalPolicy(hobbyModel);
			
			
			this.jContentPaneDetalleHobby = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHobby = new GridBagLayout();	
			this.jContentPaneDetalleHobby.setLayout(gridaBagLayoutDetalleHobby);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHobby = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHobby = new GridBagConstraints();
				this.gridBagConstraintsHobby.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHobby.gridx = 0;
					
				
				this.jContentPaneDetalleHobby.add(jTtoolBarDetalleHobby, gridBagConstraintsHobby);								
				
}
			
			this.jScrollPanelDatosEdicionHobby=   new JScrollPane(jContentPaneDetalleHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHobby=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHobby.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHobby.gridx = 0;
	        
			this.jContentPaneDetalleHobby.add(jPanelCamposHobby, gridBagConstraintsHobby);
			
			
			
			
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
						&& hobbySessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHobby(this.puedeCargarPorParteEmpleadoHobby,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHobbyCliente(this.puedeCargarPorParteHobbyCliente,false,-1);
					
					if(this.hobbySessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHobby= new GridBagConstraints();
						this.gridBagConstraintsHobby.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHobby.gridx = 0;
						this.jContentPaneDetalleHobby.add(this.jTabbedPaneRelacionesHobby, this.gridBagConstraintsHobby);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHobby.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoHobby(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameHobbyCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHobby.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHobby = new GridBagConstraints();
					this.gridBagConstraintsHobby.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHobby.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHobby.gridx = 0;
					
				
					this.jContentPaneDetalleHobby.add(jPanelCamposOcultosHobby, gridBagConstraintsHobby);
				
					this.jPanelCamposOcultosHobby.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsHobby.gridx = 0;
	        this.gridBagConstraintsHobby.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHobby.add(this.jPanelAccionesFormularioHobby, this.gridBagConstraintsHobby);							
			
			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
	        this.gridBagConstraintsHobby.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsHobby.gridx = 0;
	        
			
			this.jContentPaneDetalleHobby.add(this.jPanelAccionesHobby, this.gridBagConstraintsHobby);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHobby);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHobby=   new JScrollPane(this.jPanelCamposHobby,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHobby.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobby.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobby.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHobby.gridx = 0;
			this.gridBagConstraintsHobby.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHobby.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHobby.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHobby, this.gridBagConstraintsHobby);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHobby.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHobby, this.gridBagConstraintsHobby);			
			
			this.gridBagConstraintsHobby = new GridBagConstraints();
			this.gridBagConstraintsHobby.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHobby.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHobby, this.gridBagConstraintsHobby);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHobby, this.gridBagConstraintsHobby);
			
			
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHobby, this.gridBagConstraintsHobby);
		
			
		this.gridBagConstraintsHobby = new GridBagConstraints();
		this.gridBagConstraintsHobby.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHobby.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHobby, this.gridBagConstraintsHobby);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHobby;//jContentPane;
		
		return jScrollPanelDatosEdicionHobby;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoHobby(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadohobbySessionBean=new EmpleadoHobbySessionBean();
		this.empleadohobbySessionBean.setConGuardarRelaciones(false);
		this.empleadohobbySessionBean.setEsGuardarRelacionado(true);

		this.empleadohobbyBeanSwingJInternalFrame=null;//new EmpleadoHobbyBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadohobbyBeanSwingJInternalFramePopup=new EmpleadoHobbyBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadohobbyBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {

				EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL=HobbyJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoHobbyJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=HobbyJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadohobbySessionBean.setEsGuardarRelacionado(true);

				this.empleadohobbyBeanSwingJInternalFrame=new EmpleadoHobbyBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadohobbyBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadohobbyBeanSwingJInternalFrame.setempleadohobbySessionBean(this.empleadohobbySessionBean);

				//this.gridBagConstraintsHobby = new GridBagConstraints();
				//this.gridBagConstraintsHobby.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsHobby.gridx = 0;
				//this.jContentPaneDetalleHobby.add(this.empleadohobbyBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsHobby);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesHobby.add("Empleado Hobbyes",this.empleadohobbyBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesHobby.setComponentAt(iIndexTab,this.empleadohobbyBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoHobbyJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadohobbySessionBean.setEsGuardarRelacionado(false);
				this.empleadohobbyBeanSwingJInternalFrame=null;//new EmpleadoHobbyBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadohobbySessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoHobby) {
					this.jTabbedPaneRelacionesHobby.add("Empleado Hobbyes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameHobbyCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		this.hobbyclienteSessionBean.setConGuardarRelaciones(false);
		this.hobbyclienteSessionBean.setEsGuardarRelacionado(true);

		this.hobbyclienteBeanSwingJInternalFrame=null;//new HobbyClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.hobbyclienteBeanSwingJInternalFramePopup=new HobbyClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.hobbyclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {

				HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL=HobbyJInternalFrame.STIPO_TAMANIO_GENERAL;
				HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=HobbyJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.hobbyclienteSessionBean.setEsGuardarRelacionado(true);

				this.hobbyclienteBeanSwingJInternalFrame=new HobbyClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.hobbyclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.hobbyclienteBeanSwingJInternalFrame.sethobbyclienteSessionBean(this.hobbyclienteSessionBean);

				//this.gridBagConstraintsHobby = new GridBagConstraints();
				//this.gridBagConstraintsHobby.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsHobby.gridx = 0;
				//this.jContentPaneDetalleHobby.add(this.hobbyclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsHobby);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesHobby.add("Hobby Clientes",this.hobbyclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesHobby.setComponentAt(iIndexTab,this.hobbyclienteBeanSwingJInternalFrame.getContentPane());
				}

				//HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.hobbyclienteSessionBean.setEsGuardarRelacionado(false);
				this.hobbyclienteBeanSwingJInternalFrame=null;//new HobbyClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteHobbyCliente) {
					this.jTabbedPaneRelacionesHobby.add("Hobby Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoHobbyBeanSwingJInternalFrame(List<Hobby> hobbys,Hobby hobby,EmpleadoHobbyBeanSwingJInternalFrame empleadohobbyBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadohobbyBeanSwingJInternalFrame=new EmpleadoHobbyBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadohobbyBeanSwingJInternalFrame.getEmpleadoHobbyLogic().setConnexion(this.hobbyLogic.getConnexion());

					empleadohobbyBeanSwingJInternalFrame.sethobbysForeignKey(hobbys);
					empleadohobbyBeanSwingJInternalFrame.sethobbyForeignKey(hobby);
					empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setisBusquedaDesdeForeignKeySesionHobby(true);
					empleadohobbyBeanSwingJInternalFrame.empleadohobbySessionBean.setlidHobbyActual(hobby.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadohobbyBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoHobby(empleadohobbyBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadohobbyBeanSwingJInternalFrame.setVisibilidadBusquedasParaHobby(true);
					empleadohobbyBeanSwingJInternalFrame.setid_hobbyFK_IdHobby(hobby.getId());

					if(!this.conCargarFormDetalle) {
						empleadohobbyBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadohobbyBeanSwingJInternalFrame.setSelectedItemCombosFrameHobbyForeignKey(hobby,1,false,true,true);
					empleadohobbyBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadohobbyBeanSwingJInternalFrame.procesarBusqueda("FK_IdHobby");
					empleadohobbyBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdHobby");
					empleadohobbyBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHobby(true);
					empleadohobbyBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoHobby("n",empleadohobbyBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadohobbyBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadohobbyBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadohobbyBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadohobbyBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHobby("relacionado");
					} else {
						empleadohobbyBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHobby("no_relacionado");
					}

					empleadohobbyBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoHobby().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarHobbyClienteBeanSwingJInternalFrame(List<Hobby> hobbys,Hobby hobby,HobbyClienteBeanSwingJInternalFrame hobbyclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//hobbyclienteBeanSwingJInternalFrame=new HobbyClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					hobbyclienteBeanSwingJInternalFrame.getHobbyClienteLogic().setConnexion(this.hobbyLogic.getConnexion());

					hobbyclienteBeanSwingJInternalFrame.sethobbysForeignKey(hobbys);
					hobbyclienteBeanSwingJInternalFrame.sethobbyForeignKey(hobby);
					hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setisBusquedaDesdeForeignKeySesionHobby(true);
					hobbyclienteBeanSwingJInternalFrame.hobbyclienteSessionBean.setlidHobbyActual(hobby.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					hobbyclienteBeanSwingJInternalFrame.cargarCombosForeignKeyHobbyCliente(hobbyclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					hobbyclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaHobby(true);
					hobbyclienteBeanSwingJInternalFrame.setid_hobbyFK_IdHobby(hobby.getId());

					if(!this.conCargarFormDetalle) {
						hobbyclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					hobbyclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameHobbyForeignKey(hobby,1,false,true,true);
					hobbyclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					hobbyclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdHobby");
					hobbyclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdHobby");
					hobbyclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaHobbyCliente(true);
					hobbyclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesHobbyCliente("n",hobbyclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, hobbyclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					hobbyclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					hobbyclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						hobbyclienteBeanSwingJInternalFrame.actualizarEstadoPanelsHobbyCliente("relacionado");
					} else {
						hobbyclienteBeanSwingJInternalFrame.actualizarEstadoPanelsHobbyCliente("no_relacionado");
					}

					hobbyclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionHobbyCliente().setVisible(false);

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
