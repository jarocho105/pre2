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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.EstadoNovedadSeguimientoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class EstadoNovedadSeguimientoDetalleFormJInternalFrame extends EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoNovedadSeguimiento;
	
	protected JMenuBar jmenuBarDetalleEstadoNovedadSeguimiento;
	
	protected JMenu jmenuDetalleEstadoNovedadSeguimiento;
	protected JMenu jmenuDetalleArchivoEstadoNovedadSeguimiento;
	protected JMenu jmenuDetalleAccionesEstadoNovedadSeguimiento;
	protected JMenu jmenuDetalleDatosEstadoNovedadSeguimiento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoNovedadSeguimiento;	
	protected GridBagConstraints gridBagConstraintsEstadoNovedadSeguimiento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoNovedadSeguimiento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoNovedadSeguimientoSessionBean estadonovedadseguimientoSessionBean;
	
	
	
		
	
	public EstadoNovedadSeguimientoLogic estadonovedadseguimientoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosEdicionEstadoNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosGeneralEstadoNovedadSeguimiento;
	
	protected JPanel jPanelCamposEstadoNovedadSeguimiento;    
	protected JPanel jPanelCamposOcultosEstadoNovedadSeguimiento;    	
	protected JPanel jPanelAccionesEstadoNovedadSeguimiento;
	protected JPanel jPanelAccionesFormularioEstadoNovedadSeguimiento;
    
	
	
	protected Integer iXPanelCamposEstadoNovedadSeguimiento=0;
	protected Integer iYPanelCamposEstadoNovedadSeguimiento=0;
	
	protected Integer iXPanelCamposOcultosEstadoNovedadSeguimiento=0;
	protected Integer iYPanelCamposOcultosEstadoNovedadSeguimiento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoNovedadSeguimiento;
	public JButton jButtonModificarEstadoNovedadSeguimiento;
	public JButton jButtonActualizarEstadoNovedadSeguimiento;
    public JButton jButtonEliminarEstadoNovedadSeguimiento;
	public JButton jButtonCancelarEstadoNovedadSeguimiento;
    public JButton jButtonGuardarCambiosEstadoNovedadSeguimiento;
	public JButton jButtonGuardarCambiosTablaEstadoNovedadSeguimiento;
	protected JButton jButtonCerrarEstadoNovedadSeguimiento;
	
	
	protected JButton jButtonProcesarInformacionEstadoNovedadSeguimiento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonModificarToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonActualizarToolBarEstadoNovedadSeguimiento;
    protected JButton jButtonEliminarToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonCancelarToolBarEstadoNovedadSeguimiento;
    protected JButton jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoNovedadSeguimiento;
	protected JButton jButtonCerrarToolBarEstadoNovedadSeguimiento;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoNovedadSeguimiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemModificarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemActualizarEstadoNovedadSeguimiento;
    protected JMenuItem jMenuItemEliminarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemCancelarEstadoNovedadSeguimiento;
    protected JMenuItem jMenuItemGuardarCambiosEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemCerrarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleCerrarEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento;
	protected JMenuItem jMenuItemMostrarOcultarEstadoNovedadSeguimiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoNovedadSeguimiento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoNovedadSeguimiento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoNovedadSeguimiento;
	public JLabel jLabelIdEstadoNovedadSeguimiento;
	public JTextFieldMe jTextFieldidEstadoNovedadSeguimiento;
	public JButton jButtonidEstadoNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoNovedadSeguimiento;
	public JLabel jLabelcodigoEstadoNovedadSeguimiento;
	public JTextField jTextFieldcodigoEstadoNovedadSeguimiento;
	public JButton jButtoncodigoEstadoNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoNovedadSeguimiento;
	public JLabel jLabelnombreEstadoNovedadSeguimiento;
	public JTextField jTextFieldnombreEstadoNovedadSeguimiento;
	public JButton jButtonnombreEstadoNovedadSeguimientoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoNovedadSeguimiento;
	
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
	
	public EstadoNovedadSeguimientoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoNovedadSeguimiento=new JPanel();
				this.jPanelAccionesFormularioEstadoNovedadSeguimiento=new JPanel();
				this.jmenuBarDetalleEstadoNovedadSeguimiento=new JMenuBar();
				this.jTtoolBarDetalleEstadoNovedadSeguimiento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadSeguimientoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoNovedadSeguimientoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadSeguimientoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadSeguimientoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadSeguimientoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoNovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoNovedadSeguimiento() {
		return this.jButtonActualizarToolBarEstadoNovedadSeguimiento;
	}
	
	public JButton getjButtonEliminarToolBarEstadoNovedadSeguimiento() {
		return this.jButtonEliminarToolBarEstadoNovedadSeguimiento;
	}
	
	public JButton getjButtonCancelarToolBarEstadoNovedadSeguimiento() {
		return this.jButtonCancelarToolBarEstadoNovedadSeguimiento;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoNovedadSeguimiento() {
		return this.jButtonProcesarInformacionEstadoNovedadSeguimiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoNovedadSeguimiento)	{
		this.jButtonProcesarInformacionEstadoNovedadSeguimiento = jButtonProcesarInformacionEstadoNovedadSeguimiento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposAccionesEstadoNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposRelacionesEstadoNovedadSeguimiento) {
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento = jComboBoxTiposRelacionesEstadoNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposAccionesEstadoNovedadSeguimiento) {
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento = jComboBoxTiposAccionesEstadoNovedadSeguimiento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento() {
		return this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento(
			JComboBox jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento) {
		this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento = jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
		
		this.estadonovedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonovedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoNovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoNovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoNovedadSeguimientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Novedad Seguimiento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoNovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoNovedadSeguimiento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoNovedadSeguimiento=new JButtonMe();
				this.jButtonModificarToolBarEstadoNovedadSeguimiento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoNovedadSeguimiento,this.jTtoolBarDetalleEstadoNovedadSeguimiento,
							"actualizar","actualizar","Actualizar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoNovedadSeguimiento,this.jTtoolBarDetalleEstadoNovedadSeguimiento,
							"eliminar","eliminar","Eliminar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoNovedadSeguimiento,this.jTtoolBarDetalleEstadoNovedadSeguimiento,
							"cancelar","cancelar","Cancelar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento,this.jTtoolBarDetalleEstadoNovedadSeguimiento,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoNovedadSeguimiento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoNovedadSeguimiento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoNovedadSeguimiento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoNovedadSeguimiento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoNovedadSeguimiento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoNovedadSeguimiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoNovedadSeguimiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoNovedadSeguimiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoNovedadSeguimiento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoNovedadSeguimiento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoNovedadSeguimiento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoNovedadSeguimiento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoNovedadSeguimiento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoNovedadSeguimiento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoNovedadSeguimiento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoNovedadSeguimiento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoNovedadSeguimiento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoNovedadSeguimiento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoNovedadSeguimiento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoNovedadSeguimiento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoNovedadSeguimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoNovedadSeguimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoNovedadSeguimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoNovedadSeguimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoNovedadSeguimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoNovedadSeguimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoNovedadSeguimiento.add(this.jMenuItemDetalleCerrarEstadoNovedadSeguimiento);
		
		this.jmenuDetalleAccionesEstadoNovedadSeguimiento.add(this.jMenuItemActualizarEstadoNovedadSeguimiento);
		this.jmenuDetalleAccionesEstadoNovedadSeguimiento.add(this.jMenuItemEliminarEstadoNovedadSeguimiento);
		this.jmenuDetalleAccionesEstadoNovedadSeguimiento.add(this.jMenuItemCancelarEstadoNovedadSeguimiento);		
		
		//this.jmenuDetalleDatosEstadoNovedadSeguimiento.add(this.jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento);				
		this.jmenuDetalleDatosEstadoNovedadSeguimiento.add(this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento);				
				
		//this.jmenuDetalleAccionesEstadoNovedadSeguimiento.add(this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoNovedadSeguimiento.add(this.jmenuDetalleArchivoEstadoNovedadSeguimiento);		
		this.jmenuBarDetalleEstadoNovedadSeguimiento.add(this.jmenuDetalleAccionesEstadoNovedadSeguimiento);		
		this.jmenuBarDetalleEstadoNovedadSeguimiento.add(this.jmenuDetalleDatosEstadoNovedadSeguimiento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoNovedadSeguimiento);				
	}
	
	
	public void inicializarElementosCamposEstadoNovedadSeguimiento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoNovedadSeguimiento = new JLabelMe();
		jLabelIdEstadoNovedadSeguimiento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoNovedadSeguimiento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoNovedadSeguimiento.setToolTipText(EstadoNovedadSeguimientoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoNovedadSeguimiento= new GridBagLayout();

		this.jPanelidEstadoNovedadSeguimiento.setLayout(this.gridaBagLayoutEstadoNovedadSeguimiento);

		jTextFieldidEstadoNovedadSeguimiento = new JTextFieldMe();
		jTextFieldidEstadoNovedadSeguimiento.setText("Id");

		jTextFieldidEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoNovedadSeguimiento = new JLabelMe();
		this.jLabelcodigoEstadoNovedadSeguimiento.setText(""+EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoNovedadSeguimiento.setToolTipText("Codigo");
		this.jLabelcodigoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoNovedadSeguimiento.setToolTipText(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoNovedadSeguimiento = new GridBagLayout();
		this.jPanelcodigoEstadoNovedadSeguimiento.setLayout(this.gridaBagLayoutEstadoNovedadSeguimiento);


		jTextFieldcodigoEstadoNovedadSeguimiento= new JTextFieldMe();

		jTextFieldcodigoEstadoNovedadSeguimiento.setEnabled(false);
		jTextFieldcodigoEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoNovedadSeguimientoBusqueda.setText("U");
		this.jButtoncodigoEstadoNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoNovedadSeguimientoBusqueda"));

		if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoNovedadSeguimientoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoNovedadSeguimiento = new JLabelMe();
		this.jLabelnombreEstadoNovedadSeguimiento.setText(""+EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoNovedadSeguimiento.setToolTipText("Nombre");
		this.jLabelnombreEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoNovedadSeguimiento.setToolTipText(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoNovedadSeguimiento = new GridBagLayout();
		this.jPanelnombreEstadoNovedadSeguimiento.setLayout(this.gridaBagLayoutEstadoNovedadSeguimiento);


		jTextFieldnombreEstadoNovedadSeguimiento= new JTextFieldMe();

		jTextFieldnombreEstadoNovedadSeguimiento.setEnabled(false);
		jTextFieldnombreEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreEstadoNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoNovedadSeguimientoBusqueda.setText("U");
		this.jButtonnombreEstadoNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreEstadoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreEstadoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoNovedadSeguimientoBusqueda"));

		if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoNovedadSeguimientoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoNovedadSeguimiento() {
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
		//this.jInternalFrameDetalleEstadoNovedadSeguimiento = new EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Novedad Seguimiento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoNovedadSeguimiento= new GridBagLayout();
		

		
		String sToolTipEstadoNovedadSeguimiento="";
		sToolTipEstadoNovedadSeguimiento=EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoNovedadSeguimiento+="(Inventario.EstadoNovedadSeguimiento)";
		}
		
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoNovedadSeguimiento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonModificarEstadoNovedadSeguimiento = new JButtonMe();
        this.jButtonActualizarEstadoNovedadSeguimiento = new JButtonMe();
        this.jButtonEliminarEstadoNovedadSeguimiento = new JButtonMe();
        this.jButtonCancelarEstadoNovedadSeguimiento = new JButtonMe();
        this.jButtonGuardarCambiosEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarEstadoNovedadSeguimiento = new JButtonMe();
		
		this.jScrollPanelDatosEstadoNovedadSeguimiento = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Novedad Seguimiento";
		
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedad Seguimientoes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoNovedadSeguimiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoNovedadSeguimiento.setName("jPanelCamposEstadoNovedadSeguimiento"); 

		this.jPanelCamposOcultosEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoNovedadSeguimiento.setName("jPanelCamposOcultosEstadoNovedadSeguimiento"); 

        this.jPanelAccionesEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoNovedadSeguimiento.setToolTipText("Acciones");
        this.jPanelAccionesEstadoNovedadSeguimiento.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoNovedadSeguimiento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoNovedadSeguimiento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoNovedadSeguimiento.setText("Nuevo");
		this.jButtonModificarEstadoNovedadSeguimiento.setText("Editar");
        this.jButtonActualizarEstadoNovedadSeguimiento.setText("Actualizar");
        this.jButtonEliminarEstadoNovedadSeguimiento.setText("Eliminar");
        this.jButtonCancelarEstadoNovedadSeguimiento.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoNovedadSeguimiento.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.setText("Guardar");
		this.jButtonCerrarEstadoNovedadSeguimiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoNovedadSeguimiento,"nuevo_button","Nuevo",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoNovedadSeguimiento,"modificar_button","Editar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoNovedadSeguimiento,"actualizar_button","Actualizar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoNovedadSeguimiento,"eliminar_button","Eliminar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoNovedadSeguimiento,"cancelar_button","Cancelar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoNovedadSeguimiento,"guardarcambios_button","Guardar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento,"guardarcambiostabla_button","Guardar",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoNovedadSeguimiento,"cerrar_button","Salir",this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoNovedadSeguimiento.setToolTipText("Nuevo"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoNovedadSeguimiento.setToolTipText("Editar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoNovedadSeguimiento.setToolTipText("Actualizar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoNovedadSeguimiento.setToolTipText("Eliminar)"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoNovedadSeguimiento.setToolTipText("Cancelar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoNovedadSeguimiento.setToolTipText("Guardar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.setToolTipText("Guardar"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoNovedadSeguimiento.setToolTipText("Salir"+" "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoNovedadSeguimiento";
		inputMap = this.jButtonNuevoEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoNovedadSeguimiento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoNovedadSeguimiento";
		inputMap = this.jButtonActualizarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoNovedadSeguimiento"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoNovedadSeguimiento";
		inputMap = this.jButtonEliminarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoNovedadSeguimiento"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoNovedadSeguimiento";
		inputMap = this.jButtonCancelarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoNovedadSeguimiento"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoNovedadSeguimiento";
		inputMap = this.jButtonCerrarEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoNovedadSeguimiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoNovedadSeguimiento";
		inputMap = this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoNovedadSeguimiento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento.setToolTipText("Nuevo EstadoNovedadSeguimiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento.setToolTipText("Sin Cerrar Ventana EstadoNovedadSeguimiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoNovedadSeguimiento = new JLabelMe();
		
		this.jLabelAccionesEstadoNovedadSeguimiento.setText("Acciones");		
		this.jLabelAccionesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoNovedadSeguimiento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoNovedadSeguimiento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoNovedadSeguimiento=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoNovedadSeguimiento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoNovedadSeguimiento = new GridBagLayout();
		
		this.jPanelCamposEstadoNovedadSeguimiento.setLayout(gridaBagLayoutCamposEstadoNovedadSeguimiento);
		this.jPanelCamposOcultosEstadoNovedadSeguimiento.setLayout(gridaBagLayoutCamposOcultosEstadoNovedadSeguimiento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoNovedadSeguimiento.add(jLabelIdEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);



	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoNovedadSeguimiento.add(jTextFieldidEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);


	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoNovedadSeguimiento.add(jLabelcodigoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoNovedadSeguimiento.add(jButtoncodigoEstadoNovedadSeguimientoBusqueda, this.gridBagConstraintsEstadoNovedadSeguimiento);
	}

	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoNovedadSeguimiento.add(jTextFieldcodigoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);


	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoNovedadSeguimiento.add(jLabelnombreEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoNovedadSeguimiento.add(jButtonnombreEstadoNovedadSeguimientoBusqueda, this.gridBagConstraintsEstadoNovedadSeguimiento);
	}

	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoNovedadSeguimiento.add(jTextFieldnombreEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iYPanelCamposEstadoNovedadSeguimiento;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iXPanelCamposEstadoNovedadSeguimiento++;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNovedadSeguimiento.add(this.jPanelidEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);



	if(iXPanelCamposEstadoNovedadSeguimiento % 1==0) {
		iXPanelCamposEstadoNovedadSeguimiento=0;
		iYPanelCamposEstadoNovedadSeguimiento++;
	}
	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iYPanelCamposEstadoNovedadSeguimiento;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iXPanelCamposEstadoNovedadSeguimiento++;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNovedadSeguimiento.add(this.jPanelcodigoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);



	if(iXPanelCamposEstadoNovedadSeguimiento % 1==0) {
		iXPanelCamposEstadoNovedadSeguimiento=0;
		iYPanelCamposEstadoNovedadSeguimiento++;
	}
	this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iYPanelCamposEstadoNovedadSeguimiento;
	this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iXPanelCamposEstadoNovedadSeguimiento++;
	this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNovedadSeguimiento.add(this.jPanelnombreEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);



	if(iXPanelCamposEstadoNovedadSeguimiento % 1==0) {
		iXPanelCamposEstadoNovedadSeguimiento=0;
		iYPanelCamposEstadoNovedadSeguimiento++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoNovedadSeguimiento= new GridBagLayout();
		this.jPanelAccionesEstadoNovedadSeguimiento.setLayout(gridaBagLayoutAccionesEstadoNovedadSeguimiento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoNovedadSeguimiento= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoNovedadSeguimiento.setLayout(gridaBagLayoutAccionesFormularioEstadoNovedadSeguimiento);
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoNovedadSeguimiento.add(this.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);

		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoNovedadSeguimiento.add(this.jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoNovedadSeguimiento.add(this.jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoNovedadSeguimiento.add(this.jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoNovedadSeguimiento.add(this.jButtonModificarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);							

		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoNovedadSeguimiento.add(this.jButtonEliminarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
			
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoNovedadSeguimiento.add(this.jButtonActualizarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);


		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoNovedadSeguimiento.add(this.jButtonGuardarCambiosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);	
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = 0;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoNovedadSeguimiento.add(this.jButtonCancelarEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoNovedadSeguimiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoNovedadSeguimiento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();						
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;		
			//this.gridBagConstraintsEstadoNovedadSeguimiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoNovedadSeguimiento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =0;
		this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoNovedadSeguimiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoNovedadSeguimiento = new EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Novedad Seguimiento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Novedad Seguimiento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Novedad Seguimiento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoNovedadSeguimientoModel estadonovedadseguimientoModel=new EstadoNovedadSeguimientoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoNovedadSeguimientoModel.EstadoNovedadSeguimientoFocusTraversalPolicy estadonovedadseguimientoFocusTraversalPolicy = estadonovedadseguimientoModel.new EstadoNovedadSeguimientoFocusTraversalPolicy(this);
			
			//estadonovedadseguimientoFocusTraversalPolicy.setestadonovedadseguimientoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadonovedadseguimientoModel);
			
			
			this.jContentPaneDetalleEstadoNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoNovedadSeguimiento = new GridBagLayout();	
			this.jContentPaneDetalleEstadoNovedadSeguimiento.setLayout(gridaBagLayoutDetalleEstadoNovedadSeguimiento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoNovedadSeguimiento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
				this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoNovedadSeguimiento.add(jTtoolBarDetalleEstadoNovedadSeguimiento, gridBagConstraintsEstadoNovedadSeguimiento);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento=   new JScrollPane(jContentPaneDetalleEstadoNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
	        
			this.jContentPaneDetalleEstadoNovedadSeguimiento.add(jPanelCamposEstadoNovedadSeguimiento, gridBagConstraintsEstadoNovedadSeguimiento);
			
			
			
			
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
						&& estadonovedadseguimientoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoNovedadSeguimiento= new GridBagConstraints();
						this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
						this.jContentPaneDetalleEstadoNovedadSeguimiento.add(this.jTabbedPaneRelacionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoNovedadSeguimiento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
					this.gridBagConstraintsEstadoNovedadSeguimiento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoNovedadSeguimiento.add(jPanelCamposOcultosEstadoNovedadSeguimiento, gridBagConstraintsEstadoNovedadSeguimiento);
				
					this.jPanelCamposOcultosEstadoNovedadSeguimiento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
	        this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoNovedadSeguimiento.add(this.jPanelAccionesFormularioEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);							
			
			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
	        this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoNovedadSeguimiento.add(this.jPanelAccionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoNovedadSeguimiento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento=   new JScrollPane(this.jPanelCamposEstadoNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
			this.gridBagConstraintsEstadoNovedadSeguimiento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoNovedadSeguimiento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);			
			
			this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
			
			
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		
			
		this.gridBagConstraintsEstadoNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadSeguimiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoNovedadSeguimiento, this.gridBagConstraintsEstadoNovedadSeguimiento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoNovedadSeguimiento;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoNovedadSeguimiento;
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
