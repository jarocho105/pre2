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
import com.bydan.erp.nomina.util.TipoAsistenciaConstantesFunciones;

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
public class TipoAsistenciaDetalleFormJInternalFrame extends TipoAsistenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoAsistencia;
	
	protected JMenuBar jmenuBarDetalleTipoAsistencia;
	
	protected JMenu jmenuDetalleTipoAsistencia;
	protected JMenu jmenuDetalleArchivoTipoAsistencia;
	protected JMenu jmenuDetalleAccionesTipoAsistencia;
	protected JMenu jmenuDetalleDatosTipoAsistencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAsistencia;	
	protected GridBagConstraints gridBagConstraintsTipoAsistencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoAsistenciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoAsistencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoAsistenciaSessionBean tipoasistenciaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoAsistenciaLogic tipoasistenciaLogic;
	
	public JScrollPane jScrollPanelDatosTipoAsistencia;
	public JScrollPane jScrollPanelDatosEdicionTipoAsistencia;
	public JScrollPane jScrollPanelDatosGeneralTipoAsistencia;
	
	protected JPanel jPanelCamposTipoAsistencia;    
	protected JPanel jPanelCamposOcultosTipoAsistencia;    	
	protected JPanel jPanelAccionesTipoAsistencia;
	protected JPanel jPanelAccionesFormularioTipoAsistencia;
    
	
	
	protected Integer iXPanelCamposTipoAsistencia=0;
	protected Integer iYPanelCamposTipoAsistencia=0;
	
	protected Integer iXPanelCamposOcultosTipoAsistencia=0;
	protected Integer iYPanelCamposOcultosTipoAsistencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoAsistencia;
	public JButton jButtonModificarTipoAsistencia;
	public JButton jButtonActualizarTipoAsistencia;
    public JButton jButtonEliminarTipoAsistencia;
	public JButton jButtonCancelarTipoAsistencia;
    public JButton jButtonGuardarCambiosTipoAsistencia;
	public JButton jButtonGuardarCambiosTablaTipoAsistencia;
	protected JButton jButtonCerrarTipoAsistencia;
	
	
	protected JButton jButtonProcesarInformacionTipoAsistencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoAsistencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoAsistencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoAsistencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAsistencia;
	protected JButton jButtonModificarToolBarTipoAsistencia;
	protected JButton jButtonActualizarToolBarTipoAsistencia;
    protected JButton jButtonEliminarToolBarTipoAsistencia;
	protected JButton jButtonCancelarToolBarTipoAsistencia;
    protected JButton jButtonGuardarCambiosToolBarTipoAsistencia;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoAsistencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAsistencia;
	protected JButton jButtonCerrarToolBarTipoAsistencia;
	
	protected JButton jButtonProcesarInformacionToolBarTipoAsistencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAsistencia;
	protected JMenuItem jMenuItemModificarTipoAsistencia;
	protected JMenuItem jMenuItemActualizarTipoAsistencia;
    protected JMenuItem jMenuItemEliminarTipoAsistencia;
	protected JMenuItem jMenuItemCancelarTipoAsistencia;
    protected JMenuItem jMenuItemGuardarCambiosTipoAsistencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAsistencia;
	protected JMenuItem jMenuItemCerrarTipoAsistencia;
	protected JMenuItem jMenuItemDetalleCerrarTipoAsistencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAsistencia;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoAsistencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAsistencia;
	protected JMenuItem jMenuItemMostrarOcultarTipoAsistencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAsistencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAsistencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAsistencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoAsistencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoAsistencia;
	public JLabel jLabelIdTipoAsistencia;
	public JLabel jLabelidTipoAsistencia;
	public JButton jButtonidTipoAsistenciaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoAsistencia;
	public JLabel jLabelnombreTipoAsistencia;
	public JTextField jTextFieldnombreTipoAsistencia;
	public JButton jButtonnombreTipoAsistenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoAsistencia;
	public JLabel jLabelid_empresaTipoAsistencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoAsistencia;
	public JButton jButtonid_empresaTipoAsistencia= new JButtonMe();
	public JButton jButtonid_empresaTipoAsistenciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoAsistenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoAsistencia;
	
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
	
	public TipoAsistenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoAsistencia=new JPanel();
				this.jPanelAccionesFormularioTipoAsistencia=new JPanel();
				this.jmenuBarDetalleTipoAsistencia=new JMenuBar();
				this.jTtoolBarDetalleTipoAsistencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAsistenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoAsistenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAsistenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAsistenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAsistenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAsistencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoAsistencia() {
		return this.jButtonActualizarToolBarTipoAsistencia;
	}
	
	public JButton getjButtonEliminarToolBarTipoAsistencia() {
		return this.jButtonEliminarToolBarTipoAsistencia;
	}
	
	public JButton getjButtonCancelarToolBarTipoAsistencia() {
		return this.jButtonCancelarToolBarTipoAsistencia;
	}		
	
	public JButton getjButtonProcesarInformacionTipoAsistencia() {
		return this.jButtonProcesarInformacionTipoAsistencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAsistencia)	{
		this.jButtonProcesarInformacionTipoAsistencia = jButtonProcesarInformacionTipoAsistencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAsistencia() {
		return this.jComboBoxTiposAccionesTipoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAsistencia(
			JComboBox jComboBoxTiposRelacionesTipoAsistencia) {
		this.jComboBoxTiposRelacionesTipoAsistencia = jComboBoxTiposRelacionesTipoAsistencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAsistencia(
			JComboBox jComboBoxTiposAccionesTipoAsistencia) {
		this.jComboBoxTiposAccionesTipoAsistencia = jComboBoxTiposAccionesTipoAsistencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoAsistencia() {
		return this.jComboBoxTiposAccionesFormularioTipoAsistencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoAsistencia(
			JComboBox jComboBoxTiposAccionesFormularioTipoAsistencia) {
		this.jComboBoxTiposAccionesFormularioTipoAsistencia = jComboBoxTiposAccionesFormularioTipoAsistencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoasistenciaSessionBean=new TipoAsistenciaSessionBean();
		
		this.tipoasistenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoasistenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoasistenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAsistenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAsistenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Asistencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoAsistenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoAsistencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoAsistencia=new JButtonMe();
				this.jButtonModificarToolBarTipoAsistencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoAsistencia,this.jTtoolBarDetalleTipoAsistencia,
							"actualizar","actualizar","Actualizar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoAsistencia,this.jTtoolBarDetalleTipoAsistencia,
							"eliminar","eliminar","Eliminar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoAsistencia,this.jTtoolBarDetalleTipoAsistencia,
							"cancelar","cancelar","Cancelar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoAsistencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoAsistencia,this.jTtoolBarDetalleTipoAsistencia,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoAsistencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoAsistencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoAsistencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoAsistencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoAsistencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAsistencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAsistencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAsistencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoAsistencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoAsistencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoAsistencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoAsistencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoAsistencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoAsistencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoAsistencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoAsistencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoAsistencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoAsistencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoAsistencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoAsistencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoAsistencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAsistencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAsistencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAsistencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAsistencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAsistencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoAsistencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoAsistencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoAsistencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAsistencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAsistencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAsistencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoAsistencia.add(this.jMenuItemDetalleCerrarTipoAsistencia);
		
		this.jmenuDetalleAccionesTipoAsistencia.add(this.jMenuItemActualizarTipoAsistencia);
		this.jmenuDetalleAccionesTipoAsistencia.add(this.jMenuItemEliminarTipoAsistencia);
		this.jmenuDetalleAccionesTipoAsistencia.add(this.jMenuItemCancelarTipoAsistencia);		
		
		//this.jmenuDetalleDatosTipoAsistencia.add(this.jMenuItemDetalleAbrirOrderByTipoAsistencia);				
		this.jmenuDetalleDatosTipoAsistencia.add(this.jMenuItemDetalleMostarOcultarTipoAsistencia);				
				
		//this.jmenuDetalleAccionesTipoAsistencia.add(this.jMenuItemGuardarCambiosTipoAsistencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoAsistencia.add(this.jmenuDetalleArchivoTipoAsistencia);		
		this.jmenuBarDetalleTipoAsistencia.add(this.jmenuDetalleAccionesTipoAsistencia);		
		this.jmenuBarDetalleTipoAsistencia.add(this.jmenuDetalleDatosTipoAsistencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoAsistencia);				
	}
	
	
	public void inicializarElementosCamposTipoAsistencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoAsistencia = new JLabelMe();
		jLabelIdTipoAsistencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoAsistencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoAsistencia.setToolTipText(TipoAsistenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoAsistencia= new GridBagLayout();

		this.jPanelidTipoAsistencia.setLayout(this.gridaBagLayoutTipoAsistencia);

		jLabelidTipoAsistencia = new JLabel();
		jLabelidTipoAsistencia.setText("Id");

		jLabelidTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoAsistencia = new JLabelMe();
		this.jLabelnombreTipoAsistencia.setText(""+TipoAsistenciaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoAsistencia.setToolTipText("Nombre");
		this.jLabelnombreTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoAsistencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoAsistencia.setToolTipText(TipoAsistenciaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoAsistencia = new GridBagLayout();
		this.jPanelnombreTipoAsistencia.setLayout(this.gridaBagLayoutTipoAsistencia);


		jTextFieldnombreTipoAsistencia= new JTextFieldMe();

		jTextFieldnombreTipoAsistencia.setEnabled(false);
		jTextFieldnombreTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoAsistenciaBusqueda= new JButtonMe();
		this.jButtonnombreTipoAsistenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAsistenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAsistenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoAsistenciaBusqueda.setText("U");
		this.jButtonnombreTipoAsistenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoAsistenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoAsistenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoAsistenciaBusqueda"));

		if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoAsistenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoAsistencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoAsistencia = new JLabelMe();
		this.jLabelid_empresaTipoAsistencia.setText(""+TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoAsistencia.setToolTipText("Empresa");
		this.jLabelid_empresaTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoAsistencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoAsistencia.setToolTipText(TipoAsistenciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoAsistencia = new GridBagLayout();
		this.jPanelid_empresaTipoAsistencia.setLayout(this.gridaBagLayoutTipoAsistencia);


		jComboBoxid_empresaTipoAsistencia= new JComboBoxMe();
		jComboBoxid_empresaTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoAsistencia.setEnabled(false);

		this.jButtonid_empresaTipoAsistencia= new JButtonMe();
		this.jButtonid_empresaTipoAsistencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAsistencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAsistencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoAsistencia.setText("Buscar");
		this.jButtonid_empresaTipoAsistencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoAsistencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAsistencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAsistencia"));

		this.jButtonid_empresaTipoAsistenciaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoAsistenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAsistenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAsistenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAsistenciaBusqueda.setText("U");
		this.jButtonid_empresaTipoAsistenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoAsistenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAsistenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAsistenciaBusqueda"));

		if(this.tipoasistenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoAsistenciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoAsistenciaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoAsistenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAsistenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoAsistenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoAsistenciaUpdate.setText("U");
		this.jButtonid_empresaTipoAsistenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoAsistenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoAsistenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoAsistencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoAsistencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoAsistenciaUpdate"));



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
		//this.jInternalFrameDetalleTipoAsistencia = new TipoAsistenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Asistencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAsistencia= new GridBagLayout();
		

		
		String sToolTipTipoAsistencia="";
		sToolTipTipoAsistencia=TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAsistencia+="(Nomina.TipoAsistencia)";
		}
		
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAsistencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoAsistencia = new JButtonMe();
		this.jButtonModificarTipoAsistencia = new JButtonMe();
        this.jButtonActualizarTipoAsistencia = new JButtonMe();
        this.jButtonEliminarTipoAsistencia = new JButtonMe();
        this.jButtonCancelarTipoAsistencia = new JButtonMe();
        this.jButtonGuardarCambiosTipoAsistencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoAsistencia = new JButtonMe();
		this.jButtonCerrarTipoAsistencia = new JButtonMe();
		
		this.jScrollPanelDatosTipoAsistencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoAsistencia = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoAsistencia = new JScrollPane();
				
		
		
		this.jPanelCamposTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Asistencia";
		
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Asistencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAsistencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoAsistencia.setName("jPanelCamposTipoAsistencia"); 

		this.jPanelCamposOcultosTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoAsistencia.setName("jPanelCamposOcultosTipoAsistencia"); 

        this.jPanelAccionesTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAsistencia.setToolTipText("Acciones");
        this.jPanelAccionesTipoAsistencia.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoAsistencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoAsistencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoAsistencia.setText("Nuevo");
		this.jButtonModificarTipoAsistencia.setText("Editar");
        this.jButtonActualizarTipoAsistencia.setText("Actualizar");
        this.jButtonEliminarTipoAsistencia.setText("Eliminar");
        this.jButtonCancelarTipoAsistencia.setText("Cancelar");
        this.jButtonGuardarCambiosTipoAsistencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoAsistencia.setText("Guardar");
		this.jButtonCerrarTipoAsistencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAsistencia,"nuevo_button","Nuevo",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoAsistencia,"modificar_button","Editar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoAsistencia,"actualizar_button","Actualizar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoAsistencia,"eliminar_button","Eliminar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoAsistencia,"cancelar_button","Cancelar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoAsistencia,"guardarcambios_button","Guardar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAsistencia,"guardarcambiostabla_button","Guardar",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAsistencia,"cerrar_button","Salir",this.tipoasistenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoAsistencia.setToolTipText("Nuevo"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoAsistencia.setToolTipText("Editar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoAsistencia.setToolTipText("Actualizar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoAsistencia.setToolTipText("Eliminar)"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoAsistencia.setToolTipText("Cancelar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoAsistencia.setToolTipText("Guardar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoAsistencia.setToolTipText("Guardar"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAsistencia.setToolTipText("Salir"+" "+TipoAsistenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAsistencia";
		inputMap = this.jButtonNuevoTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAsistencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAsistencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoAsistencia";
		inputMap = this.jButtonActualizarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoAsistencia"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoAsistencia";
		inputMap = this.jButtonEliminarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoAsistencia"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoAsistencia";
		inputMap = this.jButtonCancelarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoAsistencia"));
		
		//CERRAR		
		sMapKey = "CerrarTipoAsistencia";
		inputMap = this.jButtonCerrarTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAsistencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAsistencia";
		inputMap = this.jButtonGuardarCambiosTablaTipoAsistencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAsistencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAsistencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoAsistencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoAsistencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoAsistencia.setToolTipText("Nuevo TipoAsistencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoAsistencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoAsistencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoAsistencia.setToolTipText("Sin Cerrar Ventana TipoAsistencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoAsistencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoAsistencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoAsistencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAsistencia.setText("Accion");
		this.jComboBoxTiposAccionesTipoAsistencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoAsistencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoAsistencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoAsistencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoAsistencia = new JLabelMe();
		
		this.jLabelAccionesTipoAsistencia.setText("Acciones");		
		this.jLabelAccionesTipoAsistencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAsistencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAsistencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoAsistencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoAsistencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoAsistencia=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoAsistencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoAsistencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAsistencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAsistencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAsistencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoAsistencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAsistencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAsistencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoAsistencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoAsistencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoAsistencia = new GridBagLayout();
		
		this.jPanelCamposTipoAsistencia.setLayout(gridaBagLayoutCamposTipoAsistencia);
		this.jPanelCamposOcultosTipoAsistencia.setLayout(gridaBagLayoutCamposOcultosTipoAsistencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAsistencia.gridy = 0;
	this.gridBagConstraintsTipoAsistencia.gridx = 0;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoAsistencia.add(jLabelIdTipoAsistencia, this.gridBagConstraintsTipoAsistencia);



	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAsistencia.gridy = 0;
	this.gridBagConstraintsTipoAsistencia.gridx = 1;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoAsistencia.add(jLabelidTipoAsistencia, this.gridBagConstraintsTipoAsistencia);


	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAsistencia.gridy = 0;
	this.gridBagConstraintsTipoAsistencia.gridx = 0;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoAsistencia.add(jLabelid_empresaTipoAsistencia, this.gridBagConstraintsTipoAsistencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = 0;
		this.gridBagConstraintsTipoAsistencia.gridx = 2;
		this.gridBagConstraintsTipoAsistencia.ipadx = 0;
		this.gridBagConstraintsTipoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAsistencia.add(jButtonid_empresaTipoAsistenciaBusqueda, this.gridBagConstraintsTipoAsistencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = 0;
		this.gridBagConstraintsTipoAsistencia.gridx = 3;
		this.gridBagConstraintsTipoAsistencia.ipadx = 0;
		this.gridBagConstraintsTipoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoAsistencia.add(jButtonid_empresaTipoAsistenciaUpdate, this.gridBagConstraintsTipoAsistencia);
	}

	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAsistencia.gridy = 0;
	this.gridBagConstraintsTipoAsistencia.gridx = 1;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoAsistencia.add(jComboBoxid_empresaTipoAsistencia, this.gridBagConstraintsTipoAsistencia);


	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAsistencia.gridy = 0;
	this.gridBagConstraintsTipoAsistencia.gridx = 0;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoAsistencia.add(jLabelnombreTipoAsistencia, this.gridBagConstraintsTipoAsistencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAsistencia.gridy = 0;
		this.gridBagConstraintsTipoAsistencia.gridx = 2;
		this.gridBagConstraintsTipoAsistencia.ipadx = 0;
		this.gridBagConstraintsTipoAsistencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoAsistencia.add(jButtonnombreTipoAsistenciaBusqueda, this.gridBagConstraintsTipoAsistencia);
	}

	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAsistencia.gridy = 0;
	this.gridBagConstraintsTipoAsistencia.gridx = 1;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoAsistencia.add(jTextFieldnombreTipoAsistencia, this.gridBagConstraintsTipoAsistencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAsistencia.gridy = iYPanelCamposTipoAsistencia;
	this.gridBagConstraintsTipoAsistencia.gridx = iXPanelCamposTipoAsistencia++;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAsistencia.add(this.jPanelidTipoAsistencia, this.gridBagConstraintsTipoAsistencia);



	if(iXPanelCamposTipoAsistencia % 1==0) {
		iXPanelCamposTipoAsistencia=0;
		iYPanelCamposTipoAsistencia++;
	}
	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAsistencia.gridy = iYPanelCamposTipoAsistencia;
	this.gridBagConstraintsTipoAsistencia.gridx = iXPanelCamposTipoAsistencia++;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAsistencia.add(this.jPanelnombreTipoAsistencia, this.gridBagConstraintsTipoAsistencia);



	if(iXPanelCamposTipoAsistencia % 1==0) {
		iXPanelCamposTipoAsistencia=0;
		iYPanelCamposTipoAsistencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAsistencia.gridy = iYPanelCamposOcultosTipoAsistencia;
	this.gridBagConstraintsTipoAsistencia.gridx = iXPanelCamposOcultosTipoAsistencia++;
	this.gridBagConstraintsTipoAsistencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAsistencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoAsistencia.add(this.jPanelid_empresaTipoAsistencia, this.gridBagConstraintsTipoAsistencia);



	if(iXPanelCamposOcultosTipoAsistencia % 1==0) {
		iXPanelCamposOcultosTipoAsistencia=0;
		iYPanelCamposOcultosTipoAsistencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoAsistencia= new GridBagLayout();
		this.jPanelAccionesTipoAsistencia.setLayout(gridaBagLayoutAccionesTipoAsistencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoAsistencia= new GridBagLayout();
		this.jPanelAccionesFormularioTipoAsistencia.setLayout(gridaBagLayoutAccionesFormularioTipoAsistencia);
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAsistencia.add(this.jComboBoxTiposAccionesFormularioTipoAsistencia, this.gridBagConstraintsTipoAsistencia);

		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAsistencia.add(this.jCheckBoxPostAccionNuevoTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAsistencia.add(this.jCheckBoxPostAccionSinCerrarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoasistenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoasistenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAsistencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAsistencia.add(this.jCheckBoxPostAccionSinMensajeTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = 0;
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoAsistencia.add(this.jButtonModificarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);							

		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAsistencia.gridy = 0;
		this.gridBagConstraintsTipoAsistencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoAsistencia.add(this.jButtonEliminarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
			
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = 0;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAsistencia.add(this.jButtonActualizarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);


		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = 0;		
		this.gridBagConstraintsTipoAsistencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAsistencia.add(this.jButtonGuardarCambiosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);	
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = 0;		
		this.gridBagConstraintsTipoAsistencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoAsistencia.add(this.jButtonCancelarTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAsistencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAsistencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoasistenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();						
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAsistencia.gridx = 0;		
			//this.gridBagConstraintsTipoAsistencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAsistencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAsistencia.gridx =0;
		this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAsistencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoAsistenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoAsistencia = new TipoAsistenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Asistencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Asistencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Asistencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoAsistenciaModel tipoasistenciaModel=new TipoAsistenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoAsistenciaModel.TipoAsistenciaFocusTraversalPolicy tipoasistenciaFocusTraversalPolicy = tipoasistenciaModel.new TipoAsistenciaFocusTraversalPolicy(this);
			
			//tipoasistenciaFocusTraversalPolicy.settipoasistenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoasistenciaModel);
			
			
			this.jContentPaneDetalleTipoAsistencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoAsistencia = new GridBagLayout();	
			this.jContentPaneDetalleTipoAsistencia.setLayout(gridaBagLayoutDetalleTipoAsistencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAsistencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
				this.gridBagConstraintsTipoAsistencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoAsistencia.gridx = 0;
					
				
				this.jContentPaneDetalleTipoAsistencia.add(jTtoolBarDetalleTipoAsistencia, gridBagConstraintsTipoAsistencia);								
				
}
			
			this.jScrollPanelDatosEdicionTipoAsistencia=   new JScrollPane(jContentPaneDetalleTipoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoAsistencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoAsistencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoAsistencia.gridx = 0;
	        
			this.jContentPaneDetalleTipoAsistencia.add(jPanelCamposTipoAsistencia, gridBagConstraintsTipoAsistencia);
			
			
			
			
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
						&& tipoasistenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoasistenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoAsistencia= new GridBagConstraints();
						this.gridBagConstraintsTipoAsistencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoAsistencia.gridx = 0;
						this.jContentPaneDetalleTipoAsistencia.add(this.jTabbedPaneRelacionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoAsistencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoAsistencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
					this.gridBagConstraintsTipoAsistencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoAsistencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoAsistencia.gridx = 0;
					
				
					this.jContentPaneDetalleTipoAsistencia.add(jPanelCamposOcultosTipoAsistencia, gridBagConstraintsTipoAsistencia);
				
					this.jPanelCamposOcultosTipoAsistencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoAsistencia.gridx = 0;
	        this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoAsistencia.add(this.jPanelAccionesFormularioTipoAsistencia, this.gridBagConstraintsTipoAsistencia);							
			
			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
	        this.gridBagConstraintsTipoAsistencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoAsistencia.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoAsistencia.add(this.jPanelAccionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoAsistencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoAsistencia=   new JScrollPane(this.jPanelCamposTipoAsistencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAsistencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAsistencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAsistencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoAsistencia.gridx = 0;
			this.gridBagConstraintsTipoAsistencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoAsistencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoAsistencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAsistencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoAsistencia, this.gridBagConstraintsTipoAsistencia);			
			
			this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
			this.gridBagConstraintsTipoAsistencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAsistencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
			
			
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		
			
		this.gridBagConstraintsTipoAsistencia = new GridBagConstraints();
		this.gridBagConstraintsTipoAsistencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAsistencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAsistencia, this.gridBagConstraintsTipoAsistencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoAsistencia;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoAsistencia;
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
