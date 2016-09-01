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
import com.bydan.erp.cartera.util.ClaseClienteConstantesFunciones;

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
public class ClaseClienteDetalleFormJInternalFrame extends ClaseClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleClaseCliente;
	
	protected JMenuBar jmenuBarDetalleClaseCliente;
	
	protected JMenu jmenuDetalleClaseCliente;
	protected JMenu jmenuDetalleArchivoClaseCliente;
	protected JMenu jmenuDetalleAccionesClaseCliente;
	protected JMenu jmenuDetalleDatosClaseCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClaseCliente;	
	protected GridBagConstraints gridBagConstraintsClaseCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ClaseClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleClaseCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ClaseClienteSessionBean claseclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ClaseClienteLogic claseclienteLogic;
	
	public JScrollPane jScrollPanelDatosClaseCliente;
	public JScrollPane jScrollPanelDatosEdicionClaseCliente;
	public JScrollPane jScrollPanelDatosGeneralClaseCliente;
	
	protected JPanel jPanelCamposClaseCliente;    
	protected JPanel jPanelCamposOcultosClaseCliente;    	
	protected JPanel jPanelAccionesClaseCliente;
	protected JPanel jPanelAccionesFormularioClaseCliente;
    
	
	
	protected Integer iXPanelCamposClaseCliente=0;
	protected Integer iYPanelCamposClaseCliente=0;
	
	protected Integer iXPanelCamposOcultosClaseCliente=0;
	protected Integer iYPanelCamposOcultosClaseCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoClaseCliente;
	public JButton jButtonModificarClaseCliente;
	public JButton jButtonActualizarClaseCliente;
    public JButton jButtonEliminarClaseCliente;
	public JButton jButtonCancelarClaseCliente;
    public JButton jButtonGuardarCambiosClaseCliente;
	public JButton jButtonGuardarCambiosTablaClaseCliente;
	protected JButton jButtonCerrarClaseCliente;
	
	
	protected JButton jButtonProcesarInformacionClaseCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoClaseCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarClaseCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeClaseCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClaseCliente;
	protected JButton jButtonModificarToolBarClaseCliente;
	protected JButton jButtonActualizarToolBarClaseCliente;
    protected JButton jButtonEliminarToolBarClaseCliente;
	protected JButton jButtonCancelarToolBarClaseCliente;
    protected JButton jButtonGuardarCambiosToolBarClaseCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarClaseCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarClaseCliente;
	protected JButton jButtonCerrarToolBarClaseCliente;
	
	protected JButton jButtonProcesarInformacionToolBarClaseCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClaseCliente;
	protected JMenuItem jMenuItemModificarClaseCliente;
	protected JMenuItem jMenuItemActualizarClaseCliente;
    protected JMenuItem jMenuItemEliminarClaseCliente;
	protected JMenuItem jMenuItemCancelarClaseCliente;
    protected JMenuItem jMenuItemGuardarCambiosClaseCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaClaseCliente;
	protected JMenuItem jMenuItemCerrarClaseCliente;
	protected JMenuItem jMenuItemDetalleCerrarClaseCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarClaseCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionClaseCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClaseCliente;
	protected JMenuItem jMenuItemMostrarOcultarClaseCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClaseCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClaseCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClaseCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioClaseCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidClaseCliente;
	public JLabel jLabelIdClaseCliente;
	public JLabel jLabelidClaseCliente;
	public JButton jButtonidClaseClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoClaseCliente;
	public JLabel jLabelcodigoClaseCliente;
	public JTextField jTextFieldcodigoClaseCliente;
	public JButton jButtoncodigoClaseClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreClaseCliente;
	public JLabel jLabelnombreClaseCliente;
	public JTextArea jTextAreanombreClaseCliente;
	public JScrollPane jscrollPanenombreClaseCliente;
	public JButton jButtonnombreClaseClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaClaseCliente;
	public JLabel jLabelid_empresaClaseCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaClaseCliente;
	public JButton jButtonid_empresaClaseCliente= new JButtonMe();
	public JButton jButtonid_empresaClaseClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaClaseClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesClaseCliente;
	
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
	
	public ClaseClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposClaseCliente=new JPanel();
				this.jPanelAccionesFormularioClaseCliente=new JPanel();
				this.jmenuBarDetalleClaseCliente=new JMenuBar();
				this.jTtoolBarDetalleClaseCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ClaseClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClaseClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClaseCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarClaseCliente() {
		return this.jButtonActualizarToolBarClaseCliente;
	}
	
	public JButton getjButtonEliminarToolBarClaseCliente() {
		return this.jButtonEliminarToolBarClaseCliente;
	}
	
	public JButton getjButtonCancelarToolBarClaseCliente() {
		return this.jButtonCancelarToolBarClaseCliente;
	}		
	
	public JButton getjButtonProcesarInformacionClaseCliente() {
		return this.jButtonProcesarInformacionClaseCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClaseCliente)	{
		this.jButtonProcesarInformacionClaseCliente = jButtonProcesarInformacionClaseCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClaseCliente() {
		return this.jComboBoxTiposAccionesClaseCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClaseCliente(
			JComboBox jComboBoxTiposRelacionesClaseCliente) {
		this.jComboBoxTiposRelacionesClaseCliente = jComboBoxTiposRelacionesClaseCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClaseCliente(
			JComboBox jComboBoxTiposAccionesClaseCliente) {
		this.jComboBoxTiposAccionesClaseCliente = jComboBoxTiposAccionesClaseCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioClaseCliente() {
		return this.jComboBoxTiposAccionesFormularioClaseCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioClaseCliente(
			JComboBox jComboBoxTiposAccionesFormularioClaseCliente) {
		this.jComboBoxTiposAccionesFormularioClaseCliente = jComboBoxTiposAccionesFormularioClaseCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.claseclienteSessionBean=new ClaseClienteSessionBean();
		
		this.claseclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.claseclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.claseclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClaseClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClaseClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClaseClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Clase Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		ClaseClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleClaseCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarClaseCliente=new JButtonMe();
				this.jButtonModificarToolBarClaseCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarClaseCliente,this.jTtoolBarDetalleClaseCliente,
							"actualizar","actualizar","Actualizar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarClaseCliente,this.jTtoolBarDetalleClaseCliente,
							"eliminar","eliminar","Eliminar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarClaseCliente,this.jTtoolBarDetalleClaseCliente,
							"cancelar","cancelar","Cancelar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarClaseCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarClaseCliente,this.jTtoolBarDetalleClaseCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleClaseCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleClaseCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoClaseCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesClaseCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosClaseCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClaseCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClaseCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClaseCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarClaseCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarClaseCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarClaseCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarClaseCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarClaseCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarClaseCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarClaseCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarClaseCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarClaseCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarClaseCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarClaseCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarClaseCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosClaseCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClaseCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClaseCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClaseCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClaseCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClaseCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarClaseCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarClaseCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarClaseCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClaseCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClaseCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClaseCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClaseCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClaseCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClaseCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoClaseCliente.add(this.jMenuItemDetalleCerrarClaseCliente);
		
		this.jmenuDetalleAccionesClaseCliente.add(this.jMenuItemActualizarClaseCliente);
		this.jmenuDetalleAccionesClaseCliente.add(this.jMenuItemEliminarClaseCliente);
		this.jmenuDetalleAccionesClaseCliente.add(this.jMenuItemCancelarClaseCliente);		
		
		//this.jmenuDetalleDatosClaseCliente.add(this.jMenuItemDetalleAbrirOrderByClaseCliente);				
		this.jmenuDetalleDatosClaseCliente.add(this.jMenuItemDetalleMostarOcultarClaseCliente);				
				
		//this.jmenuDetalleAccionesClaseCliente.add(this.jMenuItemGuardarCambiosClaseCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleClaseCliente.add(this.jmenuDetalleArchivoClaseCliente);		
		this.jmenuBarDetalleClaseCliente.add(this.jmenuDetalleAccionesClaseCliente);		
		this.jmenuBarDetalleClaseCliente.add(this.jmenuDetalleDatosClaseCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleClaseCliente);				
	}
	
	
	public void inicializarElementosCamposClaseCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdClaseCliente = new JLabelMe();
		jLabelIdClaseCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidClaseCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidClaseCliente.setToolTipText(ClaseClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutClaseCliente= new GridBagLayout();

		this.jPanelidClaseCliente.setLayout(this.gridaBagLayoutClaseCliente);

		jLabelidClaseCliente = new JLabel();
		jLabelidClaseCliente.setText("Id");

		jLabelidClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoClaseCliente = new JLabelMe();
		this.jLabelcodigoClaseCliente.setText(""+ClaseClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoClaseCliente.setToolTipText("Codigo");
		this.jLabelcodigoClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoClaseCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoClaseCliente.setToolTipText(ClaseClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutClaseCliente = new GridBagLayout();
		this.jPanelcodigoClaseCliente.setLayout(this.gridaBagLayoutClaseCliente);


		jTextFieldcodigoClaseCliente= new JTextFieldMe();

		jTextFieldcodigoClaseCliente.setEnabled(false);
		jTextFieldcodigoClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoClaseClienteBusqueda= new JButtonMe();
		this.jButtoncodigoClaseClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoClaseClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoClaseClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoClaseClienteBusqueda.setText("U");
		this.jButtoncodigoClaseClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoClaseClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoClaseClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoClaseClienteBusqueda"));

		if(this.claseclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoClaseClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreClaseCliente = new JLabelMe();
		this.jLabelnombreClaseCliente.setText(""+ClaseClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreClaseCliente.setToolTipText("Nombre");
		this.jLabelnombreClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreClaseCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreClaseCliente.setToolTipText(ClaseClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutClaseCliente = new GridBagLayout();
		this.jPanelnombreClaseCliente.setLayout(this.gridaBagLayoutClaseCliente);


		jTextAreanombreClaseCliente= new JTextAreaMe();
		jTextAreanombreClaseCliente.setEnabled(false);
		jTextAreanombreClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreClaseCliente.setLineWrap(true);
		jTextAreanombreClaseCliente.setWrapStyleWord(true);
		jTextAreanombreClaseCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreClaseCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreClaseCliente = new JScrollPane(jTextAreanombreClaseCliente);
		jscrollPanenombreClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreClaseClienteBusqueda= new JButtonMe();
		this.jButtonnombreClaseClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClaseClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreClaseClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreClaseClienteBusqueda.setText("U");
		this.jButtonnombreClaseClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreClaseClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreClaseClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreClaseClienteBusqueda"));

		if(this.claseclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreClaseClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysClaseCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaClaseCliente = new JLabelMe();
		this.jLabelid_empresaClaseCliente.setText(""+ClaseClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaClaseCliente.setToolTipText("Empresa");
		this.jLabelid_empresaClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaClaseCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaClaseCliente.setToolTipText(ClaseClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutClaseCliente = new GridBagLayout();
		this.jPanelid_empresaClaseCliente.setLayout(this.gridaBagLayoutClaseCliente);


		jComboBoxid_empresaClaseCliente= new JComboBoxMe();
		jComboBoxid_empresaClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaClaseCliente.setEnabled(false);

		this.jButtonid_empresaClaseCliente= new JButtonMe();
		this.jButtonid_empresaClaseCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClaseCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClaseCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClaseCliente.setText("Buscar");
		this.jButtonid_empresaClaseCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaClaseCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClaseCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClaseCliente"));

		this.jButtonid_empresaClaseClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaClaseClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClaseClienteBusqueda.setText("U");
		this.jButtonid_empresaClaseClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaClaseClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClaseClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClaseClienteBusqueda"));

		if(this.claseclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaClaseClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaClaseClienteUpdate= new JButtonMe();
		this.jButtonid_empresaClaseClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClaseClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClaseClienteUpdate.setText("U");
		this.jButtonid_empresaClaseClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaClaseClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClaseClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaClaseCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClaseCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClaseClienteUpdate"));



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
		//this.jInternalFrameDetalleClaseCliente = new ClaseClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Clase Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClaseCliente= new GridBagLayout();
		

		
		String sToolTipClaseCliente="";
		sToolTipClaseCliente=ClaseClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClaseCliente+="(Cartera.ClaseCliente)";
		}
		
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipClaseCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoClaseCliente = new JButtonMe();
		this.jButtonModificarClaseCliente = new JButtonMe();
        this.jButtonActualizarClaseCliente = new JButtonMe();
        this.jButtonEliminarClaseCliente = new JButtonMe();
        this.jButtonCancelarClaseCliente = new JButtonMe();
        this.jButtonGuardarCambiosClaseCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaClaseCliente = new JButtonMe();
		this.jButtonCerrarClaseCliente = new JButtonMe();
		
		this.jScrollPanelDatosClaseCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionClaseCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralClaseCliente = new JScrollPane();
				
		
		
		this.jPanelCamposClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Clase Cliente";
		
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Clase Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosClaseCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposClaseCliente.setName("jPanelCamposClaseCliente"); 

		this.jPanelCamposOcultosClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosClaseCliente.setName("jPanelCamposOcultosClaseCliente"); 

        this.jPanelAccionesClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClaseCliente.setToolTipText("Acciones");
        this.jPanelAccionesClaseCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioClaseCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioClaseCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoClaseCliente.setText("Nuevo");
		this.jButtonModificarClaseCliente.setText("Editar");
        this.jButtonActualizarClaseCliente.setText("Actualizar");
        this.jButtonEliminarClaseCliente.setText("Eliminar");
        this.jButtonCancelarClaseCliente.setText("Cancelar");
        this.jButtonGuardarCambiosClaseCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaClaseCliente.setText("Guardar");
		this.jButtonCerrarClaseCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClaseCliente,"nuevo_button","Nuevo",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarClaseCliente,"modificar_button","Editar",this.claseclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarClaseCliente,"actualizar_button","Actualizar",this.claseclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarClaseCliente,"eliminar_button","Eliminar",this.claseclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarClaseCliente,"cancelar_button","Cancelar",this.claseclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosClaseCliente,"guardarcambios_button","Guardar",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClaseCliente,"guardarcambiostabla_button","Guardar",this.claseclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClaseCliente,"cerrar_button","Salir",this.claseclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoClaseCliente.setToolTipText("Nuevo"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarClaseCliente.setToolTipText("Editar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarClaseCliente.setToolTipText("Actualizar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarClaseCliente.setToolTipText("Eliminar)"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarClaseCliente.setToolTipText("Cancelar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosClaseCliente.setToolTipText("Guardar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaClaseCliente.setToolTipText("Guardar"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClaseCliente.setToolTipText("Salir"+" "+ClaseClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClaseCliente";
		inputMap = this.jButtonNuevoClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClaseCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClaseCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarClaseCliente";
		inputMap = this.jButtonActualizarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarClaseCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarClaseCliente";
		inputMap = this.jButtonEliminarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarClaseCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarClaseCliente";
		inputMap = this.jButtonCancelarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarClaseCliente"));
		
		//CERRAR		
		sMapKey = "CerrarClaseCliente";
		inputMap = this.jButtonCerrarClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClaseCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClaseCliente";
		inputMap = this.jButtonGuardarCambiosTablaClaseCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClaseCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClaseCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoClaseCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoClaseCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoClaseCliente.setToolTipText("Nuevo ClaseCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarClaseCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarClaseCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarClaseCliente.setToolTipText("Sin Cerrar Ventana ClaseCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeClaseCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeClaseCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeClaseCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClaseCliente.setText("Accion");
		this.jComboBoxTiposAccionesClaseCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioClaseCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioClaseCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioClaseCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesClaseCliente = new JLabelMe();
		
		this.jLabelAccionesClaseCliente.setText("Acciones");		
		this.jLabelAccionesClaseCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClaseCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposClaseCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysClaseCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesClaseCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesClaseCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesClaseCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesClaseCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClaseCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClaseCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioClaseCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClaseCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClaseCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioClaseCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposClaseCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosClaseCliente = new GridBagLayout();
		
		this.jPanelCamposClaseCliente.setLayout(gridaBagLayoutCamposClaseCliente);
		this.jPanelCamposOcultosClaseCliente.setLayout(gridaBagLayoutCamposOcultosClaseCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 0;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidClaseCliente.add(jLabelIdClaseCliente, this.gridBagConstraintsClaseCliente);



	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 1;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidClaseCliente.add(jLabelidClaseCliente, this.gridBagConstraintsClaseCliente);


	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 0;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaClaseCliente.add(jLabelid_empresaClaseCliente, this.gridBagConstraintsClaseCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		//this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = 0;
		this.gridBagConstraintsClaseCliente.gridx = 2;
		this.gridBagConstraintsClaseCliente.ipadx = 0;
		this.gridBagConstraintsClaseCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClaseCliente.add(jButtonid_empresaClaseClienteBusqueda, this.gridBagConstraintsClaseCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		//this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = 0;
		this.gridBagConstraintsClaseCliente.gridx = 3;
		this.gridBagConstraintsClaseCliente.ipadx = 0;
		this.gridBagConstraintsClaseCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClaseCliente.add(jButtonid_empresaClaseClienteUpdate, this.gridBagConstraintsClaseCliente);
	}

	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 1;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaClaseCliente.add(jComboBoxid_empresaClaseCliente, this.gridBagConstraintsClaseCliente);


	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 0;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoClaseCliente.add(jLabelcodigoClaseCliente, this.gridBagConstraintsClaseCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		//this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = 0;
		this.gridBagConstraintsClaseCliente.gridx = 2;
		this.gridBagConstraintsClaseCliente.ipadx = 0;
		this.gridBagConstraintsClaseCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoClaseCliente.add(jButtoncodigoClaseClienteBusqueda, this.gridBagConstraintsClaseCliente);
	}

	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 1;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoClaseCliente.add(jTextFieldcodigoClaseCliente, this.gridBagConstraintsClaseCliente);


	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 0;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreClaseCliente.add(jLabelnombreClaseCliente, this.gridBagConstraintsClaseCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		//this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClaseCliente.gridy = 0;
		this.gridBagConstraintsClaseCliente.gridx = 2;
		this.gridBagConstraintsClaseCliente.ipadx = 0;
		this.gridBagConstraintsClaseCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreClaseCliente.add(jButtonnombreClaseClienteBusqueda, this.gridBagConstraintsClaseCliente);
	}

	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClaseCliente.gridy = 0;
	this.gridBagConstraintsClaseCliente.gridx = 1;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreClaseCliente.add(jscrollPanenombreClaseCliente, this.gridBagConstraintsClaseCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseCliente.gridy = iYPanelCamposClaseCliente;
	this.gridBagConstraintsClaseCliente.gridx = iXPanelCamposClaseCliente++;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClaseCliente.add(this.jPanelidClaseCliente, this.gridBagConstraintsClaseCliente);



	if(iXPanelCamposClaseCliente % 1==0) {
		iXPanelCamposClaseCliente=0;
		iYPanelCamposClaseCliente++;
	}
	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseCliente.gridy = iYPanelCamposClaseCliente;
	this.gridBagConstraintsClaseCliente.gridx = iXPanelCamposClaseCliente++;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClaseCliente.add(this.jPanelcodigoClaseCliente, this.gridBagConstraintsClaseCliente);



	if(iXPanelCamposClaseCliente % 1==0) {
		iXPanelCamposClaseCliente=0;
		iYPanelCamposClaseCliente++;
	}
	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseCliente.gridy = iYPanelCamposClaseCliente;
	this.gridBagConstraintsClaseCliente.gridx = iXPanelCamposClaseCliente++;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClaseCliente.add(this.jPanelnombreClaseCliente, this.gridBagConstraintsClaseCliente);



	if(iXPanelCamposClaseCliente % 1==0) {
		iXPanelCamposClaseCliente=0;
		iYPanelCamposClaseCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClaseCliente.gridy = iYPanelCamposOcultosClaseCliente;
	this.gridBagConstraintsClaseCliente.gridx = iXPanelCamposOcultosClaseCliente++;
	this.gridBagConstraintsClaseCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClaseCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosClaseCliente.add(this.jPanelid_empresaClaseCliente, this.gridBagConstraintsClaseCliente);



	if(iXPanelCamposOcultosClaseCliente % 1==0) {
		iXPanelCamposOcultosClaseCliente=0;
		iYPanelCamposOcultosClaseCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesClaseCliente= new GridBagLayout();
		this.jPanelAccionesClaseCliente.setLayout(gridaBagLayoutAccionesClaseCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioClaseCliente= new GridBagLayout();
		this.jPanelAccionesFormularioClaseCliente.setLayout(gridaBagLayoutAccionesFormularioClaseCliente);
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClaseCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClaseCliente.add(this.jComboBoxTiposAccionesFormularioClaseCliente, this.gridBagConstraintsClaseCliente);

		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClaseCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClaseCliente.add(this.jCheckBoxPostAccionNuevoClaseCliente, this.gridBagConstraintsClaseCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.claseclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClaseCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClaseCliente.add(this.jCheckBoxPostAccionSinCerrarClaseCliente, this.gridBagConstraintsClaseCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.claseclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.claseclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClaseCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClaseCliente.add(this.jCheckBoxPostAccionSinMensajeClaseCliente, this.gridBagConstraintsClaseCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = 0;
		this.gridBagConstraintsClaseCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesClaseCliente.add(this.jButtonModificarClaseCliente, this.gridBagConstraintsClaseCliente);							

		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClaseCliente.gridy = 0;
		this.gridBagConstraintsClaseCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesClaseCliente.add(this.jButtonEliminarClaseCliente, this.gridBagConstraintsClaseCliente);
		
			
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = 0;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesClaseCliente.add(this.jButtonActualizarClaseCliente, this.gridBagConstraintsClaseCliente);


		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = 0;		
		this.gridBagConstraintsClaseCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesClaseCliente.add(this.jButtonGuardarCambiosClaseCliente, this.gridBagConstraintsClaseCliente);	
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = 0;		
		this.gridBagConstraintsClaseCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesClaseCliente.add(this.jButtonCancelarClaseCliente, this.gridBagConstraintsClaseCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClaseCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClaseCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.claseclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();						
			this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClaseCliente.gridx = 0;		
			//this.gridBagConstraintsClaseCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClaseCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClaseCliente.gridx =0;
		this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClaseCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClaseCliente, this.gridBagConstraintsClaseCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ClaseClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleClaseCliente = new ClaseClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Clase Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Clase Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Clase Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ClaseClienteModel claseclienteModel=new ClaseClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//ClaseClienteModel.ClaseClienteFocusTraversalPolicy claseclienteFocusTraversalPolicy = claseclienteModel.new ClaseClienteFocusTraversalPolicy(this);
			
			//claseclienteFocusTraversalPolicy.setclaseclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(claseclienteModel);
			
			
			this.jContentPaneDetalleClaseCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleClaseCliente = new GridBagLayout();	
			this.jContentPaneDetalleClaseCliente.setLayout(gridaBagLayoutDetalleClaseCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClaseCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsClaseCliente = new GridBagConstraints();
				this.gridBagConstraintsClaseCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsClaseCliente.gridx = 0;
					
				
				this.jContentPaneDetalleClaseCliente.add(jTtoolBarDetalleClaseCliente, gridBagConstraintsClaseCliente);								
				
}
			
			this.jScrollPanelDatosEdicionClaseCliente=   new JScrollPane(jContentPaneDetalleClaseCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClaseCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralClaseCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClaseCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClaseCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsClaseCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsClaseCliente.gridx = 0;
	        
			this.jContentPaneDetalleClaseCliente.add(jPanelCamposClaseCliente, gridBagConstraintsClaseCliente);
			
			
			
			
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
						&& claseclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.claseclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsClaseCliente= new GridBagConstraints();
						this.gridBagConstraintsClaseCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsClaseCliente.gridx = 0;
						this.jContentPaneDetalleClaseCliente.add(this.jTabbedPaneRelacionesClaseCliente, this.gridBagConstraintsClaseCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesClaseCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosClaseCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsClaseCliente = new GridBagConstraints();
					this.gridBagConstraintsClaseCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsClaseCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsClaseCliente.gridx = 0;
					
				
					this.jContentPaneDetalleClaseCliente.add(jPanelCamposOcultosClaseCliente, gridBagConstraintsClaseCliente);
				
					this.jPanelCamposOcultosClaseCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsClaseCliente.gridx = 0;
	        this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleClaseCliente.add(this.jPanelAccionesFormularioClaseCliente, this.gridBagConstraintsClaseCliente);							
			
			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
	        this.gridBagConstraintsClaseCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsClaseCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleClaseCliente.add(this.jPanelAccionesClaseCliente, this.gridBagConstraintsClaseCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionClaseCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionClaseCliente=   new JScrollPane(this.jPanelCamposClaseCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClaseCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClaseCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsClaseCliente.gridx = 0;
			this.gridBagConstraintsClaseCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsClaseCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsClaseCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionClaseCliente, this.gridBagConstraintsClaseCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClaseCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioClaseCliente, this.gridBagConstraintsClaseCliente);			
			
			this.gridBagConstraintsClaseCliente = new GridBagConstraints();
			this.gridBagConstraintsClaseCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClaseCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesClaseCliente, this.gridBagConstraintsClaseCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClaseCliente, this.gridBagConstraintsClaseCliente);
			
			
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClaseCliente, this.gridBagConstraintsClaseCliente);
		
			
		this.gridBagConstraintsClaseCliente = new GridBagConstraints();
		this.gridBagConstraintsClaseCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClaseCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClaseCliente, this.gridBagConstraintsClaseCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralClaseCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionClaseCliente;
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
