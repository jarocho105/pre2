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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.FacturacionConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class FacturacionDetalleFormJInternalFrame extends FacturacionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturacion;
	
	protected JMenuBar jmenuBarDetalleFacturacion;
	
	protected JMenu jmenuDetalleFacturacion;
	protected JMenu jmenuDetalleArchivoFacturacion;
	protected JMenu jmenuDetalleAccionesFacturacion;
	protected JMenu jmenuDetalleDatosFacturacion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturacion;	
	protected GridBagConstraints gridBagConstraintsFacturacion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturacionBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturacion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public FacturacionSessionBean facturacionSessionBean;
	
	
	
		
	
	public FacturacionLogic facturacionLogic;
	
	public JScrollPane jScrollPanelDatosFacturacion;
	public JScrollPane jScrollPanelDatosEdicionFacturacion;
	public JScrollPane jScrollPanelDatosGeneralFacturacion;
	
	protected JPanel jPanelCamposFacturacion;    
	protected JPanel jPanelCamposOcultosFacturacion;    	
	protected JPanel jPanelAccionesFacturacion;
	protected JPanel jPanelAccionesFormularioFacturacion;
    
	
	
	protected Integer iXPanelCamposFacturacion=0;
	protected Integer iYPanelCamposFacturacion=0;
	
	protected Integer iXPanelCamposOcultosFacturacion=0;
	protected Integer iYPanelCamposOcultosFacturacion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturacion;
	public JButton jButtonModificarFacturacion;
	public JButton jButtonActualizarFacturacion;
    public JButton jButtonEliminarFacturacion;
	public JButton jButtonCancelarFacturacion;
    public JButton jButtonGuardarCambiosFacturacion;
	public JButton jButtonGuardarCambiosTablaFacturacion;
	protected JButton jButtonCerrarFacturacion;
	
	
	protected JButton jButtonProcesarInformacionFacturacion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturacion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturacion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturacion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturacion;
	protected JButton jButtonModificarToolBarFacturacion;
	protected JButton jButtonActualizarToolBarFacturacion;
    protected JButton jButtonEliminarToolBarFacturacion;
	protected JButton jButtonCancelarToolBarFacturacion;
    protected JButton jButtonGuardarCambiosToolBarFacturacion;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturacion;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturacion;
	protected JButton jButtonCerrarToolBarFacturacion;
	
	protected JButton jButtonProcesarInformacionToolBarFacturacion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturacion;
	protected JMenuItem jMenuItemModificarFacturacion;
	protected JMenuItem jMenuItemActualizarFacturacion;
    protected JMenuItem jMenuItemEliminarFacturacion;
	protected JMenuItem jMenuItemCancelarFacturacion;
    protected JMenuItem jMenuItemGuardarCambiosFacturacion;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturacion;
	protected JMenuItem jMenuItemCerrarFacturacion;
	protected JMenuItem jMenuItemDetalleCerrarFacturacion;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturacion;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturacion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturacion;
	protected JMenuItem jMenuItemMostrarOcultarFacturacion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturacion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturacion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturacion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturacion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturacion;
	public JLabel jLabelIdFacturacion;
	public JLabel jLabelidFacturacion;
	public JButton jButtonidFacturacionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoFacturacion;
	public JLabel jLabelcodigoFacturacion;
	public JTextField jTextFieldcodigoFacturacion;
	public JButton jButtoncodigoFacturacionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturacion;
	
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
	
	public FacturacionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturacion=new JPanel();
				this.jPanelAccionesFormularioFacturacion=new JPanel();
				this.jmenuBarDetalleFacturacion=new JMenuBar();
				this.jTtoolBarDetalleFacturacion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturacionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturacionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Facturacion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturacion() {
		return this.jButtonActualizarToolBarFacturacion;
	}
	
	public JButton getjButtonEliminarToolBarFacturacion() {
		return this.jButtonEliminarToolBarFacturacion;
	}
	
	public JButton getjButtonCancelarToolBarFacturacion() {
		return this.jButtonCancelarToolBarFacturacion;
	}		
	
	public JButton getjButtonProcesarInformacionFacturacion() {
		return this.jButtonProcesarInformacionFacturacion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturacion)	{
		this.jButtonProcesarInformacionFacturacion = jButtonProcesarInformacionFacturacion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturacion() {
		return this.jComboBoxTiposAccionesFacturacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturacion(
			JComboBox jComboBoxTiposRelacionesFacturacion) {
		this.jComboBoxTiposRelacionesFacturacion = jComboBoxTiposRelacionesFacturacion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturacion(
			JComboBox jComboBoxTiposAccionesFacturacion) {
		this.jComboBoxTiposAccionesFacturacion = jComboBoxTiposAccionesFacturacion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturacion() {
		return this.jComboBoxTiposAccionesFormularioFacturacion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturacion(
			JComboBox jComboBoxTiposAccionesFormularioFacturacion) {
		this.jComboBoxTiposAccionesFormularioFacturacion = jComboBoxTiposAccionesFormularioFacturacion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturacionSessionBean=new FacturacionSessionBean();
		
		this.facturacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturacionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturacionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturacionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Facturacion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturacion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturacion=new JButtonMe();
				this.jButtonModificarToolBarFacturacion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturacion,this.jTtoolBarDetalleFacturacion,
							"actualizar","actualizar","Actualizar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturacion,this.jTtoolBarDetalleFacturacion,
							"eliminar","eliminar","Eliminar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturacion,this.jTtoolBarDetalleFacturacion,
							"cancelar","cancelar","Cancelar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturacion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturacion,this.jTtoolBarDetalleFacturacion,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturacion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturacion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturacion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturacion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturacion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturacion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturacion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturacion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturacion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturacion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturacion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturacion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturacion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturacion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturacion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturacion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturacion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturacion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturacion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturacion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturacion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturacion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturacion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturacion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturacion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturacion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturacion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturacion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturacion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturacion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturacion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturacion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturacion.add(this.jMenuItemDetalleCerrarFacturacion);
		
		this.jmenuDetalleAccionesFacturacion.add(this.jMenuItemActualizarFacturacion);
		this.jmenuDetalleAccionesFacturacion.add(this.jMenuItemEliminarFacturacion);
		this.jmenuDetalleAccionesFacturacion.add(this.jMenuItemCancelarFacturacion);		
		
		//this.jmenuDetalleDatosFacturacion.add(this.jMenuItemDetalleAbrirOrderByFacturacion);				
		this.jmenuDetalleDatosFacturacion.add(this.jMenuItemDetalleMostarOcultarFacturacion);				
				
		//this.jmenuDetalleAccionesFacturacion.add(this.jMenuItemGuardarCambiosFacturacion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturacion.add(this.jmenuDetalleArchivoFacturacion);		
		this.jmenuBarDetalleFacturacion.add(this.jmenuDetalleAccionesFacturacion);		
		this.jmenuBarDetalleFacturacion.add(this.jmenuDetalleDatosFacturacion);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturacion);				
	}
	
	
	public void inicializarElementosCamposFacturacion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturacion = new JLabelMe();
		jLabelIdFacturacion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturacion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturacion.setToolTipText(FacturacionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturacion= new GridBagLayout();

		this.jPanelidFacturacion.setLayout(this.gridaBagLayoutFacturacion);

		jLabelidFacturacion = new JLabel();
		jLabelidFacturacion.setText("Id");

		jLabelidFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoFacturacion = new JLabelMe();
		this.jLabelcodigoFacturacion.setText(""+FacturacionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoFacturacion.setToolTipText("Codigo");
		this.jLabelcodigoFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoFacturacion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoFacturacion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoFacturacion.setToolTipText(FacturacionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutFacturacion = new GridBagLayout();
		this.jPanelcodigoFacturacion.setLayout(this.gridaBagLayoutFacturacion);


		jTextFieldcodigoFacturacion= new JTextFieldMe();

		jTextFieldcodigoFacturacion.setEnabled(false);
		jTextFieldcodigoFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoFacturacion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoFacturacionBusqueda= new JButtonMe();
		this.jButtoncodigoFacturacionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoFacturacionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoFacturacionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoFacturacionBusqueda.setText("U");
		this.jButtoncodigoFacturacionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoFacturacionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoFacturacionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoFacturacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoFacturacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoFacturacionBusqueda"));

		if(this.facturacionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoFacturacionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturacion() {
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
		//this.jInternalFrameDetalleFacturacion = new FacturacionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Facturacion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturacion= new GridBagLayout();
		

		
		String sToolTipFacturacion="";
		sToolTipFacturacion=FacturacionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturacion+="(Facturacion.Facturacion)";
		}
		
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturacion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturacion = new JButtonMe();
		this.jButtonModificarFacturacion = new JButtonMe();
        this.jButtonActualizarFacturacion = new JButtonMe();
        this.jButtonEliminarFacturacion = new JButtonMe();
        this.jButtonCancelarFacturacion = new JButtonMe();
        this.jButtonGuardarCambiosFacturacion = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturacion = new JButtonMe();
		this.jButtonCerrarFacturacion = new JButtonMe();
		
		this.jScrollPanelDatosFacturacion = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturacion = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturacion = new JScrollPane();
				
		
		
		this.jPanelCamposFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Facturacion";
		
		if(!this.facturacionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturaciones" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturacion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturacion.setName("jPanelCamposFacturacion"); 

		this.jPanelCamposOcultosFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturacion.setName("jPanelCamposOcultosFacturacion"); 

        this.jPanelAccionesFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturacion.setToolTipText("Acciones");
        this.jPanelAccionesFacturacion.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturacion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturacion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturacion.setText("Nuevo");
		this.jButtonModificarFacturacion.setText("Editar");
        this.jButtonActualizarFacturacion.setText("Actualizar");
        this.jButtonEliminarFacturacion.setText("Eliminar");
        this.jButtonCancelarFacturacion.setText("Cancelar");
        this.jButtonGuardarCambiosFacturacion.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturacion.setText("Guardar");
		this.jButtonCerrarFacturacion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturacion,"nuevo_button","Nuevo",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturacion,"modificar_button","Editar",this.facturacionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturacion,"actualizar_button","Actualizar",this.facturacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturacion,"eliminar_button","Eliminar",this.facturacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturacion,"cancelar_button","Cancelar",this.facturacionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturacion,"guardarcambios_button","Guardar",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturacion,"guardarcambiostabla_button","Guardar",this.facturacionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturacion,"cerrar_button","Salir",this.facturacionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturacion.setToolTipText("Nuevo"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturacion.setToolTipText("Editar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturacion.setToolTipText("Actualizar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturacion.setToolTipText("Eliminar)"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturacion.setToolTipText("Cancelar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturacion.setToolTipText("Guardar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturacion.setToolTipText("Guardar"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturacion.setToolTipText("Salir"+" "+FacturacionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturacion";
		inputMap = this.jButtonNuevoFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturacion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturacion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturacion";
		inputMap = this.jButtonActualizarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturacion"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturacion";
		inputMap = this.jButtonEliminarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturacion"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturacion";
		inputMap = this.jButtonCancelarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturacion"));
		
		//CERRAR		
		sMapKey = "CerrarFacturacion";
		inputMap = this.jButtonCerrarFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturacion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturacion";
		inputMap = this.jButtonGuardarCambiosTablaFacturacion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturacion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturacion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturacion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturacion.setToolTipText("Nuevo Facturacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturacion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturacion.setToolTipText("Sin Cerrar Ventana Facturacion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturacion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturacion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturacion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturacion.setText("Accion");
		this.jComboBoxTiposAccionesFacturacion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturacion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturacion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturacion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturacion = new JLabelMe();
		
		this.jLabelAccionesFacturacion.setText("Acciones");		
		this.jLabelAccionesFacturacion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturacion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturacion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturacion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturacion=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturacion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturacion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturacion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturacion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturacion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturacion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturacion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturacion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturacion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturacion = new GridBagLayout();
		
		this.jPanelCamposFacturacion.setLayout(gridaBagLayoutCamposFacturacion);
		this.jPanelCamposOcultosFacturacion.setLayout(gridaBagLayoutCamposOcultosFacturacion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturacion = new GridBagConstraints();
	this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacion.gridy = 0;
	this.gridBagConstraintsFacturacion.gridx = 0;
	this.gridBagConstraintsFacturacion.ipadx = 0;
	this.gridBagConstraintsFacturacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFacturacion.add(jLabelIdFacturacion, this.gridBagConstraintsFacturacion);



	this.gridBagConstraintsFacturacion = new GridBagConstraints();
	this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacion.gridy = 0;
	this.gridBagConstraintsFacturacion.gridx = 1;
	this.gridBagConstraintsFacturacion.ipadx = 0;
	this.gridBagConstraintsFacturacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFacturacion.add(jLabelidFacturacion, this.gridBagConstraintsFacturacion);


	this.gridBagConstraintsFacturacion = new GridBagConstraints();
	this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacion.gridy = 0;
	this.gridBagConstraintsFacturacion.gridx = 0;
	this.gridBagConstraintsFacturacion.ipadx = 0;
	this.gridBagConstraintsFacturacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoFacturacion.add(jLabelcodigoFacturacion, this.gridBagConstraintsFacturacion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		//this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturacion.gridy = 0;
		this.gridBagConstraintsFacturacion.gridx = 2;
		this.gridBagConstraintsFacturacion.ipadx = 0;
		this.gridBagConstraintsFacturacion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoFacturacion.add(jButtoncodigoFacturacionBusqueda, this.gridBagConstraintsFacturacion);
	}

	this.gridBagConstraintsFacturacion = new GridBagConstraints();
	this.gridBagConstraintsFacturacion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturacion.gridy = 0;
	this.gridBagConstraintsFacturacion.gridx = 1;
	this.gridBagConstraintsFacturacion.ipadx = 0;
	this.gridBagConstraintsFacturacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoFacturacion.add(jTextFieldcodigoFacturacion, this.gridBagConstraintsFacturacion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturacion = new GridBagConstraints();
	this.gridBagConstraintsFacturacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacion.gridy = iYPanelCamposFacturacion;
	this.gridBagConstraintsFacturacion.gridx = iXPanelCamposFacturacion++;
	this.gridBagConstraintsFacturacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacion.add(this.jPanelidFacturacion, this.gridBagConstraintsFacturacion);



	if(iXPanelCamposFacturacion % 1==0) {
		iXPanelCamposFacturacion=0;
		iYPanelCamposFacturacion++;
	}
	this.gridBagConstraintsFacturacion = new GridBagConstraints();
	this.gridBagConstraintsFacturacion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturacion.gridy = iYPanelCamposFacturacion;
	this.gridBagConstraintsFacturacion.gridx = iXPanelCamposFacturacion++;
	this.gridBagConstraintsFacturacion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturacion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFacturacion.add(this.jPanelcodigoFacturacion, this.gridBagConstraintsFacturacion);



	if(iXPanelCamposFacturacion % 1==0) {
		iXPanelCamposFacturacion=0;
		iYPanelCamposFacturacion++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturacion= new GridBagLayout();
		this.jPanelAccionesFacturacion.setLayout(gridaBagLayoutAccionesFacturacion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturacion= new GridBagLayout();
		this.jPanelAccionesFormularioFacturacion.setLayout(gridaBagLayoutAccionesFormularioFacturacion);
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturacion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturacion.add(this.jComboBoxTiposAccionesFormularioFacturacion, this.gridBagConstraintsFacturacion);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = 0;
		this.gridBagConstraintsFacturacion.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturacion.add(this.jButtonModificarFacturacion, this.gridBagConstraintsFacturacion);							

		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturacion.gridy = 0;
		this.gridBagConstraintsFacturacion.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturacion.add(this.jButtonEliminarFacturacion, this.gridBagConstraintsFacturacion);
		
			
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = 0;		
		this.gridBagConstraintsFacturacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturacion.add(this.jButtonActualizarFacturacion, this.gridBagConstraintsFacturacion);


		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = 0;		
		this.gridBagConstraintsFacturacion.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturacion.add(this.jButtonGuardarCambiosFacturacion, this.gridBagConstraintsFacturacion);	
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = 0;		
		this.gridBagConstraintsFacturacion.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturacion.add(this.jButtonCancelarFacturacion, this.gridBagConstraintsFacturacion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturacion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturacion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturacionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturacion = new GridBagConstraints();						
			this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturacion.gridx = 0;		
			//this.gridBagConstraintsFacturacion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturacion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturacion.gridx =0;
		this.gridBagConstraintsFacturacion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturacion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturacion, this.gridBagConstraintsFacturacion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturacionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturacion = new FacturacionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Facturacion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Facturacion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Facturacion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturacionModel facturacionModel=new FacturacionModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturacionModel.FacturacionFocusTraversalPolicy facturacionFocusTraversalPolicy = facturacionModel.new FacturacionFocusTraversalPolicy(this);
			
			//facturacionFocusTraversalPolicy.setfacturacionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturacionModel);
			
			
			this.jContentPaneDetalleFacturacion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturacion = new GridBagLayout();	
			this.jContentPaneDetalleFacturacion.setLayout(gridaBagLayoutDetalleFacturacion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturacion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturacion = new GridBagConstraints();
				this.gridBagConstraintsFacturacion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturacion.gridx = 0;
					
				
				this.jContentPaneDetalleFacturacion.add(jTtoolBarDetalleFacturacion, gridBagConstraintsFacturacion);								
				
}
			
			this.jScrollPanelDatosEdicionFacturacion=   new JScrollPane(jContentPaneDetalleFacturacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturacion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFacturacion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturacion.gridx = 0;
	        
			this.jContentPaneDetalleFacturacion.add(jPanelCamposFacturacion, gridBagConstraintsFacturacion);
			
			
			
			
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
						&& facturacionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturacionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturacion= new GridBagConstraints();
						this.gridBagConstraintsFacturacion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturacion.gridx = 0;
						this.jContentPaneDetalleFacturacion.add(this.jTabbedPaneRelacionesFacturacion, this.gridBagConstraintsFacturacion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturacion.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturacion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturacion = new GridBagConstraints();
					this.gridBagConstraintsFacturacion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturacion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturacion.gridx = 0;
					
				
					this.jContentPaneDetalleFacturacion.add(jPanelCamposOcultosFacturacion, gridBagConstraintsFacturacion);
				
					this.jPanelCamposOcultosFacturacion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturacion.gridx = 0;
	        this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturacion.add(this.jPanelAccionesFormularioFacturacion, this.gridBagConstraintsFacturacion);							
			
			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
	        this.gridBagConstraintsFacturacion.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturacion.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturacion.add(this.jPanelAccionesFacturacion, this.gridBagConstraintsFacturacion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturacion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturacion=   new JScrollPane(this.jPanelCamposFacturacion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturacion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturacion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturacion.gridx = 0;
			this.gridBagConstraintsFacturacion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturacion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturacion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturacion, this.gridBagConstraintsFacturacion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturacion, this.gridBagConstraintsFacturacion);			
			
			this.gridBagConstraintsFacturacion = new GridBagConstraints();
			this.gridBagConstraintsFacturacion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturacion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturacion, this.gridBagConstraintsFacturacion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturacion, this.gridBagConstraintsFacturacion);
			
			
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturacion, this.gridBagConstraintsFacturacion);
		
			
		this.gridBagConstraintsFacturacion = new GridBagConstraints();
		this.gridBagConstraintsFacturacion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturacion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturacion, this.gridBagConstraintsFacturacion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturacion;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturacion;
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
