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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.PaqueteConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class PaqueteDetalleFormJInternalFrame extends PaqueteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePaquete;
	
	protected JMenuBar jmenuBarDetallePaquete;
	
	protected JMenu jmenuDetallePaquete;
	protected JMenu jmenuDetalleArchivoPaquete;
	protected JMenu jmenuDetalleAccionesPaquete;
	protected JMenu jmenuDetalleDatosPaquete;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPaquete;	
	protected GridBagConstraints gridBagConstraintsPaquete;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PaqueteBeanSwingJInternalFrameAdditional jInternalFrameDetallePaquete;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";
	
	public PaqueteSessionBean paqueteSessionBean;
	
	
	
	
	public SistemaSessionBean sistemaSessionBean;	
	
	public PaqueteLogic paqueteLogic;
	
	public JScrollPane jScrollPanelDatosPaquete;
	public JScrollPane jScrollPanelDatosEdicionPaquete;
	public JScrollPane jScrollPanelDatosGeneralPaquete;
	
	protected JPanel jPanelCamposPaquete;    
	protected JPanel jPanelCamposOcultosPaquete;    	
	protected JPanel jPanelAccionesPaquete;
	protected JPanel jPanelAccionesFormularioPaquete;
    
	
	
	protected Integer iXPanelCamposPaquete=0;
	protected Integer iYPanelCamposPaquete=0;
	
	protected Integer iXPanelCamposOcultosPaquete=0;
	protected Integer iYPanelCamposOcultosPaquete=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPaquete;
	public JButton jButtonModificarPaquete;
	public JButton jButtonActualizarPaquete;
    public JButton jButtonEliminarPaquete;
	public JButton jButtonCancelarPaquete;
    public JButton jButtonGuardarCambiosPaquete;
	public JButton jButtonGuardarCambiosTablaPaquete;
	protected JButton jButtonCerrarPaquete;
	
	
	protected JButton jButtonProcesarInformacionPaquete;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPaquete;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPaquete;
	protected JCheckBox jCheckBoxPostAccionSinMensajePaquete;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPaquete;
	protected JButton jButtonModificarToolBarPaquete;
	protected JButton jButtonActualizarToolBarPaquete;
    protected JButton jButtonEliminarToolBarPaquete;
	protected JButton jButtonCancelarToolBarPaquete;
    protected JButton jButtonGuardarCambiosToolBarPaquete;
	protected JButton jButtonGuardarCambiosTablaToolBarPaquete;
	protected JButton jButtonMostrarOcultarTablaToolBarPaquete;
	protected JButton jButtonCerrarToolBarPaquete;
	
	protected JButton jButtonProcesarInformacionToolBarPaquete;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPaquete;
	protected JMenuItem jMenuItemModificarPaquete;
	protected JMenuItem jMenuItemActualizarPaquete;
    protected JMenuItem jMenuItemEliminarPaquete;
	protected JMenuItem jMenuItemCancelarPaquete;
    protected JMenuItem jMenuItemGuardarCambiosPaquete;
	protected JMenuItem jMenuItemGuardarCambiosTablaPaquete;
	protected JMenuItem jMenuItemCerrarPaquete;
	protected JMenuItem jMenuItemDetalleCerrarPaquete;
	protected JMenuItem jMenuItemDetalleMostarOcultarPaquete;
	
	protected JMenuItem jMenuItemProcesarInformacionPaquete;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPaquete;
	protected JMenuItem jMenuItemMostrarOcultarPaquete;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPaquete;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPaquete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPaquete;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPaquete;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPaquete;
	public JLabel jLabelIdPaquete;
	public JLabel jLabelidPaquete;
	public JButton jButtonidPaqueteBusqueda= new JButtonMe();

	public JPanel jPanelnombrePaquete;
	public JLabel jLabelnombrePaquete;
	public JTextArea jTextAreanombrePaquete;
	public JScrollPane jscrollPanenombrePaquete;
	public JButton jButtonnombrePaqueteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPaquete;
	public JLabel jLabeldescripcionPaquete;
	public JTextArea jTextAreadescripcionPaquete;
	public JScrollPane jscrollPanedescripcionPaquete;
	public JButton jButtondescripcionPaqueteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaPaquete;
	public JLabel jLabelid_sistemaPaquete;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaPaquete;
	public JButton jButtonid_sistemaPaquete= new JButtonMe();
	public JButton jButtonid_sistemaPaqueteUpdate= new JButtonMe();
	public JButton jButtonid_sistemaPaqueteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPaquete;
	
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
	
	public PaqueteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPaquete=new JPanel();
				this.jPanelAccionesFormularioPaquete=new JPanel();
				this.jmenuBarDetallePaquete=new JMenuBar();
				this.jTtoolBarDetallePaquete=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaqueteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PaqueteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaqueteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaqueteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaqueteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Paquete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPaquete() {
		return this.jButtonActualizarToolBarPaquete;
	}
	
	public JButton getjButtonEliminarToolBarPaquete() {
		return this.jButtonEliminarToolBarPaquete;
	}
	
	public JButton getjButtonCancelarToolBarPaquete() {
		return this.jButtonCancelarToolBarPaquete;
	}		
	
	public JButton getjButtonProcesarInformacionPaquete() {
		return this.jButtonProcesarInformacionPaquete;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPaquete)	{
		this.jButtonProcesarInformacionPaquete = jButtonProcesarInformacionPaquete;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPaquete() {
		return this.jComboBoxTiposAccionesPaquete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPaquete(
			JComboBox jComboBoxTiposRelacionesPaquete) {
		this.jComboBoxTiposRelacionesPaquete = jComboBoxTiposRelacionesPaquete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPaquete(
			JComboBox jComboBoxTiposAccionesPaquete) {
		this.jComboBoxTiposAccionesPaquete = jComboBoxTiposAccionesPaquete;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPaquete() {
		return this.jComboBoxTiposAccionesFormularioPaquete;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPaquete(
			JComboBox jComboBoxTiposAccionesFormularioPaquete) {
		this.jComboBoxTiposAccionesFormularioPaquete = jComboBoxTiposAccionesFormularioPaquete;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.paqueteSessionBean=new PaqueteSessionBean();
		
		this.paqueteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.paqueteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.paqueteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PaqueteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PaqueteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Paquete MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
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
	
		PaqueteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePaquete= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPaquete=new JButtonMe();
				this.jButtonModificarToolBarPaquete=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPaquete,this.jTtoolBarDetallePaquete,
							"actualizar","actualizar","Actualizar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPaquete,this.jTtoolBarDetallePaquete,
							"eliminar","eliminar","Eliminar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPaquete,this.jTtoolBarDetallePaquete,
							"cancelar","cancelar","Cancelar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPaquete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPaquete,this.jTtoolBarDetallePaquete,
							"guardarcambios","guardarcambios","Guardar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPaquete,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPaquete,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPaquete,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePaquete=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePaquete=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPaquete=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPaquete=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPaquete=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPaquete= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPaquete.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPaquete,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPaquete= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPaquete.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPaquete,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPaquete= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPaquete.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPaquete,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPaquete= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPaquete.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPaquete,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPaquete= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPaquete.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPaquete,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPaquete= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPaquete.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPaquete,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPaquete= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPaquete.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPaquete,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPaquete= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPaquete.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPaquete,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPaquete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPaquete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPaquete,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPaquete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPaquete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPaquete,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPaquete.add(this.jMenuItemDetalleCerrarPaquete);
		
		this.jmenuDetalleAccionesPaquete.add(this.jMenuItemActualizarPaquete);
		this.jmenuDetalleAccionesPaquete.add(this.jMenuItemEliminarPaquete);
		this.jmenuDetalleAccionesPaquete.add(this.jMenuItemCancelarPaquete);		
		
		//this.jmenuDetalleDatosPaquete.add(this.jMenuItemDetalleAbrirOrderByPaquete);				
		this.jmenuDetalleDatosPaquete.add(this.jMenuItemDetalleMostarOcultarPaquete);				
				
		//this.jmenuDetalleAccionesPaquete.add(this.jMenuItemGuardarCambiosPaquete);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePaquete.add(this.jmenuDetalleArchivoPaquete);		
		this.jmenuBarDetallePaquete.add(this.jmenuDetalleAccionesPaquete);		
		this.jmenuBarDetallePaquete.add(this.jmenuDetalleDatosPaquete);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePaquete);				
	}
	
	
	public void inicializarElementosCamposPaquete() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPaquete = new JLabelMe();
		jLabelIdPaquete.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPaquete,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPaquete = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPaquete.setToolTipText(PaqueteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPaquete= new GridBagLayout();

		this.jPanelidPaquete.setLayout(this.gridaBagLayoutPaquete);

		jLabelidPaquete = new JLabel();
		jLabelidPaquete.setText("Id");

		jLabelidPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombrePaquete = new JLabelMe();
		this.jLabelnombrePaquete.setText(""+PaqueteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePaquete.setToolTipText("Nombre");
		this.jLabelnombrePaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePaquete,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePaquete=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePaquete.setToolTipText(PaqueteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPaquete = new GridBagLayout();
		this.jPanelnombrePaquete.setLayout(this.gridaBagLayoutPaquete);


		jTextAreanombrePaquete= new JTextAreaMe();
		jTextAreanombrePaquete.setEnabled(false);
		jTextAreanombrePaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePaquete.setLineWrap(true);
		jTextAreanombrePaquete.setWrapStyleWord(true);
		jTextAreanombrePaquete.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePaquete.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePaquete,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePaquete = new JScrollPane(jTextAreanombrePaquete);
		jscrollPanenombrePaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePaqueteBusqueda= new JButtonMe();
		this.jButtonnombrePaqueteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePaqueteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePaqueteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePaqueteBusqueda.setText("U");
		this.jButtonnombrePaqueteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePaqueteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePaqueteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePaqueteBusqueda"));

		if(this.paqueteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePaqueteBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPaquete = new JLabelMe();
		this.jLabeldescripcionPaquete.setText(""+PaqueteConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPaquete.setToolTipText("Descripcion");
		this.jLabeldescripcionPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPaquete,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPaquete=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPaquete.setToolTipText(PaqueteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPaquete = new GridBagLayout();
		this.jPaneldescripcionPaquete.setLayout(this.gridaBagLayoutPaquete);


		jTextAreadescripcionPaquete= new JTextAreaMe();
		jTextAreadescripcionPaquete.setEnabled(false);
		jTextAreadescripcionPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPaquete.setLineWrap(true);
		jTextAreadescripcionPaquete.setWrapStyleWord(true);
		jTextAreadescripcionPaquete.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPaquete.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPaquete,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPaquete = new JScrollPane(jTextAreadescripcionPaquete);
		jscrollPanedescripcionPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPaqueteBusqueda= new JButtonMe();
		this.jButtondescripcionPaqueteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPaqueteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPaqueteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPaqueteBusqueda.setText("U");
		this.jButtondescripcionPaqueteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPaqueteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPaqueteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPaqueteBusqueda"));

		if(this.paqueteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPaqueteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPaquete() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_sistemaPaquete = new JLabelMe();
		this.jLabelid_sistemaPaquete.setText(""+PaqueteConstantesFunciones.LABEL_IDSISTEMA+" : *");
		this.jLabelid_sistemaPaquete.setToolTipText("Sistema");
		this.jLabelid_sistemaPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaPaquete,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sistemaPaquete=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sistemaPaquete.setToolTipText(PaqueteConstantesFunciones.LABEL_IDSISTEMA);
		this.gridaBagLayoutPaquete = new GridBagLayout();
		this.jPanelid_sistemaPaquete.setLayout(this.gridaBagLayoutPaquete);


		jComboBoxid_sistemaPaquete= new JComboBoxMe();
		jComboBoxid_sistemaPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaPaquete,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sistemaPaquete= new JButtonMe();
		this.jButtonid_sistemaPaquete.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPaquete.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPaquete.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaPaquete.setText("Buscar");
		this.jButtonid_sistemaPaquete.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sistemaPaquete.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPaquete,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sistemaPaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPaquete"));

		this.jButtonid_sistemaPaqueteBusqueda= new JButtonMe();
		this.jButtonid_sistemaPaqueteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPaqueteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPaqueteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaPaqueteBusqueda.setText("U");
		this.jButtonid_sistemaPaqueteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sistemaPaqueteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPaqueteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sistemaPaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPaqueteBusqueda"));

		if(this.paqueteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sistemaPaqueteBusqueda.setVisible(false);		}

		this.jButtonid_sistemaPaqueteUpdate= new JButtonMe();
		this.jButtonid_sistemaPaqueteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPaqueteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaPaqueteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaPaqueteUpdate.setText("U");
		this.jButtonid_sistemaPaqueteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sistemaPaqueteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaPaqueteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sistemaPaquete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaPaquete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaPaqueteUpdate"));



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
		//this.jInternalFrameDetallePaquete = new PaqueteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Paquete DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPaquete= new GridBagLayout();
		

		
		String sToolTipPaquete="";
		sToolTipPaquete=PaqueteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPaquete+="(Seguridad.Paquete)";
		}
		
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
			sToolTipPaquete+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPaquete = new JButtonMe();
		this.jButtonModificarPaquete = new JButtonMe();
        this.jButtonActualizarPaquete = new JButtonMe();
        this.jButtonEliminarPaquete = new JButtonMe();
        this.jButtonCancelarPaquete = new JButtonMe();
        this.jButtonGuardarCambiosPaquete = new JButtonMe();
		this.jButtonGuardarCambiosTablaPaquete = new JButtonMe();
		this.jButtonCerrarPaquete = new JButtonMe();
		
		this.jScrollPanelDatosPaquete = new JScrollPane();   
        this.jScrollPanelDatosEdicionPaquete = new JScrollPane();
		this.jScrollPanelDatosGeneralPaquete = new JScrollPane();
				
		
		
		this.jPanelCamposPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Paquete";
		
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paquetes" + this.sPath));
		} else {
			this.jScrollPanelDatosPaquete.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPaquete.setName("jPanelCamposPaquete"); 

		this.jPanelCamposOcultosPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPaquete.setName("jPanelCamposOcultosPaquete"); 

        this.jPanelAccionesPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPaquete.setToolTipText("Acciones");
        this.jPanelAccionesPaquete.setName("Acciones"); 

		this.jPanelAccionesFormularioPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPaquete.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPaquete.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPaquete, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPaquete.setText("Nuevo");
		this.jButtonModificarPaquete.setText("Editar");
        this.jButtonActualizarPaquete.setText("Actualizar");
        this.jButtonEliminarPaquete.setText("Eliminar");
        this.jButtonCancelarPaquete.setText("Cancelar");
        this.jButtonGuardarCambiosPaquete.setText("Guardar");
		this.jButtonGuardarCambiosTablaPaquete.setText("Guardar");
		this.jButtonCerrarPaquete.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPaquete,"nuevo_button","Nuevo",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPaquete,"modificar_button","Editar",this.paqueteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPaquete,"actualizar_button","Actualizar",this.paqueteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPaquete,"eliminar_button","Eliminar",this.paqueteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPaquete,"cancelar_button","Cancelar",this.paqueteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPaquete,"guardarcambios_button","Guardar",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPaquete,"guardarcambiostabla_button","Guardar",this.paqueteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPaquete,"cerrar_button","Salir",this.paqueteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPaquete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPaquete.setToolTipText("Nuevo"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPaquete.setToolTipText("Editar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPaquete.setToolTipText("Actualizar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPaquete.setToolTipText("Eliminar)"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPaquete.setToolTipText("Cancelar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPaquete.setToolTipText("Guardar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPaquete.setToolTipText("Guardar"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPaquete.setToolTipText("Salir"+" "+PaqueteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPaquete";
		inputMap = this.jButtonNuevoPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPaquete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPaquete"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPaquete";
		inputMap = this.jButtonActualizarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPaquete"));
		
		//ELIMINAR
		sMapKey = "EliminarPaquete";
		inputMap = this.jButtonEliminarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPaquete"));
		
		//CANCELAR	
		sMapKey = "CancelarPaquete";
		inputMap = this.jButtonCancelarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPaquete"));
		
		//CERRAR		
		sMapKey = "CerrarPaquete";
		inputMap = this.jButtonCerrarPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPaquete"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPaquete";
		inputMap = this.jButtonGuardarCambiosTablaPaquete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPaquete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPaquete"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPaquete = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPaquete.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPaquete.setToolTipText("Nuevo Paquete");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPaquete = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPaquete.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPaquete.setToolTipText("Sin Cerrar Ventana Paquete");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPaquete, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePaquete = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePaquete.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePaquete.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePaquete, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPaquete = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPaquete.setText("Accion");
		this.jComboBoxTiposAccionesPaquete.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPaquete = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPaquete.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPaquete.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPaquete = new JLabelMe();
		
		this.jLabelAccionesPaquete.setText("Acciones");		
		this.jLabelAccionesPaquete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPaquete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPaquete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPaquete();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPaquete();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPaquete=new JTabbedPane();
		this.jTabbedPaneRelacionesPaquete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPaquete,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPaquete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPaquete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPaquete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPaquete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPaquete.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPaquete.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPaquete.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPaquete, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPaquete = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPaquete = new GridBagLayout();
		
		this.jPanelCamposPaquete.setLayout(gridaBagLayoutCamposPaquete);
		this.jPanelCamposOcultosPaquete.setLayout(gridaBagLayoutCamposOcultosPaquete);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 0;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPaquete.add(jLabelIdPaquete, this.gridBagConstraintsPaquete);



	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 1;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPaquete.add(jLabelidPaquete, this.gridBagConstraintsPaquete);


	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 0;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sistemaPaquete.add(jLabelid_sistemaPaquete, this.gridBagConstraintsPaquete);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPaquete = new GridBagConstraints();
		//this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = 0;
		this.gridBagConstraintsPaquete.gridx = 2;
		this.gridBagConstraintsPaquete.ipadx = 0;
		this.gridBagConstraintsPaquete.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaPaquete.add(jButtonid_sistemaPaqueteBusqueda, this.gridBagConstraintsPaquete);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPaquete = new GridBagConstraints();
		//this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = 0;
		this.gridBagConstraintsPaquete.gridx = 3;
		this.gridBagConstraintsPaquete.ipadx = 0;
		this.gridBagConstraintsPaquete.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaPaquete.add(jButtonid_sistemaPaqueteUpdate, this.gridBagConstraintsPaquete);
	}

	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 1;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sistemaPaquete.add(jComboBoxid_sistemaPaquete, this.gridBagConstraintsPaquete);


	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 0;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePaquete.add(jLabelnombrePaquete, this.gridBagConstraintsPaquete);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPaquete = new GridBagConstraints();
		//this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = 0;
		this.gridBagConstraintsPaquete.gridx = 2;
		this.gridBagConstraintsPaquete.ipadx = 0;
		this.gridBagConstraintsPaquete.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePaquete.add(jButtonnombrePaqueteBusqueda, this.gridBagConstraintsPaquete);
	}

	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 1;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePaquete.add(jscrollPanenombrePaquete, this.gridBagConstraintsPaquete);


	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 0;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPaquete.add(jLabeldescripcionPaquete, this.gridBagConstraintsPaquete);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPaquete = new GridBagConstraints();
		//this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPaquete.gridy = 0;
		this.gridBagConstraintsPaquete.gridx = 2;
		this.gridBagConstraintsPaquete.ipadx = 0;
		this.gridBagConstraintsPaquete.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPaquete.add(jButtondescripcionPaqueteBusqueda, this.gridBagConstraintsPaquete);
	}

	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPaquete.gridy = 0;
	this.gridBagConstraintsPaquete.gridx = 1;
	this.gridBagConstraintsPaquete.ipadx = 0;
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPaquete.add(jscrollPanedescripcionPaquete, this.gridBagConstraintsPaquete);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPaquete.gridy = iYPanelCamposPaquete;
	this.gridBagConstraintsPaquete.gridx = iXPanelCamposPaquete++;
	this.gridBagConstraintsPaquete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPaquete.add(this.jPanelidPaquete, this.gridBagConstraintsPaquete);



	if(iXPanelCamposPaquete % 1==0) {
		iXPanelCamposPaquete=0;
		iYPanelCamposPaquete++;
	}
	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPaquete.gridy = iYPanelCamposPaquete;
	this.gridBagConstraintsPaquete.gridx = iXPanelCamposPaquete++;
	this.gridBagConstraintsPaquete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPaquete.add(this.jPanelid_sistemaPaquete, this.gridBagConstraintsPaquete);



	if(iXPanelCamposPaquete % 1==0) {
		iXPanelCamposPaquete=0;
		iYPanelCamposPaquete++;
	}
	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPaquete.gridy = iYPanelCamposPaquete;
	this.gridBagConstraintsPaquete.gridx = iXPanelCamposPaquete++;
	this.gridBagConstraintsPaquete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPaquete.add(this.jPanelnombrePaquete, this.gridBagConstraintsPaquete);



	if(iXPanelCamposPaquete % 1==0) {
		iXPanelCamposPaquete=0;
		iYPanelCamposPaquete++;
	}
	this.gridBagConstraintsPaquete = new GridBagConstraints();
	this.gridBagConstraintsPaquete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPaquete.gridy = iYPanelCamposPaquete;
	this.gridBagConstraintsPaquete.gridx = iXPanelCamposPaquete++;
	this.gridBagConstraintsPaquete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPaquete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPaquete.add(this.jPaneldescripcionPaquete, this.gridBagConstraintsPaquete);



	if(iXPanelCamposPaquete % 1==0) {
		iXPanelCamposPaquete=0;
		iYPanelCamposPaquete++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesPaquete= new GridBagLayout();
		this.jPanelAccionesPaquete.setLayout(gridaBagLayoutAccionesPaquete);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPaquete= new GridBagLayout();
		this.jPanelAccionesFormularioPaquete.setLayout(gridaBagLayoutAccionesFormularioPaquete);
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPaquete.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPaquete.add(this.jComboBoxTiposAccionesFormularioPaquete, this.gridBagConstraintsPaquete);

		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPaquete.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPaquete.add(this.jCheckBoxPostAccionNuevoPaquete, this.gridBagConstraintsPaquete);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.paqueteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPaquete.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPaquete.add(this.jCheckBoxPostAccionSinCerrarPaquete, this.gridBagConstraintsPaquete);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.paqueteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.paqueteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPaquete.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPaquete.add(this.jCheckBoxPostAccionSinMensajePaquete, this.gridBagConstraintsPaquete);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = 0;
		this.gridBagConstraintsPaquete.gridx = iPosXAccion++;
			
		this.jPanelAccionesPaquete.add(this.jButtonModificarPaquete, this.gridBagConstraintsPaquete);							

		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPaquete.gridy = 0;
		this.gridBagConstraintsPaquete.gridx =iPosXAccion++;
			
		this.jPanelAccionesPaquete.add(this.jButtonEliminarPaquete, this.gridBagConstraintsPaquete);
		
			
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = 0;		
		this.gridBagConstraintsPaquete.gridx = iPosXAccion++;
		
		this.jPanelAccionesPaquete.add(this.jButtonActualizarPaquete, this.gridBagConstraintsPaquete);


		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = 0;		
		this.gridBagConstraintsPaquete.gridx = iPosXAccion++;
		
		this.jPanelAccionesPaquete.add(this.jButtonGuardarCambiosPaquete, this.gridBagConstraintsPaquete);	
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = 0;		
		this.gridBagConstraintsPaquete.gridx =iPosXAccion++;
		
		this.jPanelAccionesPaquete.add(this.jButtonCancelarPaquete, this.gridBagConstraintsPaquete);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPaquete = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPaquete);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.paqueteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPaquete = new GridBagConstraints();						
			this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPaquete.gridx = 0;		
			//this.gridBagConstraintsPaquete.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPaquete.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPaquete.gridx =0;
		this.gridBagConstraintsPaquete.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPaquete.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPaquete, this.gridBagConstraintsPaquete);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PaqueteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePaquete = new PaqueteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Paquete DATOS");
			
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
			
	        //this.setTitle("[FOR] - Paquete DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Paquete Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PaqueteModel paqueteModel=new PaqueteModel(this);
			
			//SI USARA CLASE INTERNA
			//PaqueteModel.PaqueteFocusTraversalPolicy paqueteFocusTraversalPolicy = paqueteModel.new PaqueteFocusTraversalPolicy(this);
			
			//paqueteFocusTraversalPolicy.setpaqueteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(paqueteModel);
			
			
			this.jContentPaneDetallePaquete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePaquete = new GridBagLayout();	
			this.jContentPaneDetallePaquete.setLayout(gridaBagLayoutDetallePaquete);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPaquete = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPaquete = new GridBagConstraints();
				this.gridBagConstraintsPaquete.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPaquete.gridx = 0;
					
				
				this.jContentPaneDetallePaquete.add(jTtoolBarDetallePaquete, gridBagConstraintsPaquete);								
				
}
			
			this.jScrollPanelDatosEdicionPaquete=   new JScrollPane(jContentPaneDetallePaquete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPaquete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPaquete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPaquete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPaquete=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPaquete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPaquete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPaquete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPaquete.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPaquete.gridx = 0;
	        
			this.jContentPaneDetallePaquete.add(jPanelCamposPaquete, gridBagConstraintsPaquete);
			
			
			
			
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
						&& paqueteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.paqueteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPaquete= new GridBagConstraints();
						this.gridBagConstraintsPaquete.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPaquete.gridx = 0;
						this.jContentPaneDetallePaquete.add(this.jTabbedPaneRelacionesPaquete, this.gridBagConstraintsPaquete);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPaquete.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPaquete.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPaquete = new GridBagConstraints();
					this.gridBagConstraintsPaquete.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPaquete.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPaquete.gridx = 0;
					
				
					this.jContentPaneDetallePaquete.add(jPanelCamposOcultosPaquete, gridBagConstraintsPaquete);
				
					this.jPanelCamposOcultosPaquete.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPaquete.gridx = 0;
	        this.gridBagConstraintsPaquete.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePaquete.add(this.jPanelAccionesFormularioPaquete, this.gridBagConstraintsPaquete);							
			
			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
	        this.gridBagConstraintsPaquete.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPaquete.gridx = 0;
	        
			
			this.jContentPaneDetallePaquete.add(this.jPanelAccionesPaquete, this.gridBagConstraintsPaquete);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPaquete);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPaquete=   new JScrollPane(this.jPanelCamposPaquete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPaquete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPaquete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPaquete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPaquete.gridx = 0;
			this.gridBagConstraintsPaquete.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPaquete.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPaquete.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPaquete, this.gridBagConstraintsPaquete);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPaquete.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPaquete, this.gridBagConstraintsPaquete);			
			
			this.gridBagConstraintsPaquete = new GridBagConstraints();
			this.gridBagConstraintsPaquete.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPaquete.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPaquete, this.gridBagConstraintsPaquete);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPaquete, this.gridBagConstraintsPaquete);
			
			
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPaquete, this.gridBagConstraintsPaquete);
		
			
		this.gridBagConstraintsPaquete = new GridBagConstraints();
		this.gridBagConstraintsPaquete.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPaquete.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPaquete, this.gridBagConstraintsPaquete);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPaquete;//jContentPane;
		
		return jScrollPanelDatosEdicionPaquete;
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
