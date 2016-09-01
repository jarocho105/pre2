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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.nomina.util.SeguroConstantesFunciones;

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
public class SeguroDetalleFormJInternalFrame extends SeguroBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSeguro;
	
	protected JMenuBar jmenuBarDetalleSeguro;
	
	protected JMenu jmenuDetalleSeguro;
	protected JMenu jmenuDetalleArchivoSeguro;
	protected JMenu jmenuDetalleAccionesSeguro;
	protected JMenu jmenuDetalleDatosSeguro;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSeguro;	
	protected GridBagConstraints gridBagConstraintsSeguro;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SeguroBeanSwingJInternalFrameAdditional jInternalFrameDetalleSeguro;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public SeguroSessionBean seguroSessionBean;
	
	
	
	
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public SeguroLogic seguroLogic;
	
	public JScrollPane jScrollPanelDatosSeguro;
	public JScrollPane jScrollPanelDatosEdicionSeguro;
	public JScrollPane jScrollPanelDatosGeneralSeguro;
	
	protected JPanel jPanelCamposSeguro;    
	protected JPanel jPanelCamposOcultosSeguro;    	
	protected JPanel jPanelAccionesSeguro;
	protected JPanel jPanelAccionesFormularioSeguro;
    
	
	
	protected Integer iXPanelCamposSeguro=0;
	protected Integer iYPanelCamposSeguro=0;
	
	protected Integer iXPanelCamposOcultosSeguro=0;
	protected Integer iYPanelCamposOcultosSeguro=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSeguro;
	public JButton jButtonModificarSeguro;
	public JButton jButtonActualizarSeguro;
    public JButton jButtonEliminarSeguro;
	public JButton jButtonCancelarSeguro;
    public JButton jButtonGuardarCambiosSeguro;
	public JButton jButtonGuardarCambiosTablaSeguro;
	protected JButton jButtonCerrarSeguro;
	
	
	protected JButton jButtonProcesarInformacionSeguro;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSeguro;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSeguro;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSeguro;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSeguro;
	protected JButton jButtonModificarToolBarSeguro;
	protected JButton jButtonActualizarToolBarSeguro;
    protected JButton jButtonEliminarToolBarSeguro;
	protected JButton jButtonCancelarToolBarSeguro;
    protected JButton jButtonGuardarCambiosToolBarSeguro;
	protected JButton jButtonGuardarCambiosTablaToolBarSeguro;
	protected JButton jButtonMostrarOcultarTablaToolBarSeguro;
	protected JButton jButtonCerrarToolBarSeguro;
	
	protected JButton jButtonProcesarInformacionToolBarSeguro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSeguro;
	protected JMenuItem jMenuItemModificarSeguro;
	protected JMenuItem jMenuItemActualizarSeguro;
    protected JMenuItem jMenuItemEliminarSeguro;
	protected JMenuItem jMenuItemCancelarSeguro;
    protected JMenuItem jMenuItemGuardarCambiosSeguro;
	protected JMenuItem jMenuItemGuardarCambiosTablaSeguro;
	protected JMenuItem jMenuItemCerrarSeguro;
	protected JMenuItem jMenuItemDetalleCerrarSeguro;
	protected JMenuItem jMenuItemDetalleMostarOcultarSeguro;
	
	protected JMenuItem jMenuItemProcesarInformacionSeguro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSeguro;
	protected JMenuItem jMenuItemMostrarOcultarSeguro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSeguro;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSeguro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSeguro;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSeguro;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSeguro;
	public JLabel jLabelIdSeguro;
	public JLabel jLabelidSeguro;
	public JButton jButtonidSeguroBusqueda= new JButtonMe();

	public JPanel jPanelnombreSeguro;
	public JLabel jLabelnombreSeguro;
	public JTextArea jTextAreanombreSeguro;
	public JScrollPane jscrollPanenombreSeguro;
	public JButton jButtonnombreSeguroBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empleadoSeguro;
	public JLabel jLabelid_empleadoSeguro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoSeguro;
	public JButton jButtonid_empleadoSeguro= new JButtonMe();
	public JButton jButtonid_empleadoSeguroUpdate= new JButtonMe();
	public JButton jButtonid_empleadoSeguroBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSeguro;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SeguroDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSeguro=new JPanel();
				this.jPanelAccionesFormularioSeguro=new JPanel();
				this.jmenuBarDetalleSeguro=new JMenuBar();
				this.jTtoolBarDetalleSeguro=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguroDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SeguroDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguroDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguroDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SeguroDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Seguro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSeguro() {
		return this.jButtonActualizarToolBarSeguro;
	}
	
	public JButton getjButtonEliminarToolBarSeguro() {
		return this.jButtonEliminarToolBarSeguro;
	}
	
	public JButton getjButtonCancelarToolBarSeguro() {
		return this.jButtonCancelarToolBarSeguro;
	}		
	
	public JButton getjButtonProcesarInformacionSeguro() {
		return this.jButtonProcesarInformacionSeguro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSeguro)	{
		this.jButtonProcesarInformacionSeguro = jButtonProcesarInformacionSeguro;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSeguro() {
		return this.jComboBoxTiposAccionesSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSeguro(
			JComboBox jComboBoxTiposRelacionesSeguro) {
		this.jComboBoxTiposRelacionesSeguro = jComboBoxTiposRelacionesSeguro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSeguro(
			JComboBox jComboBoxTiposAccionesSeguro) {
		this.jComboBoxTiposAccionesSeguro = jComboBoxTiposAccionesSeguro;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSeguro() {
		return this.jComboBoxTiposAccionesFormularioSeguro;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSeguro(
			JComboBox jComboBoxTiposAccionesFormularioSeguro) {
		this.jComboBoxTiposAccionesFormularioSeguro = jComboBoxTiposAccionesFormularioSeguro;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.seguroSessionBean=new SeguroSessionBean();
		
		this.seguroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.seguroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.seguroSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SeguroJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SeguroJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SeguroJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Seguro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
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
	
		SeguroJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSeguro= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSeguro=new JButtonMe();
				this.jButtonModificarToolBarSeguro=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSeguro,this.jTtoolBarDetalleSeguro,
							"actualizar","actualizar","Actualizar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSeguro,this.jTtoolBarDetalleSeguro,
							"eliminar","eliminar","Eliminar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSeguro,this.jTtoolBarDetalleSeguro,
							"cancelar","cancelar","Cancelar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSeguro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSeguro,this.jTtoolBarDetalleSeguro,
							"guardarcambios","guardarcambios","Guardar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSeguro=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSeguro=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSeguro=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSeguro=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSeguro=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSeguro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSeguro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSeguro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSeguro= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSeguro.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSeguro,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSeguro= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSeguro.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSeguro,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSeguro= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSeguro.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSeguro,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSeguro= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSeguro.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSeguro,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSeguro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSeguro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSeguro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSeguro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSeguro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSeguro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSeguro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSeguro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSeguro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSeguro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSeguro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSeguro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSeguro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSeguro.add(this.jMenuItemDetalleCerrarSeguro);
		
		this.jmenuDetalleAccionesSeguro.add(this.jMenuItemActualizarSeguro);
		this.jmenuDetalleAccionesSeguro.add(this.jMenuItemEliminarSeguro);
		this.jmenuDetalleAccionesSeguro.add(this.jMenuItemCancelarSeguro);		
		
		//this.jmenuDetalleDatosSeguro.add(this.jMenuItemDetalleAbrirOrderBySeguro);				
		this.jmenuDetalleDatosSeguro.add(this.jMenuItemDetalleMostarOcultarSeguro);				
				
		//this.jmenuDetalleAccionesSeguro.add(this.jMenuItemGuardarCambiosSeguro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSeguro.add(this.jmenuDetalleArchivoSeguro);		
		this.jmenuBarDetalleSeguro.add(this.jmenuDetalleAccionesSeguro);		
		this.jmenuBarDetalleSeguro.add(this.jmenuDetalleDatosSeguro);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSeguro);				
	}
	
	
	public void inicializarElementosCamposSeguro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSeguro = new JLabelMe();
		jLabelIdSeguro.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSeguro = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSeguro.setToolTipText(SeguroConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSeguro= new GridBagLayout();

		this.jPanelidSeguro.setLayout(this.gridaBagLayoutSeguro);

		jLabelidSeguro = new JLabel();
		jLabelidSeguro.setText("Id");

		jLabelidSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreSeguro = new JLabelMe();
		this.jLabelnombreSeguro.setText(""+SeguroConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreSeguro.setToolTipText("Nombre");
		this.jLabelnombreSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreSeguro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreSeguro.setToolTipText(SeguroConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutSeguro = new GridBagLayout();
		this.jPanelnombreSeguro.setLayout(this.gridaBagLayoutSeguro);


		jTextAreanombreSeguro= new JTextAreaMe();
		jTextAreanombreSeguro.setEnabled(false);
		jTextAreanombreSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreSeguro.setLineWrap(true);
		jTextAreanombreSeguro.setWrapStyleWord(true);
		jTextAreanombreSeguro.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreSeguro.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreSeguro = new JScrollPane(jTextAreanombreSeguro);
		jscrollPanenombreSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreSeguroBusqueda= new JButtonMe();
		this.jButtonnombreSeguroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSeguroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreSeguroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreSeguroBusqueda.setText("U");
		this.jButtonnombreSeguroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreSeguroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreSeguroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreSeguroBusqueda"));

		if(this.seguroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreSeguroBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSeguro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empleadoSeguro = new JLabelMe();
		this.jLabelid_empleadoSeguro.setText(""+SeguroConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoSeguro.setToolTipText("Empleado");
		this.jLabelid_empleadoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoSeguro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoSeguro.setToolTipText(SeguroConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutSeguro = new GridBagLayout();
		this.jPanelid_empleadoSeguro.setLayout(this.gridaBagLayoutSeguro);


		jComboBoxid_empleadoSeguro= new JComboBoxMe();
		jComboBoxid_empleadoSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoSeguro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoSeguro= new JButtonMe();
		this.jButtonid_empleadoSeguro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSeguro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSeguro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoSeguro.setText("Buscar");
		this.jButtonid_empleadoSeguro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoSeguro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSeguro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSeguro"));

		this.jButtonid_empleadoSeguroBusqueda= new JButtonMe();
		this.jButtonid_empleadoSeguroBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSeguroBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSeguroBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSeguroBusqueda.setText("U");
		this.jButtonid_empleadoSeguroBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoSeguroBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSeguroBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSeguroBusqueda"));

		if(this.seguroSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoSeguroBusqueda.setVisible(false);		}

		this.jButtonid_empleadoSeguroUpdate= new JButtonMe();
		this.jButtonid_empleadoSeguroUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSeguroUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoSeguroUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoSeguroUpdate.setText("U");
		this.jButtonid_empleadoSeguroUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoSeguroUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoSeguroUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoSeguro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoSeguro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoSeguroUpdate"));



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
		//this.jInternalFrameDetalleSeguro = new SeguroBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Seguro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSeguro= new GridBagLayout();
		

		
		String sToolTipSeguro="";
		sToolTipSeguro=SeguroConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSeguro+="(Nomina.Seguro)";
		}
		
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
			sToolTipSeguro+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSeguro = new JButtonMe();
		this.jButtonModificarSeguro = new JButtonMe();
        this.jButtonActualizarSeguro = new JButtonMe();
        this.jButtonEliminarSeguro = new JButtonMe();
        this.jButtonCancelarSeguro = new JButtonMe();
        this.jButtonGuardarCambiosSeguro = new JButtonMe();
		this.jButtonGuardarCambiosTablaSeguro = new JButtonMe();
		this.jButtonCerrarSeguro = new JButtonMe();
		
		this.jScrollPanelDatosSeguro = new JScrollPane();   
        this.jScrollPanelDatosEdicionSeguro = new JScrollPane();
		this.jScrollPanelDatosGeneralSeguro = new JScrollPane();
				
		
		
		this.jPanelCamposSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Seguro";
		
		if(!this.seguroSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seguros" + this.sPath));
		} else {
			this.jScrollPanelDatosSeguro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSeguro.setName("jPanelCamposSeguro"); 

		this.jPanelCamposOcultosSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSeguro.setName("jPanelCamposOcultosSeguro"); 

        this.jPanelAccionesSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSeguro.setToolTipText("Acciones");
        this.jPanelAccionesSeguro.setName("Acciones"); 

		this.jPanelAccionesFormularioSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSeguro.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSeguro.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSeguro, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSeguro.setText("Nuevo");
		this.jButtonModificarSeguro.setText("Editar");
        this.jButtonActualizarSeguro.setText("Actualizar");
        this.jButtonEliminarSeguro.setText("Eliminar");
        this.jButtonCancelarSeguro.setText("Cancelar");
        this.jButtonGuardarCambiosSeguro.setText("Guardar");
		this.jButtonGuardarCambiosTablaSeguro.setText("Guardar");
		this.jButtonCerrarSeguro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSeguro,"nuevo_button","Nuevo",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSeguro,"modificar_button","Editar",this.seguroSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSeguro,"actualizar_button","Actualizar",this.seguroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSeguro,"eliminar_button","Eliminar",this.seguroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSeguro,"cancelar_button","Cancelar",this.seguroSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSeguro,"guardarcambios_button","Guardar",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSeguro,"guardarcambiostabla_button","Guardar",this.seguroSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSeguro,"cerrar_button","Salir",this.seguroSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSeguro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSeguro.setToolTipText("Nuevo"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSeguro.setToolTipText("Editar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSeguro.setToolTipText("Actualizar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSeguro.setToolTipText("Eliminar)"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSeguro.setToolTipText("Cancelar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSeguro.setToolTipText("Guardar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSeguro.setToolTipText("Guardar"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSeguro.setToolTipText("Salir"+" "+SeguroConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSeguro";
		inputMap = this.jButtonNuevoSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSeguro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSeguro"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSeguro";
		inputMap = this.jButtonActualizarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSeguro"));
		
		//ELIMINAR
		sMapKey = "EliminarSeguro";
		inputMap = this.jButtonEliminarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSeguro"));
		
		//CANCELAR	
		sMapKey = "CancelarSeguro";
		inputMap = this.jButtonCancelarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSeguro"));
		
		//CERRAR		
		sMapKey = "CerrarSeguro";
		inputMap = this.jButtonCerrarSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSeguro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSeguro";
		inputMap = this.jButtonGuardarCambiosTablaSeguro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSeguro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSeguro"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSeguro = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSeguro.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSeguro.setToolTipText("Nuevo Seguro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSeguro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSeguro.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSeguro.setToolTipText("Sin Cerrar Ventana Seguro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSeguro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSeguro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSeguro.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSeguro.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSeguro, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSeguro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSeguro.setText("Accion");
		this.jComboBoxTiposAccionesSeguro.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSeguro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSeguro.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSeguro.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSeguro = new JLabelMe();
		
		this.jLabelAccionesSeguro.setText("Acciones");		
		this.jLabelAccionesSeguro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSeguro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSeguro();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSeguro();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSeguro=new JTabbedPane();
		this.jTabbedPaneRelacionesSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSeguro,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSeguro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSeguro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSeguro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSeguro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSeguro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSeguro.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSeguro, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSeguro = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSeguro = new GridBagLayout();
		
		this.jPanelCamposSeguro.setLayout(gridaBagLayoutCamposSeguro);
		this.jPanelCamposOcultosSeguro.setLayout(gridaBagLayoutCamposOcultosSeguro);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguro.gridy = 0;
	this.gridBagConstraintsSeguro.gridx = 0;
	this.gridBagConstraintsSeguro.ipadx = 0;
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSeguro.add(jLabelIdSeguro, this.gridBagConstraintsSeguro);



	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguro.gridy = 0;
	this.gridBagConstraintsSeguro.gridx = 1;
	this.gridBagConstraintsSeguro.ipadx = 0;
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSeguro.add(jLabelidSeguro, this.gridBagConstraintsSeguro);


	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguro.gridy = 0;
	this.gridBagConstraintsSeguro.gridx = 0;
	this.gridBagConstraintsSeguro.ipadx = 0;
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoSeguro.add(jLabelid_empleadoSeguro, this.gridBagConstraintsSeguro);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSeguro = new GridBagConstraints();
	//this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguro.gridy = 0;
	this.gridBagConstraintsSeguro.gridx = 2;
	this.gridBagConstraintsSeguro.ipadx = 0;
	this.gridBagConstraintsSeguro.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoSeguro.add(jButtonid_empleadoSeguro, this.gridBagConstraintsSeguro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSeguro = new GridBagConstraints();
		//this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = 0;
		this.gridBagConstraintsSeguro.gridx = 3;
		this.gridBagConstraintsSeguro.ipadx = 0;
		this.gridBagConstraintsSeguro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSeguro.add(jButtonid_empleadoSeguroBusqueda, this.gridBagConstraintsSeguro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSeguro = new GridBagConstraints();
		//this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = 0;
		this.gridBagConstraintsSeguro.gridx = 4;
		this.gridBagConstraintsSeguro.ipadx = 0;
		this.gridBagConstraintsSeguro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoSeguro.add(jButtonid_empleadoSeguroUpdate, this.gridBagConstraintsSeguro);
	}

	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguro.gridy = 0;
	this.gridBagConstraintsSeguro.gridx = 1;
	this.gridBagConstraintsSeguro.ipadx = 0;
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoSeguro.add(jComboBoxid_empleadoSeguro, this.gridBagConstraintsSeguro);


	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguro.gridy = 0;
	this.gridBagConstraintsSeguro.gridx = 0;
	this.gridBagConstraintsSeguro.ipadx = 0;
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreSeguro.add(jLabelnombreSeguro, this.gridBagConstraintsSeguro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSeguro = new GridBagConstraints();
		//this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSeguro.gridy = 0;
		this.gridBagConstraintsSeguro.gridx = 2;
		this.gridBagConstraintsSeguro.ipadx = 0;
		this.gridBagConstraintsSeguro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreSeguro.add(jButtonnombreSeguroBusqueda, this.gridBagConstraintsSeguro);
	}

	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSeguro.gridy = 0;
	this.gridBagConstraintsSeguro.gridx = 1;
	this.gridBagConstraintsSeguro.ipadx = 0;
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreSeguro.add(jscrollPanenombreSeguro, this.gridBagConstraintsSeguro);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSeguro.gridy = iYPanelCamposSeguro;
	this.gridBagConstraintsSeguro.gridx = iXPanelCamposSeguro++;
	this.gridBagConstraintsSeguro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSeguro.add(this.jPanelidSeguro, this.gridBagConstraintsSeguro);



	if(iXPanelCamposSeguro % 1==0) {
		iXPanelCamposSeguro=0;
		iYPanelCamposSeguro++;
	}
	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSeguro.gridy = iYPanelCamposSeguro;
	this.gridBagConstraintsSeguro.gridx = iXPanelCamposSeguro++;
	this.gridBagConstraintsSeguro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSeguro.add(this.jPanelid_empleadoSeguro, this.gridBagConstraintsSeguro);



	if(iXPanelCamposSeguro % 1==0) {
		iXPanelCamposSeguro=0;
		iYPanelCamposSeguro++;
	}
	this.gridBagConstraintsSeguro = new GridBagConstraints();
	this.gridBagConstraintsSeguro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSeguro.gridy = iYPanelCamposSeguro;
	this.gridBagConstraintsSeguro.gridx = iXPanelCamposSeguro++;
	this.gridBagConstraintsSeguro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSeguro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSeguro.add(this.jPanelnombreSeguro, this.gridBagConstraintsSeguro);



	if(iXPanelCamposSeguro % 1==0) {
		iXPanelCamposSeguro=0;
		iYPanelCamposSeguro++;
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
			
		GridBagLayout gridaBagLayoutAccionesSeguro= new GridBagLayout();
		this.jPanelAccionesSeguro.setLayout(gridaBagLayoutAccionesSeguro);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSeguro= new GridBagLayout();
		this.jPanelAccionesFormularioSeguro.setLayout(gridaBagLayoutAccionesFormularioSeguro);
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSeguro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSeguro.add(this.jComboBoxTiposAccionesFormularioSeguro, this.gridBagConstraintsSeguro);

		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSeguro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSeguro.add(this.jCheckBoxPostAccionNuevoSeguro, this.gridBagConstraintsSeguro);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.seguroSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSeguro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSeguro.add(this.jCheckBoxPostAccionSinCerrarSeguro, this.gridBagConstraintsSeguro);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.seguroSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.seguroSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSeguro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSeguro.add(this.jCheckBoxPostAccionSinMensajeSeguro, this.gridBagConstraintsSeguro);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = 0;
		this.gridBagConstraintsSeguro.gridx = iPosXAccion++;
			
		this.jPanelAccionesSeguro.add(this.jButtonModificarSeguro, this.gridBagConstraintsSeguro);							

		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSeguro.gridy = 0;
		this.gridBagConstraintsSeguro.gridx =iPosXAccion++;
			
		this.jPanelAccionesSeguro.add(this.jButtonEliminarSeguro, this.gridBagConstraintsSeguro);
		
			
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = 0;		
		this.gridBagConstraintsSeguro.gridx = iPosXAccion++;
		
		this.jPanelAccionesSeguro.add(this.jButtonActualizarSeguro, this.gridBagConstraintsSeguro);


		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = 0;		
		this.gridBagConstraintsSeguro.gridx = iPosXAccion++;
		
		this.jPanelAccionesSeguro.add(this.jButtonGuardarCambiosSeguro, this.gridBagConstraintsSeguro);	
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = 0;		
		this.gridBagConstraintsSeguro.gridx =iPosXAccion++;
		
		this.jPanelAccionesSeguro.add(this.jButtonCancelarSeguro, this.gridBagConstraintsSeguro);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSeguro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSeguro);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.seguroSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSeguro = new GridBagConstraints();						
			this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSeguro.gridx = 0;		
			//this.gridBagConstraintsSeguro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSeguro.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSeguro.gridx =0;
		this.gridBagConstraintsSeguro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSeguro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSeguro, this.gridBagConstraintsSeguro);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SeguroJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSeguro = new SeguroBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Seguro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Seguro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Seguro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SeguroModel seguroModel=new SeguroModel(this);
			
			//SI USARA CLASE INTERNA
			//SeguroModel.SeguroFocusTraversalPolicy seguroFocusTraversalPolicy = seguroModel.new SeguroFocusTraversalPolicy(this);
			
			//seguroFocusTraversalPolicy.setseguroJInternalFrame(this);
			
			this.setFocusTraversalPolicy(seguroModel);
			
			
			this.jContentPaneDetalleSeguro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSeguro = new GridBagLayout();	
			this.jContentPaneDetalleSeguro.setLayout(gridaBagLayoutDetalleSeguro);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSeguro = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSeguro = new GridBagConstraints();
				this.gridBagConstraintsSeguro.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSeguro.gridx = 0;
					
				
				this.jContentPaneDetalleSeguro.add(jTtoolBarDetalleSeguro, gridBagConstraintsSeguro);								
				
}
			
			this.jScrollPanelDatosEdicionSeguro=   new JScrollPane(jContentPaneDetalleSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSeguro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSeguro.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSeguro.gridx = 0;
	        
			this.jContentPaneDetalleSeguro.add(jPanelCamposSeguro, gridBagConstraintsSeguro);
			
			
			
			
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
						&& seguroSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.seguroSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSeguro= new GridBagConstraints();
						this.gridBagConstraintsSeguro.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSeguro.gridx = 0;
						this.jContentPaneDetalleSeguro.add(this.jTabbedPaneRelacionesSeguro, this.gridBagConstraintsSeguro);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSeguro.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSeguro.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSeguro = new GridBagConstraints();
					this.gridBagConstraintsSeguro.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSeguro.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSeguro.gridx = 0;
					
				
					this.jContentPaneDetalleSeguro.add(jPanelCamposOcultosSeguro, gridBagConstraintsSeguro);
				
					this.jPanelCamposOcultosSeguro.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSeguro.gridx = 0;
	        this.gridBagConstraintsSeguro.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSeguro.add(this.jPanelAccionesFormularioSeguro, this.gridBagConstraintsSeguro);							
			
			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
	        this.gridBagConstraintsSeguro.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSeguro.gridx = 0;
	        
			
			this.jContentPaneDetalleSeguro.add(this.jPanelAccionesSeguro, this.gridBagConstraintsSeguro);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSeguro);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSeguro=   new JScrollPane(this.jPanelCamposSeguro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSeguro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSeguro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSeguro.gridx = 0;
			this.gridBagConstraintsSeguro.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSeguro.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSeguro.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSeguro, this.gridBagConstraintsSeguro);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSeguro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSeguro, this.gridBagConstraintsSeguro);			
			
			this.gridBagConstraintsSeguro = new GridBagConstraints();
			this.gridBagConstraintsSeguro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSeguro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSeguro, this.gridBagConstraintsSeguro);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSeguro, this.gridBagConstraintsSeguro);
			
			
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSeguro, this.gridBagConstraintsSeguro);
		
			
		this.gridBagConstraintsSeguro = new GridBagConstraints();
		this.gridBagConstraintsSeguro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSeguro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSeguro, this.gridBagConstraintsSeguro);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSeguro;//jContentPane;
		
		return jScrollPanelDatosEdicionSeguro;
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
