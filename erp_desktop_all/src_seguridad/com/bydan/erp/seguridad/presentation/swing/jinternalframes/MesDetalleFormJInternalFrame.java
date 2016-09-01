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
import com.bydan.erp.seguridad.util.MesConstantesFunciones;

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
public class MesDetalleFormJInternalFrame extends MesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMes;
	
	protected JMenuBar jmenuBarDetalleMes;
	
	protected JMenu jmenuDetalleMes;
	protected JMenu jmenuDetalleArchivoMes;
	protected JMenu jmenuDetalleAccionesMes;
	protected JMenu jmenuDetalleDatosMes;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMes;	
	protected GridBagConstraints gridBagConstraintsMes;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MesBeanSwingJInternalFrameAdditional jInternalFrameDetalleMes;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public MesSessionBean mesSessionBean;
	
	
	
		
	
	public MesLogic mesLogic;
	
	public JScrollPane jScrollPanelDatosMes;
	public JScrollPane jScrollPanelDatosEdicionMes;
	public JScrollPane jScrollPanelDatosGeneralMes;
	
	protected JPanel jPanelCamposMes;    
	protected JPanel jPanelCamposOcultosMes;    	
	protected JPanel jPanelAccionesMes;
	protected JPanel jPanelAccionesFormularioMes;
    
	
	
	protected Integer iXPanelCamposMes=0;
	protected Integer iYPanelCamposMes=0;
	
	protected Integer iXPanelCamposOcultosMes=0;
	protected Integer iYPanelCamposOcultosMes=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMes;
	public JButton jButtonModificarMes;
	public JButton jButtonActualizarMes;
    public JButton jButtonEliminarMes;
	public JButton jButtonCancelarMes;
    public JButton jButtonGuardarCambiosMes;
	public JButton jButtonGuardarCambiosTablaMes;
	protected JButton jButtonCerrarMes;
	
	
	protected JButton jButtonProcesarInformacionMes;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMes;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMes;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMes;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMes;
	protected JButton jButtonModificarToolBarMes;
	protected JButton jButtonActualizarToolBarMes;
    protected JButton jButtonEliminarToolBarMes;
	protected JButton jButtonCancelarToolBarMes;
    protected JButton jButtonGuardarCambiosToolBarMes;
	protected JButton jButtonGuardarCambiosTablaToolBarMes;
	protected JButton jButtonMostrarOcultarTablaToolBarMes;
	protected JButton jButtonCerrarToolBarMes;
	
	protected JButton jButtonProcesarInformacionToolBarMes;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMes;
	protected JMenuItem jMenuItemModificarMes;
	protected JMenuItem jMenuItemActualizarMes;
    protected JMenuItem jMenuItemEliminarMes;
	protected JMenuItem jMenuItemCancelarMes;
    protected JMenuItem jMenuItemGuardarCambiosMes;
	protected JMenuItem jMenuItemGuardarCambiosTablaMes;
	protected JMenuItem jMenuItemCerrarMes;
	protected JMenuItem jMenuItemDetalleCerrarMes;
	protected JMenuItem jMenuItemDetalleMostarOcultarMes;
	
	protected JMenuItem jMenuItemProcesarInformacionMes;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMes;
	protected JMenuItem jMenuItemMostrarOcultarMes;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMes;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMes;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMes;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMes;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMes;
	public JLabel jLabelIdMes;
	public JTextFieldMe jTextFieldidMes;
	public JButton jButtonidMesBusqueda= new JButtonMe();

	public JPanel jPanelnombreMes;
	public JLabel jLabelnombreMes;
	public JTextField jTextFieldnombreMes;
	public JButton jButtonnombreMesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMes;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMes=new JPanel();
				this.jPanelAccionesFormularioMes=new JPanel();
				this.jmenuBarDetalleMes=new JMenuBar();
				this.jTtoolBarDetalleMes=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Mes No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMes() {
		return this.jButtonActualizarToolBarMes;
	}
	
	public JButton getjButtonEliminarToolBarMes() {
		return this.jButtonEliminarToolBarMes;
	}
	
	public JButton getjButtonCancelarToolBarMes() {
		return this.jButtonCancelarToolBarMes;
	}		
	
	public JButton getjButtonProcesarInformacionMes() {
		return this.jButtonProcesarInformacionMes;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMes)	{
		this.jButtonProcesarInformacionMes = jButtonProcesarInformacionMes;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMes() {
		return this.jComboBoxTiposAccionesMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMes(
			JComboBox jComboBoxTiposRelacionesMes) {
		this.jComboBoxTiposRelacionesMes = jComboBoxTiposRelacionesMes;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMes(
			JComboBox jComboBoxTiposAccionesMes) {
		this.jComboBoxTiposAccionesMes = jComboBoxTiposAccionesMes;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMes() {
		return this.jComboBoxTiposAccionesFormularioMes;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMes(
			JComboBox jComboBoxTiposAccionesFormularioMes) {
		this.jComboBoxTiposAccionesFormularioMes = jComboBoxTiposAccionesFormularioMes;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.mesSessionBean=new MesSessionBean();
		
		this.mesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mes MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
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
	
		MesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMes= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMes=new JButtonMe();
				this.jButtonModificarToolBarMes=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMes,this.jTtoolBarDetalleMes,
							"actualizar","actualizar","Actualizar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMes,this.jTtoolBarDetalleMes,
							"eliminar","eliminar","Eliminar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMes,this.jTtoolBarDetalleMes,
							"cancelar","cancelar","Cancelar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMes=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMes,this.jTtoolBarDetalleMes,
							"guardarcambios","guardarcambios","Guardar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMes,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMes,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMes=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMes=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMes=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMes=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMes=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMes= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMes.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMes,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMes= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMes.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMes,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMes= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMes.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMes,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMes= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMes.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMes,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMes= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMes.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMes,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMes= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMes.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMes,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMes= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMes.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMes,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMes,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMes= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMes.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMes,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMes, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMes.add(this.jMenuItemDetalleCerrarMes);
		
		this.jmenuDetalleAccionesMes.add(this.jMenuItemActualizarMes);
		this.jmenuDetalleAccionesMes.add(this.jMenuItemEliminarMes);
		this.jmenuDetalleAccionesMes.add(this.jMenuItemCancelarMes);		
		
		//this.jmenuDetalleDatosMes.add(this.jMenuItemDetalleAbrirOrderByMes);				
		this.jmenuDetalleDatosMes.add(this.jMenuItemDetalleMostarOcultarMes);				
				
		//this.jmenuDetalleAccionesMes.add(this.jMenuItemGuardarCambiosMes);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMes, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMes.add(this.jmenuDetalleArchivoMes);		
		this.jmenuBarDetalleMes.add(this.jmenuDetalleAccionesMes);		
		this.jmenuBarDetalleMes.add(this.jmenuDetalleDatosMes);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMes);				
	}
	
	
	public void inicializarElementosCamposMes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMes = new JLabelMe();
		jLabelIdMes.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMes = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMes.setToolTipText(MesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMes= new GridBagLayout();

		this.jPanelidMes.setLayout(this.gridaBagLayoutMes);

		jTextFieldidMes = new JTextFieldMe();
		jTextFieldidMes.setText("Id");

		jTextFieldidMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreMes = new JLabelMe();
		this.jLabelnombreMes.setText(""+MesConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreMes.setToolTipText("Nombre");
		this.jLabelnombreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreMes=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreMes.setToolTipText(MesConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutMes = new GridBagLayout();
		this.jPanelnombreMes.setLayout(this.gridaBagLayoutMes);


		jTextFieldnombreMes= new JTextFieldMe();

		jTextFieldnombreMes.setEnabled(false);
		jTextFieldnombreMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreMes,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreMesBusqueda= new JButtonMe();
		this.jButtonnombreMesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreMesBusqueda.setText("U");
		this.jButtonnombreMesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreMesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreMesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreMesBusqueda"));

		if(this.mesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreMesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMes() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleMes = new MesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Mes DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMes= new GridBagLayout();
		

		
		String sToolTipMes="";
		sToolTipMes=MesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMes+="(Seguridad.Mes)";
		}
		
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
			sToolTipMes+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMes = new JButtonMe();
		this.jButtonModificarMes = new JButtonMe();
        this.jButtonActualizarMes = new JButtonMe();
        this.jButtonEliminarMes = new JButtonMe();
        this.jButtonCancelarMes = new JButtonMe();
        this.jButtonGuardarCambiosMes = new JButtonMe();
		this.jButtonGuardarCambiosTablaMes = new JButtonMe();
		this.jButtonCerrarMes = new JButtonMe();
		
		this.jScrollPanelDatosMes = new JScrollPane();   
        this.jScrollPanelDatosEdicionMes = new JScrollPane();
		this.jScrollPanelDatosGeneralMes = new JScrollPane();
				
		
		
		this.jPanelCamposMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Mes";
		
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mess" + this.sPath));
		} else {
			this.jScrollPanelDatosMes.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMes.setName("jPanelCamposMes"); 

		this.jPanelCamposOcultosMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMes.setName("jPanelCamposOcultosMes"); 

        this.jPanelAccionesMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMes.setToolTipText("Acciones");
        this.jPanelAccionesMes.setName("Acciones"); 

		this.jPanelAccionesFormularioMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMes.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMes.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMes, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMes, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMes.setText("Nuevo");
		this.jButtonModificarMes.setText("Editar");
        this.jButtonActualizarMes.setText("Actualizar");
        this.jButtonEliminarMes.setText("Eliminar");
        this.jButtonCancelarMes.setText("Cancelar");
        this.jButtonGuardarCambiosMes.setText("Guardar");
		this.jButtonGuardarCambiosTablaMes.setText("Guardar");
		this.jButtonCerrarMes.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMes,"nuevo_button","Nuevo",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMes,"modificar_button","Editar",this.mesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMes,"actualizar_button","Actualizar",this.mesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMes,"eliminar_button","Eliminar",this.mesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMes,"cancelar_button","Cancelar",this.mesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMes,"guardarcambios_button","Guardar",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMes,"guardarcambiostabla_button","Guardar",this.mesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMes,"cerrar_button","Salir",this.mesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMes, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMes, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMes, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMes, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMes.setToolTipText("Nuevo"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMes.setToolTipText("Editar"+" "+MesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMes.setToolTipText("Actualizar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMes.setToolTipText("Eliminar)"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMes.setToolTipText("Cancelar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMes.setToolTipText("Guardar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMes.setToolTipText("Guardar"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMes.setToolTipText("Salir"+" "+MesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMes";
		inputMap = this.jButtonNuevoMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMes.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMes"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMes";
		inputMap = this.jButtonActualizarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMes"));
		
		//ELIMINAR
		sMapKey = "EliminarMes";
		inputMap = this.jButtonEliminarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMes"));
		
		//CANCELAR	
		sMapKey = "CancelarMes";
		inputMap = this.jButtonCancelarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMes"));
		
		//CERRAR		
		sMapKey = "CerrarMes";
		inputMap = this.jButtonCerrarMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMes"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMes";
		inputMap = this.jButtonGuardarCambiosTablaMes.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMes.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMes"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMes = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMes.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMes.setToolTipText("Nuevo Mes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMes.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMes.setToolTipText("Sin Cerrar Ventana Mes");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMes, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMes = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMes.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMes.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMes, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMes.setText("Accion");
		this.jComboBoxTiposAccionesMes.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMes = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMes.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMes.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMes = new JLabelMe();
		
		this.jLabelAccionesMes.setText("Acciones");		
		this.jLabelAccionesMes.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMes.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMes.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMes();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMes();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMes=new JTabbedPane();
		this.jTabbedPaneRelacionesMes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMes,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMes.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMes.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMes.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMes, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMes.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMes.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMes.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMes, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMes = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMes = new GridBagLayout();
		
		this.jPanelCamposMes.setLayout(gridaBagLayoutCamposMes);
		this.jPanelCamposOcultosMes.setLayout(gridaBagLayoutCamposOcultosMes);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMes = new GridBagConstraints();
	this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMes.gridy = 0;
	this.gridBagConstraintsMes.gridx = 0;
	this.gridBagConstraintsMes.ipadx = 0;
	this.gridBagConstraintsMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMes.add(jLabelIdMes, this.gridBagConstraintsMes);



	this.gridBagConstraintsMes = new GridBagConstraints();
	this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMes.gridy = 0;
	this.gridBagConstraintsMes.gridx = 1;
	this.gridBagConstraintsMes.ipadx = 0;
	this.gridBagConstraintsMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMes.add(jTextFieldidMes, this.gridBagConstraintsMes);


	this.gridBagConstraintsMes = new GridBagConstraints();
	this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMes.gridy = 0;
	this.gridBagConstraintsMes.gridx = 0;
	this.gridBagConstraintsMes.ipadx = 0;
	this.gridBagConstraintsMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreMes.add(jLabelnombreMes, this.gridBagConstraintsMes);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMes = new GridBagConstraints();
		//this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMes.gridy = 0;
		this.gridBagConstraintsMes.gridx = 2;
		this.gridBagConstraintsMes.ipadx = 0;
		this.gridBagConstraintsMes.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreMes.add(jButtonnombreMesBusqueda, this.gridBagConstraintsMes);
	}

	this.gridBagConstraintsMes = new GridBagConstraints();
	this.gridBagConstraintsMes.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMes.gridy = 0;
	this.gridBagConstraintsMes.gridx = 1;
	this.gridBagConstraintsMes.ipadx = 0;
	this.gridBagConstraintsMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreMes.add(jTextFieldnombreMes, this.gridBagConstraintsMes);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMes = new GridBagConstraints();
	this.gridBagConstraintsMes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMes.gridy = iYPanelCamposMes;
	this.gridBagConstraintsMes.gridx = iXPanelCamposMes++;
	this.gridBagConstraintsMes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMes.add(this.jPanelidMes, this.gridBagConstraintsMes);



	if(iXPanelCamposMes % 1==0) {
		iXPanelCamposMes=0;
		iYPanelCamposMes++;
	}
	this.gridBagConstraintsMes = new GridBagConstraints();
	this.gridBagConstraintsMes.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMes.gridy = iYPanelCamposMes;
	this.gridBagConstraintsMes.gridx = iXPanelCamposMes++;
	this.gridBagConstraintsMes.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMes.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMes.add(this.jPanelnombreMes, this.gridBagConstraintsMes);



	if(iXPanelCamposMes % 1==0) {
		iXPanelCamposMes=0;
		iYPanelCamposMes++;
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
			
		GridBagLayout gridaBagLayoutAccionesMes= new GridBagLayout();
		this.jPanelAccionesMes.setLayout(gridaBagLayoutAccionesMes);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMes= new GridBagLayout();
		this.jPanelAccionesFormularioMes.setLayout(gridaBagLayoutAccionesFormularioMes);
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMes.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMes.add(this.jComboBoxTiposAccionesFormularioMes, this.gridBagConstraintsMes);

		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMes.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMes.add(this.jCheckBoxPostAccionNuevoMes, this.gridBagConstraintsMes);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.mesSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMes.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMes.add(this.jCheckBoxPostAccionSinCerrarMes, this.gridBagConstraintsMes);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.mesSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.mesSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMes.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMes.add(this.jCheckBoxPostAccionSinMensajeMes, this.gridBagConstraintsMes);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = 0;
		this.gridBagConstraintsMes.gridx = iPosXAccion++;
			
		this.jPanelAccionesMes.add(this.jButtonModificarMes, this.gridBagConstraintsMes);							

		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMes.gridy = 0;
		this.gridBagConstraintsMes.gridx =iPosXAccion++;
			
		this.jPanelAccionesMes.add(this.jButtonEliminarMes, this.gridBagConstraintsMes);
		
			
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = 0;		
		this.gridBagConstraintsMes.gridx = iPosXAccion++;
		
		this.jPanelAccionesMes.add(this.jButtonActualizarMes, this.gridBagConstraintsMes);


		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = 0;		
		this.gridBagConstraintsMes.gridx = iPosXAccion++;
		
		this.jPanelAccionesMes.add(this.jButtonGuardarCambiosMes, this.gridBagConstraintsMes);	
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = 0;		
		this.gridBagConstraintsMes.gridx =iPosXAccion++;
		
		this.jPanelAccionesMes.add(this.jButtonCancelarMes, this.gridBagConstraintsMes);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMes = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMes);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMes = new GridBagConstraints();						
			this.gridBagConstraintsMes.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMes.gridx = 0;		
			//this.gridBagConstraintsMes.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMes.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMes.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMes.gridx =0;
		this.gridBagConstraintsMes.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMes.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMes, this.gridBagConstraintsMes);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMes = new MesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Mes DATOS");
			
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
			
	        //this.setTitle("[FOR] - Mes DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mes Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MesModel mesModel=new MesModel(this);
			
			//SI USARA CLASE INTERNA
			//MesModel.MesFocusTraversalPolicy mesFocusTraversalPolicy = mesModel.new MesFocusTraversalPolicy(this);
			
			//mesFocusTraversalPolicy.setmesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(mesModel);
			
			
			this.jContentPaneDetalleMes = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMes = new GridBagLayout();	
			this.jContentPaneDetalleMes.setLayout(gridaBagLayoutDetalleMes);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMes = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMes = new GridBagConstraints();
				this.gridBagConstraintsMes.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMes.gridx = 0;
					
				
				this.jContentPaneDetalleMes.add(jTtoolBarDetalleMes, gridBagConstraintsMes);								
				
}
			
			this.jScrollPanelDatosEdicionMes=   new JScrollPane(jContentPaneDetalleMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMes=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMes.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMes.gridx = 0;
	        
			this.jContentPaneDetalleMes.add(jPanelCamposMes, gridBagConstraintsMes);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& mesSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.mesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMes= new GridBagConstraints();
						this.gridBagConstraintsMes.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMes.gridx = 0;
						this.jContentPaneDetalleMes.add(this.jTabbedPaneRelacionesMes, this.gridBagConstraintsMes);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMes.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMes.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMes = new GridBagConstraints();
					this.gridBagConstraintsMes.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMes.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMes.gridx = 0;
					
				
					this.jContentPaneDetalleMes.add(jPanelCamposOcultosMes, gridBagConstraintsMes);
				
					this.jPanelCamposOcultosMes.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsMes.gridx = 0;
	        this.gridBagConstraintsMes.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMes.add(this.jPanelAccionesFormularioMes, this.gridBagConstraintsMes);							
			
			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
	        this.gridBagConstraintsMes.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsMes.gridx = 0;
	        
			
			this.jContentPaneDetalleMes.add(this.jPanelAccionesMes, this.gridBagConstraintsMes);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMes);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMes=   new JScrollPane(this.jPanelCamposMes,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMes.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMes.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMes.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMes.gridx = 0;
			this.gridBagConstraintsMes.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMes.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMes.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMes, this.gridBagConstraintsMes);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMes, this.gridBagConstraintsMes);			
			
			this.gridBagConstraintsMes = new GridBagConstraints();
			this.gridBagConstraintsMes.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMes.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMes, this.gridBagConstraintsMes);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMes, this.gridBagConstraintsMes);
			
			
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMes, this.gridBagConstraintsMes);
		
			
		this.gridBagConstraintsMes = new GridBagConstraints();
		this.gridBagConstraintsMes.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMes.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMes, this.gridBagConstraintsMes);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMes;//jContentPane;
		
		return jScrollPanelDatosEdicionMes;
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
