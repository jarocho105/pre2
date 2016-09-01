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
import com.bydan.erp.nomina.util.TipoProvisionEmpleadoConstantesFunciones;

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
public class TipoProvisionEmpleadoDetalleFormJInternalFrame extends TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoProvisionEmpleado;
	
	protected JMenuBar jmenuBarDetalleTipoProvisionEmpleado;
	
	protected JMenu jmenuDetalleTipoProvisionEmpleado;
	protected JMenu jmenuDetalleArchivoTipoProvisionEmpleado;
	protected JMenu jmenuDetalleAccionesTipoProvisionEmpleado;
	protected JMenu jmenuDetalleDatosTipoProvisionEmpleado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoProvisionEmpleado;	
	protected GridBagConstraints gridBagConstraintsTipoProvisionEmpleado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoProvisionEmpleado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoProvisionEmpleadoSessionBean tipoprovisionempleadoSessionBean;
	
	

	public ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame=null;
	public ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProvisionEmpleado=false;
	public ProvisionEmpleadoSessionBean provisionempleadoSessionBean;
	
		
	
	public TipoProvisionEmpleadoLogic tipoprovisionempleadoLogic;
	
	public JScrollPane jScrollPanelDatosTipoProvisionEmpleado;
	public JScrollPane jScrollPanelDatosEdicionTipoProvisionEmpleado;
	public JScrollPane jScrollPanelDatosGeneralTipoProvisionEmpleado;
	
	protected JPanel jPanelCamposTipoProvisionEmpleado;    
	protected JPanel jPanelCamposOcultosTipoProvisionEmpleado;    	
	protected JPanel jPanelAccionesTipoProvisionEmpleado;
	protected JPanel jPanelAccionesFormularioTipoProvisionEmpleado;
    
	
	
	protected Integer iXPanelCamposTipoProvisionEmpleado=0;
	protected Integer iYPanelCamposTipoProvisionEmpleado=0;
	
	protected Integer iXPanelCamposOcultosTipoProvisionEmpleado=0;
	protected Integer iYPanelCamposOcultosTipoProvisionEmpleado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoProvisionEmpleado;
	public JButton jButtonModificarTipoProvisionEmpleado;
	public JButton jButtonActualizarTipoProvisionEmpleado;
    public JButton jButtonEliminarTipoProvisionEmpleado;
	public JButton jButtonCancelarTipoProvisionEmpleado;
    public JButton jButtonGuardarCambiosTipoProvisionEmpleado;
	public JButton jButtonGuardarCambiosTablaTipoProvisionEmpleado;
	protected JButton jButtonCerrarTipoProvisionEmpleado;
	
	
	protected JButton jButtonProcesarInformacionTipoProvisionEmpleado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoProvisionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoProvisionEmpleado;
	protected JButton jButtonModificarToolBarTipoProvisionEmpleado;
	protected JButton jButtonActualizarToolBarTipoProvisionEmpleado;
    protected JButton jButtonEliminarToolBarTipoProvisionEmpleado;
	protected JButton jButtonCancelarToolBarTipoProvisionEmpleado;
    protected JButton jButtonGuardarCambiosToolBarTipoProvisionEmpleado;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoProvisionEmpleado;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoProvisionEmpleado;
	protected JButton jButtonCerrarToolBarTipoProvisionEmpleado;
	
	protected JButton jButtonProcesarInformacionToolBarTipoProvisionEmpleado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoProvisionEmpleado;
	protected JMenuItem jMenuItemModificarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemActualizarTipoProvisionEmpleado;
    protected JMenuItem jMenuItemEliminarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemCancelarTipoProvisionEmpleado;
    protected JMenuItem jMenuItemGuardarCambiosTipoProvisionEmpleado;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoProvisionEmpleado;
	protected JMenuItem jMenuItemCerrarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleCerrarTipoProvisionEmpleado;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoProvisionEmpleado;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoProvisionEmpleado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoProvisionEmpleado;
	protected JMenuItem jMenuItemMostrarOcultarTipoProvisionEmpleado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoProvisionEmpleado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoProvisionEmpleado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoProvisionEmpleado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoProvisionEmpleado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoProvisionEmpleado;
	public JLabel jLabelIdTipoProvisionEmpleado;
	public JTextFieldMe jTextFieldidTipoProvisionEmpleado;
	public JButton jButtonidTipoProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoProvisionEmpleado;
	public JLabel jLabelcodigoTipoProvisionEmpleado;
	public JTextField jTextFieldcodigoTipoProvisionEmpleado;
	public JButton jButtoncodigoTipoProvisionEmpleadoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoProvisionEmpleado;
	public JLabel jLabelnombreTipoProvisionEmpleado;
	public JTextArea jTextAreanombreTipoProvisionEmpleado;
	public JScrollPane jscrollPanenombreTipoProvisionEmpleado;
	public JButton jButtonnombreTipoProvisionEmpleadoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoProvisionEmpleado;
	
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
	
	public TipoProvisionEmpleadoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoProvisionEmpleado=new JPanel();
				this.jPanelAccionesFormularioTipoProvisionEmpleado=new JPanel();
				this.jmenuBarDetalleTipoProvisionEmpleado=new JMenuBar();
				this.jTtoolBarDetalleTipoProvisionEmpleado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProvisionEmpleadoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoProvisionEmpleadoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProvisionEmpleadoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProvisionEmpleadoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoProvisionEmpleadoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoProvisionEmpleado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoProvisionEmpleado() {
		return this.jButtonActualizarToolBarTipoProvisionEmpleado;
	}
	
	public JButton getjButtonEliminarToolBarTipoProvisionEmpleado() {
		return this.jButtonEliminarToolBarTipoProvisionEmpleado;
	}
	
	public JButton getjButtonCancelarToolBarTipoProvisionEmpleado() {
		return this.jButtonCancelarToolBarTipoProvisionEmpleado;
	}		
	
	public JButton getjButtonProcesarInformacionTipoProvisionEmpleado() {
		return this.jButtonProcesarInformacionTipoProvisionEmpleado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoProvisionEmpleado)	{
		this.jButtonProcesarInformacionTipoProvisionEmpleado = jButtonProcesarInformacionTipoProvisionEmpleado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoProvisionEmpleado() {
		return this.jComboBoxTiposAccionesTipoProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoProvisionEmpleado(
			JComboBox jComboBoxTiposRelacionesTipoProvisionEmpleado) {
		this.jComboBoxTiposRelacionesTipoProvisionEmpleado = jComboBoxTiposRelacionesTipoProvisionEmpleado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesTipoProvisionEmpleado) {
		this.jComboBoxTiposAccionesTipoProvisionEmpleado = jComboBoxTiposAccionesTipoProvisionEmpleado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoProvisionEmpleado() {
		return this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoProvisionEmpleado(
			JComboBox jComboBoxTiposAccionesFormularioTipoProvisionEmpleado) {
		this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado = jComboBoxTiposAccionesFormularioTipoProvisionEmpleado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprovisionempleadoSessionBean=new TipoProvisionEmpleadoSessionBean();
		
		this.tipoprovisionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprovisionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoProvisionEmpleadoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Provision Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoProvisionEmpleado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoProvisionEmpleado=new JButtonMe();
				this.jButtonModificarToolBarTipoProvisionEmpleado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoProvisionEmpleado,this.jTtoolBarDetalleTipoProvisionEmpleado,
							"actualizar","actualizar","Actualizar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoProvisionEmpleado,this.jTtoolBarDetalleTipoProvisionEmpleado,
							"eliminar","eliminar","Eliminar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoProvisionEmpleado,this.jTtoolBarDetalleTipoProvisionEmpleado,
							"cancelar","cancelar","Cancelar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoProvisionEmpleado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoProvisionEmpleado,this.jTtoolBarDetalleTipoProvisionEmpleado,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoProvisionEmpleado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoProvisionEmpleado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoProvisionEmpleado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoProvisionEmpleado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoProvisionEmpleado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoProvisionEmpleado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoProvisionEmpleado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoProvisionEmpleado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoProvisionEmpleado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoProvisionEmpleado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoProvisionEmpleado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoProvisionEmpleado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoProvisionEmpleado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoProvisionEmpleado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoProvisionEmpleado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoProvisionEmpleado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoProvisionEmpleado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoProvisionEmpleado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoProvisionEmpleado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoProvisionEmpleado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoProvisionEmpleado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoProvisionEmpleado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoProvisionEmpleado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoProvisionEmpleado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoProvisionEmpleado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoProvisionEmpleado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoProvisionEmpleado.add(this.jMenuItemDetalleCerrarTipoProvisionEmpleado);
		
		this.jmenuDetalleAccionesTipoProvisionEmpleado.add(this.jMenuItemActualizarTipoProvisionEmpleado);
		this.jmenuDetalleAccionesTipoProvisionEmpleado.add(this.jMenuItemEliminarTipoProvisionEmpleado);
		this.jmenuDetalleAccionesTipoProvisionEmpleado.add(this.jMenuItemCancelarTipoProvisionEmpleado);		
		
		//this.jmenuDetalleDatosTipoProvisionEmpleado.add(this.jMenuItemDetalleAbrirOrderByTipoProvisionEmpleado);				
		this.jmenuDetalleDatosTipoProvisionEmpleado.add(this.jMenuItemDetalleMostarOcultarTipoProvisionEmpleado);				
				
		//this.jmenuDetalleAccionesTipoProvisionEmpleado.add(this.jMenuItemGuardarCambiosTipoProvisionEmpleado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoProvisionEmpleado.add(this.jmenuDetalleArchivoTipoProvisionEmpleado);		
		this.jmenuBarDetalleTipoProvisionEmpleado.add(this.jmenuDetalleAccionesTipoProvisionEmpleado);		
		this.jmenuBarDetalleTipoProvisionEmpleado.add(this.jmenuDetalleDatosTipoProvisionEmpleado);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoProvisionEmpleado.add(this.jmenuDetalleTipoProvisionEmpleado);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoProvisionEmpleado);				
	}
	
	
	public void inicializarElementosCamposTipoProvisionEmpleado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoProvisionEmpleado = new JLabelMe();
		jLabelIdTipoProvisionEmpleado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoProvisionEmpleado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoProvisionEmpleado.setToolTipText(TipoProvisionEmpleadoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoProvisionEmpleado= new GridBagLayout();

		this.jPanelidTipoProvisionEmpleado.setLayout(this.gridaBagLayoutTipoProvisionEmpleado);

		jTextFieldidTipoProvisionEmpleado = new JTextFieldMe();
		jTextFieldidTipoProvisionEmpleado.setText("Id");

		jTextFieldidTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoProvisionEmpleado = new JLabelMe();
		this.jLabelcodigoTipoProvisionEmpleado.setText(""+TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoProvisionEmpleado.setToolTipText("Codigo");
		this.jLabelcodigoTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoProvisionEmpleado.setToolTipText(TipoProvisionEmpleadoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoProvisionEmpleado = new GridBagLayout();
		this.jPanelcodigoTipoProvisionEmpleado.setLayout(this.gridaBagLayoutTipoProvisionEmpleado);


		jTextFieldcodigoTipoProvisionEmpleado= new JTextFieldMe();

		jTextFieldcodigoTipoProvisionEmpleado.setEnabled(false);
		jTextFieldcodigoTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoProvisionEmpleadoBusqueda.setText("U");
		this.jButtoncodigoTipoProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoProvisionEmpleadoBusqueda"));

		if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoProvisionEmpleadoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoProvisionEmpleado = new JLabelMe();
		this.jLabelnombreTipoProvisionEmpleado.setText(""+TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoProvisionEmpleado.setToolTipText("Nombre");
		this.jLabelnombreTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoProvisionEmpleado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoProvisionEmpleado.setToolTipText(TipoProvisionEmpleadoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoProvisionEmpleado = new GridBagLayout();
		this.jPanelnombreTipoProvisionEmpleado.setLayout(this.gridaBagLayoutTipoProvisionEmpleado);


		jTextAreanombreTipoProvisionEmpleado= new JTextAreaMe();
		jTextAreanombreTipoProvisionEmpleado.setEnabled(false);
		jTextAreanombreTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoProvisionEmpleado.setLineWrap(true);
		jTextAreanombreTipoProvisionEmpleado.setWrapStyleWord(true);
		jTextAreanombreTipoProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoProvisionEmpleado.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoProvisionEmpleado = new JScrollPane(jTextAreanombreTipoProvisionEmpleado);
		jscrollPanenombreTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoProvisionEmpleadoBusqueda= new JButtonMe();
		this.jButtonnombreTipoProvisionEmpleadoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProvisionEmpleadoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoProvisionEmpleadoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoProvisionEmpleadoBusqueda.setText("U");
		this.jButtonnombreTipoProvisionEmpleadoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoProvisionEmpleadoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoProvisionEmpleadoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoProvisionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoProvisionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoProvisionEmpleadoBusqueda"));

		if(this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoProvisionEmpleadoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoProvisionEmpleado() {
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
		//this.jInternalFrameDetalleTipoProvisionEmpleado = new TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Provision Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoProvisionEmpleado= new GridBagLayout();
		

		
		String sToolTipTipoProvisionEmpleado="";
		sToolTipTipoProvisionEmpleado=TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoProvisionEmpleado+="(Nomina.TipoProvisionEmpleado)";
		}
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoProvisionEmpleado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoProvisionEmpleado = new JButtonMe();
		this.jButtonModificarTipoProvisionEmpleado = new JButtonMe();
        this.jButtonActualizarTipoProvisionEmpleado = new JButtonMe();
        this.jButtonEliminarTipoProvisionEmpleado = new JButtonMe();
        this.jButtonCancelarTipoProvisionEmpleado = new JButtonMe();
        this.jButtonGuardarCambiosTipoProvisionEmpleado = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado = new JButtonMe();
		this.jButtonCerrarTipoProvisionEmpleado = new JButtonMe();
		
		this.jScrollPanelDatosTipoProvisionEmpleado = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoProvisionEmpleado = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoProvisionEmpleado = new JScrollPane();
				
		
		
		this.jPanelCamposTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Provision Empleado";
		
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Provision Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoProvisionEmpleado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoProvisionEmpleado.setName("jPanelCamposTipoProvisionEmpleado"); 

		this.jPanelCamposOcultosTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoProvisionEmpleado.setName("jPanelCamposOcultosTipoProvisionEmpleado"); 

        this.jPanelAccionesTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesTipoProvisionEmpleado.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoProvisionEmpleado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoProvisionEmpleado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoProvisionEmpleado.setText("Nuevo");
		this.jButtonModificarTipoProvisionEmpleado.setText("Editar");
        this.jButtonActualizarTipoProvisionEmpleado.setText("Actualizar");
        this.jButtonEliminarTipoProvisionEmpleado.setText("Eliminar");
        this.jButtonCancelarTipoProvisionEmpleado.setText("Cancelar");
        this.jButtonGuardarCambiosTipoProvisionEmpleado.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.setText("Guardar");
		this.jButtonCerrarTipoProvisionEmpleado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoProvisionEmpleado,"nuevo_button","Nuevo",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoProvisionEmpleado,"modificar_button","Editar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoProvisionEmpleado,"actualizar_button","Actualizar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoProvisionEmpleado,"eliminar_button","Eliminar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoProvisionEmpleado,"cancelar_button","Cancelar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoProvisionEmpleado,"guardarcambios_button","Guardar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoProvisionEmpleado,"guardarcambiostabla_button","Guardar",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoProvisionEmpleado,"cerrar_button","Salir",this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoProvisionEmpleado.setToolTipText("Nuevo"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoProvisionEmpleado.setToolTipText("Editar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoProvisionEmpleado.setToolTipText("Actualizar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoProvisionEmpleado.setToolTipText("Eliminar)"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoProvisionEmpleado.setToolTipText("Cancelar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoProvisionEmpleado.setToolTipText("Guardar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.setToolTipText("Guardar"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoProvisionEmpleado.setToolTipText("Salir"+" "+TipoProvisionEmpleadoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoProvisionEmpleado";
		inputMap = this.jButtonNuevoTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoProvisionEmpleado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoProvisionEmpleado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoProvisionEmpleado";
		inputMap = this.jButtonActualizarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoProvisionEmpleado"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoProvisionEmpleado";
		inputMap = this.jButtonEliminarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoProvisionEmpleado"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoProvisionEmpleado";
		inputMap = this.jButtonCancelarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoProvisionEmpleado"));
		
		//CERRAR		
		sMapKey = "CerrarTipoProvisionEmpleado";
		inputMap = this.jButtonCerrarTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoProvisionEmpleado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoProvisionEmpleado";
		inputMap = this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoProvisionEmpleado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoProvisionEmpleado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoProvisionEmpleado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoProvisionEmpleado.setToolTipText("Nuevo TipoProvisionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado.setToolTipText("Sin Cerrar Ventana TipoProvisionEmpleado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoProvisionEmpleado.setText("Accion");
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoProvisionEmpleado = new JLabelMe();
		
		this.jLabelAccionesTipoProvisionEmpleado.setText("Acciones");		
		this.jLabelAccionesTipoProvisionEmpleado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProvisionEmpleado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoProvisionEmpleado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoProvisionEmpleado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoProvisionEmpleado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoProvisionEmpleado=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoProvisionEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoProvisionEmpleado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoProvisionEmpleado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoProvisionEmpleado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoProvisionEmpleado = new GridBagLayout();
		
		this.jPanelCamposTipoProvisionEmpleado.setLayout(gridaBagLayoutCamposTipoProvisionEmpleado);
		this.jPanelCamposOcultosTipoProvisionEmpleado.setLayout(gridaBagLayoutCamposOcultosTipoProvisionEmpleado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoProvisionEmpleado.add(jLabelIdTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);



	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoProvisionEmpleado.add(jTextFieldidTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);


	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoProvisionEmpleado.add(jLabelcodigoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoProvisionEmpleado.add(jButtoncodigoTipoProvisionEmpleadoBusqueda, this.gridBagConstraintsTipoProvisionEmpleado);
	}

	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoProvisionEmpleado.add(jTextFieldcodigoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);


	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoProvisionEmpleado.add(jLabelnombreTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		//this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 2;
		this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
		this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoProvisionEmpleado.add(jButtonnombreTipoProvisionEmpleadoBusqueda, this.gridBagConstraintsTipoProvisionEmpleado);
	}

	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = 1;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoProvisionEmpleado.add(jscrollPanenombreTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = iYPanelCamposTipoProvisionEmpleado;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = iXPanelCamposTipoProvisionEmpleado++;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProvisionEmpleado.add(this.jPanelidTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);



	if(iXPanelCamposTipoProvisionEmpleado % 1==0) {
		iXPanelCamposTipoProvisionEmpleado=0;
		iYPanelCamposTipoProvisionEmpleado++;
	}
	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = iYPanelCamposTipoProvisionEmpleado;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = iXPanelCamposTipoProvisionEmpleado++;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProvisionEmpleado.add(this.jPanelcodigoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);



	if(iXPanelCamposTipoProvisionEmpleado % 1==0) {
		iXPanelCamposTipoProvisionEmpleado=0;
		iYPanelCamposTipoProvisionEmpleado++;
	}
	this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoProvisionEmpleado.gridy = iYPanelCamposTipoProvisionEmpleado;
	this.gridBagConstraintsTipoProvisionEmpleado.gridx = iXPanelCamposTipoProvisionEmpleado++;
	this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoProvisionEmpleado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoProvisionEmpleado.add(this.jPanelnombreTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);



	if(iXPanelCamposTipoProvisionEmpleado % 1==0) {
		iXPanelCamposTipoProvisionEmpleado=0;
		iYPanelCamposTipoProvisionEmpleado++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesTipoProvisionEmpleado.setLayout(gridaBagLayoutAccionesTipoProvisionEmpleado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoProvisionEmpleado= new GridBagLayout();
		this.jPanelAccionesFormularioTipoProvisionEmpleado.setLayout(gridaBagLayoutAccionesFormularioTipoProvisionEmpleado);
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProvisionEmpleado.add(this.jComboBoxTiposAccionesFormularioTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);

		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoProvisionEmpleado.add(this.jCheckBoxPostAccionNuevoTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProvisionEmpleado.add(this.jCheckBoxPostAccionSinCerrarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprovisionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoProvisionEmpleado.add(this.jCheckBoxPostAccionSinMensajeTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoProvisionEmpleado.add(this.jButtonModificarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);							

		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoProvisionEmpleado.add(this.jButtonEliminarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
			
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProvisionEmpleado.add(this.jButtonActualizarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);


		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoProvisionEmpleado.add(this.jButtonGuardarCambiosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);	
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = 0;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoProvisionEmpleado.add(this.jButtonCancelarTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoProvisionEmpleado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoProvisionEmpleado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprovisionempleadoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();						
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;		
			//this.gridBagConstraintsTipoProvisionEmpleado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoProvisionEmpleado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =0;
		this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoProvisionEmpleado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoProvisionEmpleadoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoProvisionEmpleado = new TipoProvisionEmpleadoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Provision Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Provision Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Provision Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoProvisionEmpleadoModel tipoprovisionempleadoModel=new TipoProvisionEmpleadoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoProvisionEmpleadoModel.TipoProvisionEmpleadoFocusTraversalPolicy tipoprovisionempleadoFocusTraversalPolicy = tipoprovisionempleadoModel.new TipoProvisionEmpleadoFocusTraversalPolicy(this);
			
			//tipoprovisionempleadoFocusTraversalPolicy.settipoprovisionempleadoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprovisionempleadoModel);
			
			
			this.jContentPaneDetalleTipoProvisionEmpleado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoProvisionEmpleado = new GridBagLayout();	
			this.jContentPaneDetalleTipoProvisionEmpleado.setLayout(gridaBagLayoutDetalleTipoProvisionEmpleado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoProvisionEmpleado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
				this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
					
				
				this.jContentPaneDetalleTipoProvisionEmpleado.add(jTtoolBarDetalleTipoProvisionEmpleado, gridBagConstraintsTipoProvisionEmpleado);								
				
}
			
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado=   new JScrollPane(jContentPaneDetalleTipoProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
	        
			this.jContentPaneDetalleTipoProvisionEmpleado.add(jPanelCamposTipoProvisionEmpleado, gridBagConstraintsTipoProvisionEmpleado);
			
			
			
			
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
						&& tipoprovisionempleadoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(this.puedeCargarPorParteProvisionEmpleado,false,-1);
					
					if(this.tipoprovisionempleadoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoProvisionEmpleado= new GridBagConstraints();
						this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
						this.jContentPaneDetalleTipoProvisionEmpleado.add(this.jTabbedPaneRelacionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoProvisionEmpleado.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoProvisionEmpleado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
					this.gridBagConstraintsTipoProvisionEmpleado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
					
				
					this.jContentPaneDetalleTipoProvisionEmpleado.add(jPanelCamposOcultosTipoProvisionEmpleado, gridBagConstraintsTipoProvisionEmpleado);
				
					this.jPanelCamposOcultosTipoProvisionEmpleado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
	        this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoProvisionEmpleado.add(this.jPanelAccionesFormularioTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);							
			
			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
	        this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoProvisionEmpleado.add(this.jPanelAccionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoProvisionEmpleado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado=   new JScrollPane(this.jPanelCamposTipoProvisionEmpleado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoProvisionEmpleado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
			this.gridBagConstraintsTipoProvisionEmpleado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoProvisionEmpleado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoProvisionEmpleado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);			
			
			this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
			this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
			
			
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		
			
		this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
		this.gridBagConstraintsTipoProvisionEmpleado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoProvisionEmpleado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoProvisionEmpleado, this.gridBagConstraintsTipoProvisionEmpleado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoProvisionEmpleado;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoProvisionEmpleado;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameProvisionEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.provisionempleadoSessionBean=new ProvisionEmpleadoSessionBean();
		this.provisionempleadoSessionBean.setConGuardarRelaciones(false);
		this.provisionempleadoSessionBean.setEsGuardarRelacionado(true);

		this.provisionempleadoBeanSwingJInternalFrame=null;//new ProvisionEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.provisionempleadoBeanSwingJInternalFramePopup=new ProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.provisionempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {

				ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoProvisionEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.provisionempleadoSessionBean.setEsGuardarRelacionado(true);

				this.provisionempleadoBeanSwingJInternalFrame=new ProvisionEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.provisionempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.provisionempleadoBeanSwingJInternalFrame.setprovisionempleadoSessionBean(this.provisionempleadoSessionBean);

				//this.gridBagConstraintsTipoProvisionEmpleado = new GridBagConstraints();
				//this.gridBagConstraintsTipoProvisionEmpleado.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoProvisionEmpleado.gridx = 0;
				//this.jContentPaneDetalleTipoProvisionEmpleado.add(this.provisionempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoProvisionEmpleado);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoProvisionEmpleado.add("Provision Empleados",this.provisionempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoProvisionEmpleado.setComponentAt(iIndexTab,this.provisionempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//ProvisionEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.provisionempleadoSessionBean.setEsGuardarRelacionado(false);
				this.provisionempleadoBeanSwingJInternalFrame=null;//new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.provisionempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProvisionEmpleado) {
					this.jTabbedPaneRelacionesTipoProvisionEmpleado.add("Provision Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProvisionEmpleadoBeanSwingJInternalFrame(List<TipoProvisionEmpleado> tipoprovisionempleados,TipoProvisionEmpleado tipoprovisionempleado,ProvisionEmpleadoBeanSwingJInternalFrame provisionempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//provisionempleadoBeanSwingJInternalFrame=new ProvisionEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					provisionempleadoBeanSwingJInternalFrame.getProvisionEmpleadoLogic().setConnexion(this.tipoprovisionempleadoLogic.getConnexion());

					provisionempleadoBeanSwingJInternalFrame.settipoprovisionempleadosForeignKey(tipoprovisionempleados);
					provisionempleadoBeanSwingJInternalFrame.settipoprovisionempleadoForeignKey(tipoprovisionempleado);
					provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoProvisionEmpleado(true);
					provisionempleadoBeanSwingJInternalFrame.provisionempleadoSessionBean.setlidTipoProvisionEmpleadoActual(tipoprovisionempleado.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					provisionempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyProvisionEmpleado(provisionempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					provisionempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoProvisionEmpleado(true);
					provisionempleadoBeanSwingJInternalFrame.setid_tipo_provision_empleadoFK_IdTipoProvisionEmpleado(tipoprovisionempleado.getId());

					if(!this.conCargarFormDetalle) {
						provisionempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					provisionempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoProvisionEmpleadoForeignKey(tipoprovisionempleado,1,false,true,true);
					provisionempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					provisionempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoProvisionEmpleado");
					provisionempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoProvisionEmpleado");
					provisionempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvisionEmpleado(true);
					provisionempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProvisionEmpleado("n",provisionempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, provisionempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					provisionempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					provisionempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("relacionado");
					} else {
						provisionempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsProvisionEmpleado("no_relacionado");
					}

					provisionempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionProvisionEmpleado().setVisible(false);

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
