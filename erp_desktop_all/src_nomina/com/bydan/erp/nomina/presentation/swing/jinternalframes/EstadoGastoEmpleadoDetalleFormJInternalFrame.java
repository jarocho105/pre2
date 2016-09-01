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
import com.bydan.erp.nomina.util.EstadoGastoEmpleadoConstantesFunciones;

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
public class EstadoGastoEmpleadoDetalleFormJInternalFrame extends EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoGastoEmpleado;
	
	protected JMenuBar jmenuBarDetalleEstadoGastoEmpleado;
	
	protected JMenu jmenuDetalleEstadoGastoEmpleado;
	protected JMenu jmenuDetalleArchivoEstadoGastoEmpleado;
	protected JMenu jmenuDetalleAccionesEstadoGastoEmpleado;
	protected JMenu jmenuDetalleDatosEstadoGastoEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoGastoEmpleado;	
	protected GridBagConstraints gridBagConstraintsEstadoGastoEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoGastoEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoGastoEmpleadoSessionBean estadogastoempleadoSessionBean;
	
	

	public GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame=null;
	public GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteGastoEmpleado=false;
	public GastoEmpleadoSessionBean gastoempleadoSessionBean;
	
		
	
	public EstadoGastoEmpleadoLogic estadogastoempleadoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoGastoEmpleado;
	public JScrollPane jScrollPanelDatosEdicionEstadoGastoEmpleado;
	public JScrollPane jScrollPanelDatosGeneralEstadoGastoEmpleado;
	
	protected JPanel jPanelCamposEstadoGastoEmpleado;    
	protected JPanel jPanelCamposOcultosEstadoGastoEmpleado;    	
	protected JPanel jPanelAccionesEstadoGastoEmpleado;
	protected JPanel jPanelAccionesFormularioEstadoGastoEmpleado;
    
	
	
	protected Integer iXPanelCamposEstadoGastoEmpleado=0;
	protected Integer iYPanelCamposEstadoGastoEmpleado=0;
	
	protected Integer iXPanelCamposOcultosEstadoGastoEmpleado=0;
	protected Integer iYPanelCamposOcultosEstadoGastoEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoGastoEmpleado;
	public JButton jButtonModificarEstadoGastoEmpleado;
	public JButton jButtonActualizarEstadoGastoEmpleado;
    public JButton jButtonEliminarEstadoGastoEmpleado;
	public JButton jButtonCancelarEstadoGastoEmpleado;
    public JButton jButtonGuardarCambiosEstadoGastoEmpleado;
	public JButton jButtonGuardarCambiosTablaEstadoGastoEmpleado;
	protected JButton jButtonCerrarEstadoGastoEmpleado;
	
	
	protected JButton jButtonProcesarInformacionEstadoGastoEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoGastoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoGastoEmpleado;
	protected JButton jButtonModificarToolBarEstadoGastoEmpleado;
	protected JButton jButtonActualizarToolBarEstadoGastoEmpleado;
    protected JButton jButtonEliminarToolBarEstadoGastoEmpleado;
	protected JButton jButtonCancelarToolBarEstadoGastoEmpleado;
    protected JButton jButtonGuardarCambiosToolBarEstadoGastoEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoGastoEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoGastoEmpleado;
	protected JButton jButtonCerrarToolBarEstadoGastoEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoGastoEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoGastoEmpleado;
	protected JMenuItem jMenuItemModificarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemActualizarEstadoGastoEmpleado;
    protected JMenuItem jMenuItemEliminarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemCancelarEstadoGastoEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosEstadoGastoEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoGastoEmpleado;
	protected JMenuItem jMenuItemCerrarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarEstadoGastoEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoGastoEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoGastoEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoGastoEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarEstadoGastoEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoGastoEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoGastoEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoGastoEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoGastoEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoGastoEmpleado;
	public JLabel jLabelIdEstadoGastoEmpleado;
	public JTextFieldMe jTextFieldidEstadoGastoEmpleado;
	public JButton jButtonidEstadoGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoGastoEmpleado;
	public JLabel jLabelcodigoEstadoGastoEmpleado;
	public JTextField jTextFieldcodigoEstadoGastoEmpleado;
	public JButton jButtoncodigoEstadoGastoEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoGastoEmpleado;
	public JLabel jLabelnombreEstadoGastoEmpleado;
	public JTextArea jTextAreanombreEstadoGastoEmpleado;
	public JScrollPane jscrollPanenombreEstadoGastoEmpleado;
	public JButton jButtonnombreEstadoGastoEmpleadoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoGastoEmpleado;
	
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
	
	public EstadoGastoEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoGastoEmpleado=new JPanel();
				this.jPanelAccionesFormularioEstadoGastoEmpleado=new JPanel();
				this.jmenuBarDetalleEstadoGastoEmpleado=new JMenuBar();
				this.jTtoolBarDetalleEstadoGastoEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGastoEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoGastoEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGastoEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGastoEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoGastoEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoGastoEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoGastoEmpleado() {
		return this.jButtonActualizarToolBarEstadoGastoEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarEstadoGastoEmpleado() {
		return this.jButtonEliminarToolBarEstadoGastoEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarEstadoGastoEmpleado() {
		return this.jButtonCancelarToolBarEstadoGastoEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoGastoEmpleado() {
		return this.jButtonProcesarInformacionEstadoGastoEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoGastoEmpleado)	{
		this.jButtonProcesarInformacionEstadoGastoEmpleado = jButtonProcesarInformacionEstadoGastoEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoGastoEmpleado() {
		return this.jComboBoxTiposAccionesEstadoGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoGastoEmpleado(
			JComboBox jComboBoxTiposRelacionesEstadoGastoEmpleado) {
		this.jComboBoxTiposRelacionesEstadoGastoEmpleado = jComboBoxTiposRelacionesEstadoGastoEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoGastoEmpleado(
			JComboBox jComboBoxTiposAccionesEstadoGastoEmpleado) {
		this.jComboBoxTiposAccionesEstadoGastoEmpleado = jComboBoxTiposAccionesEstadoGastoEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoGastoEmpleado() {
		return this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoGastoEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioEstadoGastoEmpleado) {
		this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado = jComboBoxTiposAccionesFormularioEstadoGastoEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadogastoempleadoSessionBean=new EstadoGastoEmpleadoSessionBean();
		
		this.estadogastoempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadogastoempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadogastoempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoGastoEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Gasto Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoGastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoGastoEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoGastoEmpleado=new JButtonMe();
				this.jButtonModificarToolBarEstadoGastoEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoGastoEmpleado,this.jTtoolBarDetalleEstadoGastoEmpleado,
							"actualizar","actualizar","Actualizar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoGastoEmpleado,this.jTtoolBarDetalleEstadoGastoEmpleado,
							"eliminar","eliminar","Eliminar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoGastoEmpleado,this.jTtoolBarDetalleEstadoGastoEmpleado,
							"cancelar","cancelar","Cancelar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoGastoEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoGastoEmpleado,this.jTtoolBarDetalleEstadoGastoEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoGastoEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoGastoEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoGastoEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoGastoEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoGastoEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoGastoEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoGastoEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoGastoEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoGastoEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoGastoEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoGastoEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoGastoEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoGastoEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoGastoEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoGastoEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoGastoEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoGastoEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoGastoEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoGastoEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoGastoEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoGastoEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoGastoEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoGastoEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoGastoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoGastoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoGastoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoGastoEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoGastoEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoGastoEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoGastoEmpleado.add(this.jMenuItemDetalleCerrarEstadoGastoEmpleado);
		
		this.jmenuDetalleAccionesEstadoGastoEmpleado.add(this.jMenuItemActualizarEstadoGastoEmpleado);
		this.jmenuDetalleAccionesEstadoGastoEmpleado.add(this.jMenuItemEliminarEstadoGastoEmpleado);
		this.jmenuDetalleAccionesEstadoGastoEmpleado.add(this.jMenuItemCancelarEstadoGastoEmpleado);		
		
		//this.jmenuDetalleDatosEstadoGastoEmpleado.add(this.jMenuItemDetalleAbrirOrderByEstadoGastoEmpleado);				
		this.jmenuDetalleDatosEstadoGastoEmpleado.add(this.jMenuItemDetalleMostarOcultarEstadoGastoEmpleado);				
				
		//this.jmenuDetalleAccionesEstadoGastoEmpleado.add(this.jMenuItemGuardarCambiosEstadoGastoEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoGastoEmpleado.add(this.jmenuDetalleArchivoEstadoGastoEmpleado);		
		this.jmenuBarDetalleEstadoGastoEmpleado.add(this.jmenuDetalleAccionesEstadoGastoEmpleado);		
		this.jmenuBarDetalleEstadoGastoEmpleado.add(this.jmenuDetalleDatosEstadoGastoEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoGastoEmpleado.add(this.jmenuDetalleEstadoGastoEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoGastoEmpleado);				
	}
	
	
	public void inicializarElementosCamposEstadoGastoEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoGastoEmpleado = new JLabelMe();
		jLabelIdEstadoGastoEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoGastoEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoGastoEmpleado.setToolTipText(EstadoGastoEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoGastoEmpleado= new GridBagLayout();

		this.jPanelidEstadoGastoEmpleado.setLayout(this.gridaBagLayoutEstadoGastoEmpleado);

		jTextFieldidEstadoGastoEmpleado = new JTextFieldMe();
		jTextFieldidEstadoGastoEmpleado.setText("Id");

		jTextFieldidEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoGastoEmpleado = new JLabelMe();
		this.jLabelcodigoEstadoGastoEmpleado.setText(""+EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoGastoEmpleado.setToolTipText("Codigo");
		this.jLabelcodigoEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoGastoEmpleado.setToolTipText(EstadoGastoEmpleadoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoGastoEmpleado = new GridBagLayout();
		this.jPanelcodigoEstadoGastoEmpleado.setLayout(this.gridaBagLayoutEstadoGastoEmpleado);


		jTextFieldcodigoEstadoGastoEmpleado= new JTextFieldMe();

		jTextFieldcodigoEstadoGastoEmpleado.setEnabled(false);
		jTextFieldcodigoEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoGastoEmpleadoBusqueda.setText("U");
		this.jButtoncodigoEstadoGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoGastoEmpleadoBusqueda"));

		if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoGastoEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoGastoEmpleado = new JLabelMe();
		this.jLabelnombreEstadoGastoEmpleado.setText(""+EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoGastoEmpleado.setToolTipText("Nombre");
		this.jLabelnombreEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoGastoEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoGastoEmpleado.setToolTipText(EstadoGastoEmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoGastoEmpleado = new GridBagLayout();
		this.jPanelnombreEstadoGastoEmpleado.setLayout(this.gridaBagLayoutEstadoGastoEmpleado);


		jTextAreanombreEstadoGastoEmpleado= new JTextAreaMe();
		jTextAreanombreEstadoGastoEmpleado.setEnabled(false);
		jTextAreanombreEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoGastoEmpleado.setLineWrap(true);
		jTextAreanombreEstadoGastoEmpleado.setWrapStyleWord(true);
		jTextAreanombreEstadoGastoEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoGastoEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoGastoEmpleado = new JScrollPane(jTextAreanombreEstadoGastoEmpleado);
		jscrollPanenombreEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoGastoEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoGastoEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoGastoEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoGastoEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoGastoEmpleadoBusqueda.setText("U");
		this.jButtonnombreEstadoGastoEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoGastoEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoGastoEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoGastoEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoGastoEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoGastoEmpleadoBusqueda"));

		if(this.estadogastoempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoGastoEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoGastoEmpleado() {
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
		//this.jInternalFrameDetalleEstadoGastoEmpleado = new EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Gasto Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoGastoEmpleado= new GridBagLayout();
		

		
		String sToolTipEstadoGastoEmpleado="";
		sToolTipEstadoGastoEmpleado=EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoGastoEmpleado+="(Nomina.EstadoGastoEmpleado)";
		}
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoGastoEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoGastoEmpleado = new JButtonMe();
		this.jButtonModificarEstadoGastoEmpleado = new JButtonMe();
        this.jButtonActualizarEstadoGastoEmpleado = new JButtonMe();
        this.jButtonEliminarEstadoGastoEmpleado = new JButtonMe();
        this.jButtonCancelarEstadoGastoEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosEstadoGastoEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado = new JButtonMe();
		this.jButtonCerrarEstadoGastoEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosEstadoGastoEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoGastoEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoGastoEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Gasto Empleado";
		
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Gasto Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoGastoEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoGastoEmpleado.setName("jPanelCamposEstadoGastoEmpleado"); 

		this.jPanelCamposOcultosEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoGastoEmpleado.setName("jPanelCamposOcultosEstadoGastoEmpleado"); 

        this.jPanelAccionesEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoGastoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesEstadoGastoEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoGastoEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoGastoEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoGastoEmpleado.setText("Nuevo");
		this.jButtonModificarEstadoGastoEmpleado.setText("Editar");
        this.jButtonActualizarEstadoGastoEmpleado.setText("Actualizar");
        this.jButtonEliminarEstadoGastoEmpleado.setText("Eliminar");
        this.jButtonCancelarEstadoGastoEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoGastoEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.setText("Guardar");
		this.jButtonCerrarEstadoGastoEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoGastoEmpleado,"nuevo_button","Nuevo",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoGastoEmpleado,"modificar_button","Editar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoGastoEmpleado,"actualizar_button","Actualizar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoGastoEmpleado,"eliminar_button","Eliminar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoGastoEmpleado,"cancelar_button","Cancelar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoGastoEmpleado,"guardarcambios_button","Guardar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoGastoEmpleado,"guardarcambiostabla_button","Guardar",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoGastoEmpleado,"cerrar_button","Salir",this.estadogastoempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoGastoEmpleado.setToolTipText("Nuevo"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoGastoEmpleado.setToolTipText("Editar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoGastoEmpleado.setToolTipText("Actualizar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoGastoEmpleado.setToolTipText("Eliminar)"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoGastoEmpleado.setToolTipText("Cancelar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoGastoEmpleado.setToolTipText("Guardar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.setToolTipText("Guardar"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoGastoEmpleado.setToolTipText("Salir"+" "+EstadoGastoEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoGastoEmpleado";
		inputMap = this.jButtonNuevoEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoGastoEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoGastoEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoGastoEmpleado";
		inputMap = this.jButtonActualizarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoGastoEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoGastoEmpleado";
		inputMap = this.jButtonEliminarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoGastoEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoGastoEmpleado";
		inputMap = this.jButtonCancelarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoGastoEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoGastoEmpleado";
		inputMap = this.jButtonCerrarEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoGastoEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoGastoEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoGastoEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoGastoEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoGastoEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoGastoEmpleado.setToolTipText("Nuevo EstadoGastoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado.setToolTipText("Sin Cerrar Ventana EstadoGastoEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoGastoEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoGastoEmpleado = new JLabelMe();
		
		this.jLabelAccionesEstadoGastoEmpleado.setText("Acciones");		
		this.jLabelAccionesEstadoGastoEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGastoEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoGastoEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoGastoEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoGastoEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoGastoEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoGastoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoGastoEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoGastoEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoGastoEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoGastoEmpleado = new GridBagLayout();
		
		this.jPanelCamposEstadoGastoEmpleado.setLayout(gridaBagLayoutCamposEstadoGastoEmpleado);
		this.jPanelCamposOcultosEstadoGastoEmpleado.setLayout(gridaBagLayoutCamposOcultosEstadoGastoEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoGastoEmpleado.add(jLabelIdEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);



	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = 1;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoGastoEmpleado.add(jTextFieldidEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);


	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoGastoEmpleado.add(jLabelcodigoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 2;
		this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoGastoEmpleado.add(jButtoncodigoEstadoGastoEmpleadoBusqueda, this.gridBagConstraintsEstadoGastoEmpleado);
	}

	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = 1;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoGastoEmpleado.add(jTextFieldcodigoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);


	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoGastoEmpleado.add(jLabelnombreEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 2;
		this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
		this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoGastoEmpleado.add(jButtonnombreEstadoGastoEmpleadoBusqueda, this.gridBagConstraintsEstadoGastoEmpleado);
	}

	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = 1;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoGastoEmpleado.add(jscrollPanenombreEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = iYPanelCamposEstadoGastoEmpleado;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = iXPanelCamposEstadoGastoEmpleado++;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoGastoEmpleado.add(this.jPanelidEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);



	if(iXPanelCamposEstadoGastoEmpleado % 1==0) {
		iXPanelCamposEstadoGastoEmpleado=0;
		iYPanelCamposEstadoGastoEmpleado++;
	}
	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = iYPanelCamposEstadoGastoEmpleado;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = iXPanelCamposEstadoGastoEmpleado++;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoGastoEmpleado.add(this.jPanelcodigoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);



	if(iXPanelCamposEstadoGastoEmpleado % 1==0) {
		iXPanelCamposEstadoGastoEmpleado=0;
		iYPanelCamposEstadoGastoEmpleado++;
	}
	this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoGastoEmpleado.gridy = iYPanelCamposEstadoGastoEmpleado;
	this.gridBagConstraintsEstadoGastoEmpleado.gridx = iXPanelCamposEstadoGastoEmpleado++;
	this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoGastoEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoGastoEmpleado.add(this.jPanelnombreEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);



	if(iXPanelCamposEstadoGastoEmpleado % 1==0) {
		iXPanelCamposEstadoGastoEmpleado=0;
		iYPanelCamposEstadoGastoEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoGastoEmpleado= new GridBagLayout();
		this.jPanelAccionesEstadoGastoEmpleado.setLayout(gridaBagLayoutAccionesEstadoGastoEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoGastoEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoGastoEmpleado.setLayout(gridaBagLayoutAccionesFormularioEstadoGastoEmpleado);
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoGastoEmpleado.add(this.jComboBoxTiposAccionesFormularioEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);

		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoGastoEmpleado.add(this.jCheckBoxPostAccionNuevoEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoGastoEmpleado.add(this.jCheckBoxPostAccionSinCerrarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadogastoempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoGastoEmpleado.add(this.jCheckBoxPostAccionSinMensajeEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoGastoEmpleado.add(this.jButtonModificarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);							

		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoGastoEmpleado.add(this.jButtonEliminarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
			
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoGastoEmpleado.add(this.jButtonActualizarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);


		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoGastoEmpleado.add(this.jButtonGuardarCambiosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);	
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = 0;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoGastoEmpleado.add(this.jButtonCancelarEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoGastoEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoGastoEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadogastoempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;		
			//this.gridBagConstraintsEstadoGastoEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoGastoEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =0;
		this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoGastoEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoGastoEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoGastoEmpleado = new EstadoGastoEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Gasto Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Gasto Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Gasto Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoGastoEmpleadoModel estadogastoempleadoModel=new EstadoGastoEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoGastoEmpleadoModel.EstadoGastoEmpleadoFocusTraversalPolicy estadogastoempleadoFocusTraversalPolicy = estadogastoempleadoModel.new EstadoGastoEmpleadoFocusTraversalPolicy(this);
			
			//estadogastoempleadoFocusTraversalPolicy.setestadogastoempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadogastoempleadoModel);
			
			
			this.jContentPaneDetalleEstadoGastoEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoGastoEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleEstadoGastoEmpleado.setLayout(gridaBagLayoutDetalleEstadoGastoEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoGastoEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
				this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoGastoEmpleado.add(jTtoolBarDetalleEstadoGastoEmpleado, gridBagConstraintsEstadoGastoEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado=   new JScrollPane(jContentPaneDetalleEstadoGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleEstadoGastoEmpleado.add(jPanelCamposEstadoGastoEmpleado, gridBagConstraintsEstadoGastoEmpleado);
			
			
			
			
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
						&& estadogastoempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameGastoEmpleado(this.puedeCargarPorParteGastoEmpleado,false,-1);
					
					if(this.estadogastoempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoGastoEmpleado= new GridBagConstraints();
						this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
						this.jContentPaneDetalleEstadoGastoEmpleado.add(this.jTabbedPaneRelacionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoGastoEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameGastoEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoGastoEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
					this.gridBagConstraintsEstadoGastoEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoGastoEmpleado.add(jPanelCamposOcultosEstadoGastoEmpleado, gridBagConstraintsEstadoGastoEmpleado);
				
					this.jPanelCamposOcultosEstadoGastoEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
	        this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoGastoEmpleado.add(this.jPanelAccionesFormularioEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);							
			
			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoGastoEmpleado.add(this.jPanelAccionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoGastoEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado=   new JScrollPane(this.jPanelCamposEstadoGastoEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoGastoEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
			this.gridBagConstraintsEstadoGastoEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoGastoEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoGastoEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);			
			
			this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
			this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
			
			
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		
			
		this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
		this.gridBagConstraintsEstadoGastoEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoGastoEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoGastoEmpleado, this.gridBagConstraintsEstadoGastoEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoGastoEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoGastoEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameGastoEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.gastoempleadoSessionBean=new GastoEmpleadoSessionBean();
		this.gastoempleadoSessionBean.setConGuardarRelaciones(false);
		this.gastoempleadoSessionBean.setEsGuardarRelacionado(true);

		this.gastoempleadoBeanSwingJInternalFrame=null;//new GastoEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.gastoempleadoBeanSwingJInternalFramePopup=new GastoEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.gastoempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {

				GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				GastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoGastoEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.gastoempleadoSessionBean.setEsGuardarRelacionado(true);

				this.gastoempleadoBeanSwingJInternalFrame=new GastoEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.gastoempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.gastoempleadoBeanSwingJInternalFrame.setgastoempleadoSessionBean(this.gastoempleadoSessionBean);

				//this.gridBagConstraintsEstadoGastoEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsEstadoGastoEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoGastoEmpleado.gridx = 0;
				//this.jContentPaneDetalleEstadoGastoEmpleado.add(this.gastoempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoGastoEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoGastoEmpleado.add("Gasto Empleados",this.gastoempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoGastoEmpleado.setComponentAt(iIndexTab,this.gastoempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//GastoEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.gastoempleadoSessionBean.setEsGuardarRelacionado(false);
				this.gastoempleadoBeanSwingJInternalFrame=null;//new GastoEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.gastoempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteGastoEmpleado) {
					this.jTabbedPaneRelacionesEstadoGastoEmpleado.add("Gasto Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarGastoEmpleadoBeanSwingJInternalFrame(List<EstadoGastoEmpleado> estadogastoempleados,EstadoGastoEmpleado estadogastoempleado,GastoEmpleadoBeanSwingJInternalFrame gastoempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//gastoempleadoBeanSwingJInternalFrame=new GastoEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					gastoempleadoBeanSwingJInternalFrame.getGastoEmpleadoLogic().setConnexion(this.estadogastoempleadoLogic.getConnexion());

					gastoempleadoBeanSwingJInternalFrame.setestadogastoempleadosForeignKey(estadogastoempleados);
					gastoempleadoBeanSwingJInternalFrame.setestadogastoempleadoForeignKey(estadogastoempleado);
					gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoGastoEmpleado(true);
					gastoempleadoBeanSwingJInternalFrame.gastoempleadoSessionBean.setlidEstadoGastoEmpleadoActual(estadogastoempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					gastoempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyGastoEmpleado(gastoempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					gastoempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoGastoEmpleado(true);
					gastoempleadoBeanSwingJInternalFrame.setid_estado_gasto_empleadoFK_IdEstadoGastoEmpleado(estadogastoempleado.getId());

					if(!this.conCargarFormDetalle) {
						gastoempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					gastoempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoGastoEmpleadoForeignKey(estadogastoempleado,1,false,true,true);
					gastoempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					gastoempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoGastoEmpleado");
					gastoempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoGastoEmpleado");
					gastoempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaGastoEmpleado(true);
					gastoempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesGastoEmpleado("n",gastoempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, gastoempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					gastoempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					gastoempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						gastoempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoEmpleado("relacionado");
					} else {
						gastoempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsGastoEmpleado("no_relacionado");
					}

					gastoempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionGastoEmpleado().setVisible(false);

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
