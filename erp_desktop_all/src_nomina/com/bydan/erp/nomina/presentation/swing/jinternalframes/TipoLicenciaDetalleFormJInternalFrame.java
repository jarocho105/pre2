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
import com.bydan.erp.nomina.util.TipoLicenciaConstantesFunciones;

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
public class TipoLicenciaDetalleFormJInternalFrame extends TipoLicenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoLicencia;
	
	protected JMenuBar jmenuBarDetalleTipoLicencia;
	
	protected JMenu jmenuDetalleTipoLicencia;
	protected JMenu jmenuDetalleArchivoTipoLicencia;
	protected JMenu jmenuDetalleAccionesTipoLicencia;
	protected JMenu jmenuDetalleDatosTipoLicencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoLicencia;	
	protected GridBagConstraints gridBagConstraintsTipoLicencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoLicenciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoLicencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoLicenciaSessionBean tipolicenciaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoLicenciaLogic tipolicenciaLogic;
	
	public JScrollPane jScrollPanelDatosTipoLicencia;
	public JScrollPane jScrollPanelDatosEdicionTipoLicencia;
	public JScrollPane jScrollPanelDatosGeneralTipoLicencia;
	
	protected JPanel jPanelCamposTipoLicencia;    
	protected JPanel jPanelCamposOcultosTipoLicencia;    	
	protected JPanel jPanelAccionesTipoLicencia;
	protected JPanel jPanelAccionesFormularioTipoLicencia;
    
	
	
	protected Integer iXPanelCamposTipoLicencia=0;
	protected Integer iYPanelCamposTipoLicencia=0;
	
	protected Integer iXPanelCamposOcultosTipoLicencia=0;
	protected Integer iYPanelCamposOcultosTipoLicencia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoLicencia;
	public JButton jButtonModificarTipoLicencia;
	public JButton jButtonActualizarTipoLicencia;
    public JButton jButtonEliminarTipoLicencia;
	public JButton jButtonCancelarTipoLicencia;
    public JButton jButtonGuardarCambiosTipoLicencia;
	public JButton jButtonGuardarCambiosTablaTipoLicencia;
	protected JButton jButtonCerrarTipoLicencia;
	
	
	protected JButton jButtonProcesarInformacionTipoLicencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoLicencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoLicencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoLicencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoLicencia;
	protected JButton jButtonModificarToolBarTipoLicencia;
	protected JButton jButtonActualizarToolBarTipoLicencia;
    protected JButton jButtonEliminarToolBarTipoLicencia;
	protected JButton jButtonCancelarToolBarTipoLicencia;
    protected JButton jButtonGuardarCambiosToolBarTipoLicencia;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoLicencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoLicencia;
	protected JButton jButtonCerrarToolBarTipoLicencia;
	
	protected JButton jButtonProcesarInformacionToolBarTipoLicencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoLicencia;
	protected JMenuItem jMenuItemModificarTipoLicencia;
	protected JMenuItem jMenuItemActualizarTipoLicencia;
    protected JMenuItem jMenuItemEliminarTipoLicencia;
	protected JMenuItem jMenuItemCancelarTipoLicencia;
    protected JMenuItem jMenuItemGuardarCambiosTipoLicencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoLicencia;
	protected JMenuItem jMenuItemCerrarTipoLicencia;
	protected JMenuItem jMenuItemDetalleCerrarTipoLicencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoLicencia;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoLicencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoLicencia;
	protected JMenuItem jMenuItemMostrarOcultarTipoLicencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoLicencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoLicencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoLicencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoLicencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoLicencia;
	public JLabel jLabelIdTipoLicencia;
	public JLabel jLabelidTipoLicencia;
	public JButton jButtonidTipoLicenciaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoLicencia;
	public JLabel jLabelcodigoTipoLicencia;
	public JTextField jTextFieldcodigoTipoLicencia;
	public JButton jButtoncodigoTipoLicenciaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoLicencia;
	public JLabel jLabelnombreTipoLicencia;
	public JTextArea jTextAreanombreTipoLicencia;
	public JScrollPane jscrollPanenombreTipoLicencia;
	public JButton jButtonnombreTipoLicenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoLicencia;
	public JLabel jLabelid_empresaTipoLicencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoLicencia;
	public JButton jButtonid_empresaTipoLicencia= new JButtonMe();
	public JButton jButtonid_empresaTipoLicenciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoLicenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoLicencia;
	
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
	
	public TipoLicenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoLicencia=new JPanel();
				this.jPanelAccionesFormularioTipoLicencia=new JPanel();
				this.jmenuBarDetalleTipoLicencia=new JMenuBar();
				this.jTtoolBarDetalleTipoLicencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLicenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoLicenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLicenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLicenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoLicenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoLicencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoLicencia() {
		return this.jButtonActualizarToolBarTipoLicencia;
	}
	
	public JButton getjButtonEliminarToolBarTipoLicencia() {
		return this.jButtonEliminarToolBarTipoLicencia;
	}
	
	public JButton getjButtonCancelarToolBarTipoLicencia() {
		return this.jButtonCancelarToolBarTipoLicencia;
	}		
	
	public JButton getjButtonProcesarInformacionTipoLicencia() {
		return this.jButtonProcesarInformacionTipoLicencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoLicencia)	{
		this.jButtonProcesarInformacionTipoLicencia = jButtonProcesarInformacionTipoLicencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoLicencia() {
		return this.jComboBoxTiposAccionesTipoLicencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoLicencia(
			JComboBox jComboBoxTiposRelacionesTipoLicencia) {
		this.jComboBoxTiposRelacionesTipoLicencia = jComboBoxTiposRelacionesTipoLicencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoLicencia(
			JComboBox jComboBoxTiposAccionesTipoLicencia) {
		this.jComboBoxTiposAccionesTipoLicencia = jComboBoxTiposAccionesTipoLicencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoLicencia() {
		return this.jComboBoxTiposAccionesFormularioTipoLicencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoLicencia(
			JComboBox jComboBoxTiposAccionesFormularioTipoLicencia) {
		this.jComboBoxTiposAccionesFormularioTipoLicencia = jComboBoxTiposAccionesFormularioTipoLicencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipolicenciaSessionBean=new TipoLicenciaSessionBean();
		
		this.tipolicenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolicenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipolicenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoLicenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoLicenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoLicenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Licencia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoLicenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoLicencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoLicencia=new JButtonMe();
				this.jButtonModificarToolBarTipoLicencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoLicencia,this.jTtoolBarDetalleTipoLicencia,
							"actualizar","actualizar","Actualizar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoLicencia,this.jTtoolBarDetalleTipoLicencia,
							"eliminar","eliminar","Eliminar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoLicencia,this.jTtoolBarDetalleTipoLicencia,
							"cancelar","cancelar","Cancelar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoLicencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoLicencia,this.jTtoolBarDetalleTipoLicencia,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoLicencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoLicencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoLicencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoLicencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoLicencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoLicencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoLicencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoLicencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoLicencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoLicencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoLicencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoLicencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoLicencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoLicencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoLicencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoLicencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoLicencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoLicencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoLicencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoLicencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoLicencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoLicencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoLicencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoLicencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoLicencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoLicencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoLicencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoLicencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoLicencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoLicencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoLicencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoLicencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoLicencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoLicencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoLicencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoLicencia.add(this.jMenuItemDetalleCerrarTipoLicencia);
		
		this.jmenuDetalleAccionesTipoLicencia.add(this.jMenuItemActualizarTipoLicencia);
		this.jmenuDetalleAccionesTipoLicencia.add(this.jMenuItemEliminarTipoLicencia);
		this.jmenuDetalleAccionesTipoLicencia.add(this.jMenuItemCancelarTipoLicencia);		
		
		//this.jmenuDetalleDatosTipoLicencia.add(this.jMenuItemDetalleAbrirOrderByTipoLicencia);				
		this.jmenuDetalleDatosTipoLicencia.add(this.jMenuItemDetalleMostarOcultarTipoLicencia);				
				
		//this.jmenuDetalleAccionesTipoLicencia.add(this.jMenuItemGuardarCambiosTipoLicencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoLicencia.add(this.jmenuDetalleArchivoTipoLicencia);		
		this.jmenuBarDetalleTipoLicencia.add(this.jmenuDetalleAccionesTipoLicencia);		
		this.jmenuBarDetalleTipoLicencia.add(this.jmenuDetalleDatosTipoLicencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoLicencia);				
	}
	
	
	public void inicializarElementosCamposTipoLicencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoLicencia = new JLabelMe();
		jLabelIdTipoLicencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoLicencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoLicencia.setToolTipText(TipoLicenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoLicencia= new GridBagLayout();

		this.jPanelidTipoLicencia.setLayout(this.gridaBagLayoutTipoLicencia);

		jLabelidTipoLicencia = new JLabel();
		jLabelidTipoLicencia.setText("Id");

		jLabelidTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoLicencia = new JLabelMe();
		this.jLabelcodigoTipoLicencia.setText(""+TipoLicenciaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoLicencia.setToolTipText("Codigo");
		this.jLabelcodigoTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoLicencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoLicencia.setToolTipText(TipoLicenciaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoLicencia = new GridBagLayout();
		this.jPanelcodigoTipoLicencia.setLayout(this.gridaBagLayoutTipoLicencia);


		jTextFieldcodigoTipoLicencia= new JTextFieldMe();

		jTextFieldcodigoTipoLicencia.setEnabled(false);
		jTextFieldcodigoTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoLicenciaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoLicenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoLicenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoLicenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoLicenciaBusqueda.setText("U");
		this.jButtoncodigoTipoLicenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoLicenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoLicenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoLicenciaBusqueda"));

		if(this.tipolicenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoLicenciaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoLicencia = new JLabelMe();
		this.jLabelnombreTipoLicencia.setText(""+TipoLicenciaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoLicencia.setToolTipText("Nombre");
		this.jLabelnombreTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoLicencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoLicencia.setToolTipText(TipoLicenciaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoLicencia = new GridBagLayout();
		this.jPanelnombreTipoLicencia.setLayout(this.gridaBagLayoutTipoLicencia);


		jTextAreanombreTipoLicencia= new JTextAreaMe();
		jTextAreanombreTipoLicencia.setEnabled(false);
		jTextAreanombreTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoLicencia.setLineWrap(true);
		jTextAreanombreTipoLicencia.setWrapStyleWord(true);
		jTextAreanombreTipoLicencia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoLicencia.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoLicencia = new JScrollPane(jTextAreanombreTipoLicencia);
		jscrollPanenombreTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoLicenciaBusqueda= new JButtonMe();
		this.jButtonnombreTipoLicenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLicenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoLicenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoLicenciaBusqueda.setText("U");
		this.jButtonnombreTipoLicenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoLicenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoLicenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoLicenciaBusqueda"));

		if(this.tipolicenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoLicenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoLicencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoLicencia = new JLabelMe();
		this.jLabelid_empresaTipoLicencia.setText(""+TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoLicencia.setToolTipText("Empresa");
		this.jLabelid_empresaTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoLicencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoLicencia.setToolTipText(TipoLicenciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoLicencia = new GridBagLayout();
		this.jPanelid_empresaTipoLicencia.setLayout(this.gridaBagLayoutTipoLicencia);


		jComboBoxid_empresaTipoLicencia= new JComboBoxMe();
		jComboBoxid_empresaTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoLicencia.setEnabled(false);

		this.jButtonid_empresaTipoLicencia= new JButtonMe();
		this.jButtonid_empresaTipoLicencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLicencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLicencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoLicencia.setText("Buscar");
		this.jButtonid_empresaTipoLicencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoLicencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLicencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLicencia"));

		this.jButtonid_empresaTipoLicenciaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoLicenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLicenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLicenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoLicenciaBusqueda.setText("U");
		this.jButtonid_empresaTipoLicenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoLicenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLicenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLicenciaBusqueda"));

		if(this.tipolicenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoLicenciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoLicenciaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoLicenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLicenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoLicenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoLicenciaUpdate.setText("U");
		this.jButtonid_empresaTipoLicenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoLicenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoLicenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoLicencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoLicencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoLicenciaUpdate"));



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
		//this.jInternalFrameDetalleTipoLicencia = new TipoLicenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Licencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoLicencia= new GridBagLayout();
		

		
		String sToolTipTipoLicencia="";
		sToolTipTipoLicencia=TipoLicenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoLicencia+="(Nomina.TipoLicencia)";
		}
		
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoLicencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoLicencia = new JButtonMe();
		this.jButtonModificarTipoLicencia = new JButtonMe();
        this.jButtonActualizarTipoLicencia = new JButtonMe();
        this.jButtonEliminarTipoLicencia = new JButtonMe();
        this.jButtonCancelarTipoLicencia = new JButtonMe();
        this.jButtonGuardarCambiosTipoLicencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoLicencia = new JButtonMe();
		this.jButtonCerrarTipoLicencia = new JButtonMe();
		
		this.jScrollPanelDatosTipoLicencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoLicencia = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoLicencia = new JScrollPane();
				
		
		
		this.jPanelCamposTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Licencia";
		
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Licencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoLicencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoLicencia.setName("jPanelCamposTipoLicencia"); 

		this.jPanelCamposOcultosTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoLicencia.setName("jPanelCamposOcultosTipoLicencia"); 

        this.jPanelAccionesTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoLicencia.setToolTipText("Acciones");
        this.jPanelAccionesTipoLicencia.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoLicencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoLicencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoLicencia.setText("Nuevo");
		this.jButtonModificarTipoLicencia.setText("Editar");
        this.jButtonActualizarTipoLicencia.setText("Actualizar");
        this.jButtonEliminarTipoLicencia.setText("Eliminar");
        this.jButtonCancelarTipoLicencia.setText("Cancelar");
        this.jButtonGuardarCambiosTipoLicencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoLicencia.setText("Guardar");
		this.jButtonCerrarTipoLicencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoLicencia,"nuevo_button","Nuevo",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoLicencia,"modificar_button","Editar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoLicencia,"actualizar_button","Actualizar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoLicencia,"eliminar_button","Eliminar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoLicencia,"cancelar_button","Cancelar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoLicencia,"guardarcambios_button","Guardar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoLicencia,"guardarcambiostabla_button","Guardar",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoLicencia,"cerrar_button","Salir",this.tipolicenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoLicencia.setToolTipText("Nuevo"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoLicencia.setToolTipText("Editar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoLicencia.setToolTipText("Actualizar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoLicencia.setToolTipText("Eliminar)"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoLicencia.setToolTipText("Cancelar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoLicencia.setToolTipText("Guardar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoLicencia.setToolTipText("Guardar"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoLicencia.setToolTipText("Salir"+" "+TipoLicenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoLicencia";
		inputMap = this.jButtonNuevoTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoLicencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoLicencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoLicencia";
		inputMap = this.jButtonActualizarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoLicencia"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoLicencia";
		inputMap = this.jButtonEliminarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoLicencia"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoLicencia";
		inputMap = this.jButtonCancelarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoLicencia"));
		
		//CERRAR		
		sMapKey = "CerrarTipoLicencia";
		inputMap = this.jButtonCerrarTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoLicencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoLicencia";
		inputMap = this.jButtonGuardarCambiosTablaTipoLicencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoLicencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoLicencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoLicencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoLicencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoLicencia.setToolTipText("Nuevo TipoLicencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoLicencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoLicencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoLicencia.setToolTipText("Sin Cerrar Ventana TipoLicencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoLicencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoLicencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoLicencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoLicencia.setText("Accion");
		this.jComboBoxTiposAccionesTipoLicencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoLicencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoLicencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoLicencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoLicencia = new JLabelMe();
		
		this.jLabelAccionesTipoLicencia.setText("Acciones");		
		this.jLabelAccionesTipoLicencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLicencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoLicencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoLicencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoLicencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoLicencia=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoLicencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoLicencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoLicencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLicencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoLicencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoLicencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoLicencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLicencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoLicencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoLicencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoLicencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoLicencia = new GridBagLayout();
		
		this.jPanelCamposTipoLicencia.setLayout(gridaBagLayoutCamposTipoLicencia);
		this.jPanelCamposOcultosTipoLicencia.setLayout(gridaBagLayoutCamposOcultosTipoLicencia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 0;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoLicencia.add(jLabelIdTipoLicencia, this.gridBagConstraintsTipoLicencia);



	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 1;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoLicencia.add(jLabelidTipoLicencia, this.gridBagConstraintsTipoLicencia);


	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 0;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoLicencia.add(jLabelid_empresaTipoLicencia, this.gridBagConstraintsTipoLicencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = 0;
		this.gridBagConstraintsTipoLicencia.gridx = 2;
		this.gridBagConstraintsTipoLicencia.ipadx = 0;
		this.gridBagConstraintsTipoLicencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoLicencia.add(jButtonid_empresaTipoLicenciaBusqueda, this.gridBagConstraintsTipoLicencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = 0;
		this.gridBagConstraintsTipoLicencia.gridx = 3;
		this.gridBagConstraintsTipoLicencia.ipadx = 0;
		this.gridBagConstraintsTipoLicencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoLicencia.add(jButtonid_empresaTipoLicenciaUpdate, this.gridBagConstraintsTipoLicencia);
	}

	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 1;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoLicencia.add(jComboBoxid_empresaTipoLicencia, this.gridBagConstraintsTipoLicencia);


	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 0;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoLicencia.add(jLabelcodigoTipoLicencia, this.gridBagConstraintsTipoLicencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = 0;
		this.gridBagConstraintsTipoLicencia.gridx = 2;
		this.gridBagConstraintsTipoLicencia.ipadx = 0;
		this.gridBagConstraintsTipoLicencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoLicencia.add(jButtoncodigoTipoLicenciaBusqueda, this.gridBagConstraintsTipoLicencia);
	}

	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 1;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoLicencia.add(jTextFieldcodigoTipoLicencia, this.gridBagConstraintsTipoLicencia);


	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 0;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoLicencia.add(jLabelnombreTipoLicencia, this.gridBagConstraintsTipoLicencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		//this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoLicencia.gridy = 0;
		this.gridBagConstraintsTipoLicencia.gridx = 2;
		this.gridBagConstraintsTipoLicencia.ipadx = 0;
		this.gridBagConstraintsTipoLicencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoLicencia.add(jButtonnombreTipoLicenciaBusqueda, this.gridBagConstraintsTipoLicencia);
	}

	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoLicencia.gridy = 0;
	this.gridBagConstraintsTipoLicencia.gridx = 1;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoLicencia.add(jscrollPanenombreTipoLicencia, this.gridBagConstraintsTipoLicencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLicencia.gridy = iYPanelCamposTipoLicencia;
	this.gridBagConstraintsTipoLicencia.gridx = iXPanelCamposTipoLicencia++;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLicencia.add(this.jPanelidTipoLicencia, this.gridBagConstraintsTipoLicencia);



	if(iXPanelCamposTipoLicencia % 1==0) {
		iXPanelCamposTipoLicencia=0;
		iYPanelCamposTipoLicencia++;
	}
	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLicencia.gridy = iYPanelCamposTipoLicencia;
	this.gridBagConstraintsTipoLicencia.gridx = iXPanelCamposTipoLicencia++;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLicencia.add(this.jPanelcodigoTipoLicencia, this.gridBagConstraintsTipoLicencia);



	if(iXPanelCamposTipoLicencia % 1==0) {
		iXPanelCamposTipoLicencia=0;
		iYPanelCamposTipoLicencia++;
	}
	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLicencia.gridy = iYPanelCamposTipoLicencia;
	this.gridBagConstraintsTipoLicencia.gridx = iXPanelCamposTipoLicencia++;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoLicencia.add(this.jPanelnombreTipoLicencia, this.gridBagConstraintsTipoLicencia);



	if(iXPanelCamposTipoLicencia % 1==0) {
		iXPanelCamposTipoLicencia=0;
		iYPanelCamposTipoLicencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoLicencia.gridy = iYPanelCamposOcultosTipoLicencia;
	this.gridBagConstraintsTipoLicencia.gridx = iXPanelCamposOcultosTipoLicencia++;
	this.gridBagConstraintsTipoLicencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoLicencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoLicencia.add(this.jPanelid_empresaTipoLicencia, this.gridBagConstraintsTipoLicencia);



	if(iXPanelCamposOcultosTipoLicencia % 1==0) {
		iXPanelCamposOcultosTipoLicencia=0;
		iYPanelCamposOcultosTipoLicencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoLicencia= new GridBagLayout();
		this.jPanelAccionesTipoLicencia.setLayout(gridaBagLayoutAccionesTipoLicencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoLicencia= new GridBagLayout();
		this.jPanelAccionesFormularioTipoLicencia.setLayout(gridaBagLayoutAccionesFormularioTipoLicencia);
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLicencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLicencia.add(this.jComboBoxTiposAccionesFormularioTipoLicencia, this.gridBagConstraintsTipoLicencia);

		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoLicencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoLicencia.add(this.jCheckBoxPostAccionNuevoTipoLicencia, this.gridBagConstraintsTipoLicencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLicencia.add(this.jCheckBoxPostAccionSinCerrarTipoLicencia, this.gridBagConstraintsTipoLicencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipolicenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipolicenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoLicencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoLicencia.add(this.jCheckBoxPostAccionSinMensajeTipoLicencia, this.gridBagConstraintsTipoLicencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = 0;
		this.gridBagConstraintsTipoLicencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoLicencia.add(this.jButtonModificarTipoLicencia, this.gridBagConstraintsTipoLicencia);							

		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoLicencia.gridy = 0;
		this.gridBagConstraintsTipoLicencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoLicencia.add(this.jButtonEliminarTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
			
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = 0;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLicencia.add(this.jButtonActualizarTipoLicencia, this.gridBagConstraintsTipoLicencia);


		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = 0;		
		this.gridBagConstraintsTipoLicencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoLicencia.add(this.jButtonGuardarCambiosTipoLicencia, this.gridBagConstraintsTipoLicencia);	
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = 0;		
		this.gridBagConstraintsTipoLicencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoLicencia.add(this.jButtonCancelarTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoLicencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoLicencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipolicenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();						
			this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoLicencia.gridx = 0;		
			//this.gridBagConstraintsTipoLicencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoLicencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoLicencia.gridx =0;
		this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoLicencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoLicencia, this.gridBagConstraintsTipoLicencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoLicenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoLicencia = new TipoLicenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Licencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Licencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Licencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoLicenciaModel tipolicenciaModel=new TipoLicenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoLicenciaModel.TipoLicenciaFocusTraversalPolicy tipolicenciaFocusTraversalPolicy = tipolicenciaModel.new TipoLicenciaFocusTraversalPolicy(this);
			
			//tipolicenciaFocusTraversalPolicy.settipolicenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipolicenciaModel);
			
			
			this.jContentPaneDetalleTipoLicencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoLicencia = new GridBagLayout();	
			this.jContentPaneDetalleTipoLicencia.setLayout(gridaBagLayoutDetalleTipoLicencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoLicencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
				this.gridBagConstraintsTipoLicencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoLicencia.gridx = 0;
					
				
				this.jContentPaneDetalleTipoLicencia.add(jTtoolBarDetalleTipoLicencia, gridBagConstraintsTipoLicencia);								
				
}
			
			this.jScrollPanelDatosEdicionTipoLicencia=   new JScrollPane(jContentPaneDetalleTipoLicencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLicencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLicencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLicencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoLicencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoLicencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLicencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoLicencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoLicencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoLicencia.gridx = 0;
	        
			this.jContentPaneDetalleTipoLicencia.add(jPanelCamposTipoLicencia, gridBagConstraintsTipoLicencia);
			
			
			
			
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
						&& tipolicenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipolicenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoLicencia= new GridBagConstraints();
						this.gridBagConstraintsTipoLicencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoLicencia.gridx = 0;
						this.jContentPaneDetalleTipoLicencia.add(this.jTabbedPaneRelacionesTipoLicencia, this.gridBagConstraintsTipoLicencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoLicencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoLicencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
					this.gridBagConstraintsTipoLicencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoLicencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoLicencia.gridx = 0;
					
				
					this.jContentPaneDetalleTipoLicencia.add(jPanelCamposOcultosTipoLicencia, gridBagConstraintsTipoLicencia);
				
					this.jPanelCamposOcultosTipoLicencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoLicencia.gridx = 0;
	        this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoLicencia.add(this.jPanelAccionesFormularioTipoLicencia, this.gridBagConstraintsTipoLicencia);							
			
			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
	        this.gridBagConstraintsTipoLicencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoLicencia.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoLicencia.add(this.jPanelAccionesTipoLicencia, this.gridBagConstraintsTipoLicencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoLicencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoLicencia=   new JScrollPane(this.jPanelCamposTipoLicencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoLicencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLicencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoLicencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoLicencia.gridx = 0;
			this.gridBagConstraintsTipoLicencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoLicencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoLicencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoLicencia, this.gridBagConstraintsTipoLicencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLicencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoLicencia, this.gridBagConstraintsTipoLicencia);			
			
			this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
			this.gridBagConstraintsTipoLicencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoLicencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoLicencia, this.gridBagConstraintsTipoLicencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoLicencia, this.gridBagConstraintsTipoLicencia);
			
			
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoLicencia, this.gridBagConstraintsTipoLicencia);
		
			
		this.gridBagConstraintsTipoLicencia = new GridBagConstraints();
		this.gridBagConstraintsTipoLicencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoLicencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoLicencia, this.gridBagConstraintsTipoLicencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoLicencia;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoLicencia;
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
