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
import com.bydan.erp.nomina.util.TipoInstitucionConstantesFunciones;

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
public class TipoInstitucionDetalleFormJInternalFrame extends TipoInstitucionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoInstitucion;
	
	protected JMenuBar jmenuBarDetalleTipoInstitucion;
	
	protected JMenu jmenuDetalleTipoInstitucion;
	protected JMenu jmenuDetalleArchivoTipoInstitucion;
	protected JMenu jmenuDetalleAccionesTipoInstitucion;
	protected JMenu jmenuDetalleDatosTipoInstitucion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInstitucion;	
	protected GridBagConstraints gridBagConstraintsTipoInstitucion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoInstitucionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoInstitucion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoInstitucionSessionBean tipoinstitucionSessionBean;
	
	

	public CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame=null;
	public CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCurso=false;
	public CursoSessionBean cursoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoInstitucionLogic tipoinstitucionLogic;
	
	public JScrollPane jScrollPanelDatosTipoInstitucion;
	public JScrollPane jScrollPanelDatosEdicionTipoInstitucion;
	public JScrollPane jScrollPanelDatosGeneralTipoInstitucion;
	
	protected JPanel jPanelCamposTipoInstitucion;    
	protected JPanel jPanelCamposOcultosTipoInstitucion;    	
	protected JPanel jPanelAccionesTipoInstitucion;
	protected JPanel jPanelAccionesFormularioTipoInstitucion;
    
	
	
	protected Integer iXPanelCamposTipoInstitucion=0;
	protected Integer iYPanelCamposTipoInstitucion=0;
	
	protected Integer iXPanelCamposOcultosTipoInstitucion=0;
	protected Integer iYPanelCamposOcultosTipoInstitucion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoInstitucion;
	public JButton jButtonModificarTipoInstitucion;
	public JButton jButtonActualizarTipoInstitucion;
    public JButton jButtonEliminarTipoInstitucion;
	public JButton jButtonCancelarTipoInstitucion;
    public JButton jButtonGuardarCambiosTipoInstitucion;
	public JButton jButtonGuardarCambiosTablaTipoInstitucion;
	protected JButton jButtonCerrarTipoInstitucion;
	
	
	protected JButton jButtonProcesarInformacionTipoInstitucion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoInstitucion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoInstitucion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoInstitucion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInstitucion;
	protected JButton jButtonModificarToolBarTipoInstitucion;
	protected JButton jButtonActualizarToolBarTipoInstitucion;
    protected JButton jButtonEliminarToolBarTipoInstitucion;
	protected JButton jButtonCancelarToolBarTipoInstitucion;
    protected JButton jButtonGuardarCambiosToolBarTipoInstitucion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoInstitucion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInstitucion;
	protected JButton jButtonCerrarToolBarTipoInstitucion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoInstitucion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInstitucion;
	protected JMenuItem jMenuItemModificarTipoInstitucion;
	protected JMenuItem jMenuItemActualizarTipoInstitucion;
    protected JMenuItem jMenuItemEliminarTipoInstitucion;
	protected JMenuItem jMenuItemCancelarTipoInstitucion;
    protected JMenuItem jMenuItemGuardarCambiosTipoInstitucion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInstitucion;
	protected JMenuItem jMenuItemCerrarTipoInstitucion;
	protected JMenuItem jMenuItemDetalleCerrarTipoInstitucion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInstitucion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoInstitucion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInstitucion;
	protected JMenuItem jMenuItemMostrarOcultarTipoInstitucion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInstitucion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInstitucion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInstitucion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoInstitucion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoInstitucion;
	public JLabel jLabelIdTipoInstitucion;
	public JLabel jLabelidTipoInstitucion;
	public JButton jButtonidTipoInstitucionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoInstitucion;
	public JLabel jLabelcodigoTipoInstitucion;
	public JTextField jTextFieldcodigoTipoInstitucion;
	public JButton jButtoncodigoTipoInstitucionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoInstitucion;
	public JLabel jLabelnombreTipoInstitucion;
	public JTextArea jTextAreanombreTipoInstitucion;
	public JScrollPane jscrollPanenombreTipoInstitucion;
	public JButton jButtonnombreTipoInstitucionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoInstitucion;
	public JLabel jLabelid_empresaTipoInstitucion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoInstitucion;
	public JButton jButtonid_empresaTipoInstitucion= new JButtonMe();
	public JButton jButtonid_empresaTipoInstitucionUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoInstitucionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoInstitucion;
	
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
	
	public TipoInstitucionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoInstitucion=new JPanel();
				this.jPanelAccionesFormularioTipoInstitucion=new JPanel();
				this.jmenuBarDetalleTipoInstitucion=new JMenuBar();
				this.jTtoolBarDetalleTipoInstitucion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstitucionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoInstitucionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstitucionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstitucionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInstitucionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInstitucion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoInstitucion() {
		return this.jButtonActualizarToolBarTipoInstitucion;
	}
	
	public JButton getjButtonEliminarToolBarTipoInstitucion() {
		return this.jButtonEliminarToolBarTipoInstitucion;
	}
	
	public JButton getjButtonCancelarToolBarTipoInstitucion() {
		return this.jButtonCancelarToolBarTipoInstitucion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoInstitucion() {
		return this.jButtonProcesarInformacionTipoInstitucion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInstitucion)	{
		this.jButtonProcesarInformacionTipoInstitucion = jButtonProcesarInformacionTipoInstitucion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInstitucion() {
		return this.jComboBoxTiposAccionesTipoInstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInstitucion(
			JComboBox jComboBoxTiposRelacionesTipoInstitucion) {
		this.jComboBoxTiposRelacionesTipoInstitucion = jComboBoxTiposRelacionesTipoInstitucion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInstitucion(
			JComboBox jComboBoxTiposAccionesTipoInstitucion) {
		this.jComboBoxTiposAccionesTipoInstitucion = jComboBoxTiposAccionesTipoInstitucion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoInstitucion() {
		return this.jComboBoxTiposAccionesFormularioTipoInstitucion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoInstitucion(
			JComboBox jComboBoxTiposAccionesFormularioTipoInstitucion) {
		this.jComboBoxTiposAccionesFormularioTipoInstitucion = jComboBoxTiposAccionesFormularioTipoInstitucion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoinstitucionSessionBean=new TipoInstitucionSessionBean();
		
		this.tipoinstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinstitucionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cursoSessionBean=new CursoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInstitucionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Institucion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoInstitucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoInstitucion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoInstitucion=new JButtonMe();
				this.jButtonModificarToolBarTipoInstitucion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoInstitucion,this.jTtoolBarDetalleTipoInstitucion,
							"actualizar","actualizar","Actualizar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoInstitucion,this.jTtoolBarDetalleTipoInstitucion,
							"eliminar","eliminar","Eliminar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoInstitucion,this.jTtoolBarDetalleTipoInstitucion,
							"cancelar","cancelar","Cancelar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoInstitucion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoInstitucion,this.jTtoolBarDetalleTipoInstitucion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoInstitucion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoInstitucion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoInstitucion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoInstitucion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoInstitucion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInstitucion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInstitucion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInstitucion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoInstitucion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoInstitucion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoInstitucion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoInstitucion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoInstitucion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoInstitucion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoInstitucion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoInstitucion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoInstitucion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoInstitucion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoInstitucion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoInstitucion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoInstitucion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInstitucion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInstitucion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInstitucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInstitucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInstitucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoInstitucion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoInstitucion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoInstitucion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInstitucion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInstitucion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInstitucion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInstitucion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoInstitucion.add(this.jMenuItemDetalleCerrarTipoInstitucion);
		
		this.jmenuDetalleAccionesTipoInstitucion.add(this.jMenuItemActualizarTipoInstitucion);
		this.jmenuDetalleAccionesTipoInstitucion.add(this.jMenuItemEliminarTipoInstitucion);
		this.jmenuDetalleAccionesTipoInstitucion.add(this.jMenuItemCancelarTipoInstitucion);		
		
		//this.jmenuDetalleDatosTipoInstitucion.add(this.jMenuItemDetalleAbrirOrderByTipoInstitucion);				
		this.jmenuDetalleDatosTipoInstitucion.add(this.jMenuItemDetalleMostarOcultarTipoInstitucion);				
				
		//this.jmenuDetalleAccionesTipoInstitucion.add(this.jMenuItemGuardarCambiosTipoInstitucion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoInstitucion.add(this.jmenuDetalleArchivoTipoInstitucion);		
		this.jmenuBarDetalleTipoInstitucion.add(this.jmenuDetalleAccionesTipoInstitucion);		
		this.jmenuBarDetalleTipoInstitucion.add(this.jmenuDetalleDatosTipoInstitucion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoInstitucion.add(this.jmenuDetalleTipoInstitucion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoInstitucion);				
	}
	
	
	public void inicializarElementosCamposTipoInstitucion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoInstitucion = new JLabelMe();
		jLabelIdTipoInstitucion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoInstitucion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoInstitucion.setToolTipText(TipoInstitucionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoInstitucion= new GridBagLayout();

		this.jPanelidTipoInstitucion.setLayout(this.gridaBagLayoutTipoInstitucion);

		jLabelidTipoInstitucion = new JLabel();
		jLabelidTipoInstitucion.setText("Id");

		jLabelidTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoInstitucion = new JLabelMe();
		this.jLabelcodigoTipoInstitucion.setText(""+TipoInstitucionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoInstitucion.setToolTipText("Codigo");
		this.jLabelcodigoTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoInstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoInstitucion.setToolTipText(TipoInstitucionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoInstitucion = new GridBagLayout();
		this.jPanelcodigoTipoInstitucion.setLayout(this.gridaBagLayoutTipoInstitucion);


		jTextFieldcodigoTipoInstitucion= new JTextFieldMe();

		jTextFieldcodigoTipoInstitucion.setEnabled(false);
		jTextFieldcodigoTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoInstitucionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoInstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoInstitucionBusqueda.setText("U");
		this.jButtoncodigoTipoInstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoInstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoInstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoInstitucionBusqueda"));

		if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoInstitucionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoInstitucion = new JLabelMe();
		this.jLabelnombreTipoInstitucion.setText(""+TipoInstitucionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoInstitucion.setToolTipText("Nombre");
		this.jLabelnombreTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoInstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoInstitucion.setToolTipText(TipoInstitucionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoInstitucion = new GridBagLayout();
		this.jPanelnombreTipoInstitucion.setLayout(this.gridaBagLayoutTipoInstitucion);


		jTextAreanombreTipoInstitucion= new JTextAreaMe();
		jTextAreanombreTipoInstitucion.setEnabled(false);
		jTextAreanombreTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoInstitucion.setLineWrap(true);
		jTextAreanombreTipoInstitucion.setWrapStyleWord(true);
		jTextAreanombreTipoInstitucion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoInstitucion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoInstitucion = new JScrollPane(jTextAreanombreTipoInstitucion);
		jscrollPanenombreTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoInstitucionBusqueda= new JButtonMe();
		this.jButtonnombreTipoInstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoInstitucionBusqueda.setText("U");
		this.jButtonnombreTipoInstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoInstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoInstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoInstitucionBusqueda"));

		if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoInstitucionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoInstitucion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoInstitucion = new JLabelMe();
		this.jLabelid_empresaTipoInstitucion.setText(""+TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoInstitucion.setToolTipText("Empresa");
		this.jLabelid_empresaTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoInstitucion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoInstitucion.setToolTipText(TipoInstitucionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoInstitucion = new GridBagLayout();
		this.jPanelid_empresaTipoInstitucion.setLayout(this.gridaBagLayoutTipoInstitucion);


		jComboBoxid_empresaTipoInstitucion= new JComboBoxMe();
		jComboBoxid_empresaTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoInstitucion.setEnabled(false);

		this.jButtonid_empresaTipoInstitucion= new JButtonMe();
		this.jButtonid_empresaTipoInstitucion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInstitucion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInstitucion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInstitucion.setText("Buscar");
		this.jButtonid_empresaTipoInstitucion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoInstitucion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInstitucion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInstitucion"));

		this.jButtonid_empresaTipoInstitucionBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoInstitucionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInstitucionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInstitucionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoInstitucionBusqueda.setText("U");
		this.jButtonid_empresaTipoInstitucionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoInstitucionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInstitucionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInstitucionBusqueda"));

		if(this.tipoinstitucionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoInstitucionBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoInstitucionUpdate= new JButtonMe();
		this.jButtonid_empresaTipoInstitucionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInstitucionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInstitucionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoInstitucionUpdate.setText("U");
		this.jButtonid_empresaTipoInstitucionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoInstitucionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInstitucionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoInstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInstitucionUpdate"));



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
		//this.jInternalFrameDetalleTipoInstitucion = new TipoInstitucionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Institucion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInstitucion= new GridBagLayout();
		

		
		String sToolTipTipoInstitucion="";
		sToolTipTipoInstitucion=TipoInstitucionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInstitucion+="(Nomina.TipoInstitucion)";
		}
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInstitucion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoInstitucion = new JButtonMe();
		this.jButtonModificarTipoInstitucion = new JButtonMe();
        this.jButtonActualizarTipoInstitucion = new JButtonMe();
        this.jButtonEliminarTipoInstitucion = new JButtonMe();
        this.jButtonCancelarTipoInstitucion = new JButtonMe();
        this.jButtonGuardarCambiosTipoInstitucion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoInstitucion = new JButtonMe();
		this.jButtonCerrarTipoInstitucion = new JButtonMe();
		
		this.jScrollPanelDatosTipoInstitucion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoInstitucion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoInstitucion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Institucion";
		
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Instituciones" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInstitucion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoInstitucion.setName("jPanelCamposTipoInstitucion"); 

		this.jPanelCamposOcultosTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoInstitucion.setName("jPanelCamposOcultosTipoInstitucion"); 

        this.jPanelAccionesTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInstitucion.setToolTipText("Acciones");
        this.jPanelAccionesTipoInstitucion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoInstitucion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoInstitucion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoInstitucion.setText("Nuevo");
		this.jButtonModificarTipoInstitucion.setText("Editar");
        this.jButtonActualizarTipoInstitucion.setText("Actualizar");
        this.jButtonEliminarTipoInstitucion.setText("Eliminar");
        this.jButtonCancelarTipoInstitucion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoInstitucion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoInstitucion.setText("Guardar");
		this.jButtonCerrarTipoInstitucion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInstitucion,"nuevo_button","Nuevo",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoInstitucion,"modificar_button","Editar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoInstitucion,"actualizar_button","Actualizar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoInstitucion,"eliminar_button","Eliminar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoInstitucion,"cancelar_button","Cancelar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoInstitucion,"guardarcambios_button","Guardar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInstitucion,"guardarcambiostabla_button","Guardar",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInstitucion,"cerrar_button","Salir",this.tipoinstitucionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoInstitucion.setToolTipText("Nuevo"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoInstitucion.setToolTipText("Editar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoInstitucion.setToolTipText("Actualizar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoInstitucion.setToolTipText("Eliminar)"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoInstitucion.setToolTipText("Cancelar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoInstitucion.setToolTipText("Guardar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoInstitucion.setToolTipText("Guardar"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInstitucion.setToolTipText("Salir"+" "+TipoInstitucionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInstitucion";
		inputMap = this.jButtonNuevoTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInstitucion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInstitucion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoInstitucion";
		inputMap = this.jButtonActualizarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoInstitucion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoInstitucion";
		inputMap = this.jButtonEliminarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoInstitucion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoInstitucion";
		inputMap = this.jButtonCancelarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoInstitucion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoInstitucion";
		inputMap = this.jButtonCerrarTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInstitucion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInstitucion";
		inputMap = this.jButtonGuardarCambiosTablaTipoInstitucion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInstitucion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInstitucion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoInstitucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoInstitucion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoInstitucion.setToolTipText("Nuevo TipoInstitucion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoInstitucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoInstitucion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoInstitucion.setToolTipText("Sin Cerrar Ventana TipoInstitucion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoInstitucion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoInstitucion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoInstitucion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInstitucion.setText("Accion");
		this.jComboBoxTiposAccionesTipoInstitucion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoInstitucion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoInstitucion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoInstitucion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoInstitucion = new JLabelMe();
		
		this.jLabelAccionesTipoInstitucion.setText("Acciones");		
		this.jLabelAccionesTipoInstitucion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstitucion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInstitucion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoInstitucion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoInstitucion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoInstitucion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoInstitucion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoInstitucion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoInstitucion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstitucion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInstitucion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInstitucion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoInstitucion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInstitucion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInstitucion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoInstitucion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoInstitucion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoInstitucion = new GridBagLayout();
		
		this.jPanelCamposTipoInstitucion.setLayout(gridaBagLayoutCamposTipoInstitucion);
		this.jPanelCamposOcultosTipoInstitucion.setLayout(gridaBagLayoutCamposOcultosTipoInstitucion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 0;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoInstitucion.add(jLabelIdTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 1;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoInstitucion.add(jLabelidTipoInstitucion, this.gridBagConstraintsTipoInstitucion);


	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 0;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoInstitucion.add(jLabelid_empresaTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = 0;
		this.gridBagConstraintsTipoInstitucion.gridx = 2;
		this.gridBagConstraintsTipoInstitucion.ipadx = 0;
		this.gridBagConstraintsTipoInstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoInstitucion.add(jButtonid_empresaTipoInstitucionBusqueda, this.gridBagConstraintsTipoInstitucion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = 0;
		this.gridBagConstraintsTipoInstitucion.gridx = 3;
		this.gridBagConstraintsTipoInstitucion.ipadx = 0;
		this.gridBagConstraintsTipoInstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoInstitucion.add(jButtonid_empresaTipoInstitucionUpdate, this.gridBagConstraintsTipoInstitucion);
	}

	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 1;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoInstitucion.add(jComboBoxid_empresaTipoInstitucion, this.gridBagConstraintsTipoInstitucion);


	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 0;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoInstitucion.add(jLabelcodigoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = 0;
		this.gridBagConstraintsTipoInstitucion.gridx = 2;
		this.gridBagConstraintsTipoInstitucion.ipadx = 0;
		this.gridBagConstraintsTipoInstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoInstitucion.add(jButtoncodigoTipoInstitucionBusqueda, this.gridBagConstraintsTipoInstitucion);
	}

	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 1;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoInstitucion.add(jTextFieldcodigoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);


	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 0;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoInstitucion.add(jLabelnombreTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		//this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInstitucion.gridy = 0;
		this.gridBagConstraintsTipoInstitucion.gridx = 2;
		this.gridBagConstraintsTipoInstitucion.ipadx = 0;
		this.gridBagConstraintsTipoInstitucion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoInstitucion.add(jButtonnombreTipoInstitucionBusqueda, this.gridBagConstraintsTipoInstitucion);
	}

	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInstitucion.gridy = 0;
	this.gridBagConstraintsTipoInstitucion.gridx = 1;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoInstitucion.add(jscrollPanenombreTipoInstitucion, this.gridBagConstraintsTipoInstitucion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInstitucion.gridy = iYPanelCamposTipoInstitucion;
	this.gridBagConstraintsTipoInstitucion.gridx = iXPanelCamposTipoInstitucion++;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInstitucion.add(this.jPanelidTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	if(iXPanelCamposTipoInstitucion % 1==0) {
		iXPanelCamposTipoInstitucion=0;
		iYPanelCamposTipoInstitucion++;
	}
	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInstitucion.gridy = iYPanelCamposTipoInstitucion;
	this.gridBagConstraintsTipoInstitucion.gridx = iXPanelCamposTipoInstitucion++;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInstitucion.add(this.jPanelcodigoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	if(iXPanelCamposTipoInstitucion % 1==0) {
		iXPanelCamposTipoInstitucion=0;
		iYPanelCamposTipoInstitucion++;
	}
	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInstitucion.gridy = iYPanelCamposTipoInstitucion;
	this.gridBagConstraintsTipoInstitucion.gridx = iXPanelCamposTipoInstitucion++;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInstitucion.add(this.jPanelnombreTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	if(iXPanelCamposTipoInstitucion % 1==0) {
		iXPanelCamposTipoInstitucion=0;
		iYPanelCamposTipoInstitucion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInstitucion.gridy = iYPanelCamposOcultosTipoInstitucion;
	this.gridBagConstraintsTipoInstitucion.gridx = iXPanelCamposOcultosTipoInstitucion++;
	this.gridBagConstraintsTipoInstitucion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInstitucion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoInstitucion.add(this.jPanelid_empresaTipoInstitucion, this.gridBagConstraintsTipoInstitucion);



	if(iXPanelCamposOcultosTipoInstitucion % 1==0) {
		iXPanelCamposOcultosTipoInstitucion=0;
		iYPanelCamposOcultosTipoInstitucion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoInstitucion= new GridBagLayout();
		this.jPanelAccionesTipoInstitucion.setLayout(gridaBagLayoutAccionesTipoInstitucion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoInstitucion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoInstitucion.setLayout(gridaBagLayoutAccionesFormularioTipoInstitucion);
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInstitucion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInstitucion.add(this.jComboBoxTiposAccionesFormularioTipoInstitucion, this.gridBagConstraintsTipoInstitucion);

		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInstitucion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInstitucion.add(this.jCheckBoxPostAccionNuevoTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInstitucion.add(this.jCheckBoxPostAccionSinCerrarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoinstitucionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoinstitucionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInstitucion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInstitucion.add(this.jCheckBoxPostAccionSinMensajeTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = 0;
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoInstitucion.add(this.jButtonModificarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);							

		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInstitucion.gridy = 0;
		this.gridBagConstraintsTipoInstitucion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoInstitucion.add(this.jButtonEliminarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
			
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = 0;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInstitucion.add(this.jButtonActualizarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);


		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = 0;		
		this.gridBagConstraintsTipoInstitucion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInstitucion.add(this.jButtonGuardarCambiosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);	
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = 0;		
		this.gridBagConstraintsTipoInstitucion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoInstitucion.add(this.jButtonCancelarTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInstitucion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInstitucion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinstitucionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();						
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInstitucion.gridx = 0;		
			//this.gridBagConstraintsTipoInstitucion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInstitucion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInstitucion.gridx =0;
		this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInstitucion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoInstitucionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoInstitucion = new TipoInstitucionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Institucion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Institucion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Institucion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoInstitucionModel tipoinstitucionModel=new TipoInstitucionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoInstitucionModel.TipoInstitucionFocusTraversalPolicy tipoinstitucionFocusTraversalPolicy = tipoinstitucionModel.new TipoInstitucionFocusTraversalPolicy(this);
			
			//tipoinstitucionFocusTraversalPolicy.settipoinstitucionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoinstitucionModel);
			
			
			this.jContentPaneDetalleTipoInstitucion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoInstitucion = new GridBagLayout();	
			this.jContentPaneDetalleTipoInstitucion.setLayout(gridaBagLayoutDetalleTipoInstitucion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInstitucion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
				this.gridBagConstraintsTipoInstitucion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoInstitucion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoInstitucion.add(jTtoolBarDetalleTipoInstitucion, gridBagConstraintsTipoInstitucion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoInstitucion=   new JScrollPane(jContentPaneDetalleTipoInstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoInstitucion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoInstitucion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoInstitucion.gridx = 0;
	        
			this.jContentPaneDetalleTipoInstitucion.add(jPanelCamposTipoInstitucion, gridBagConstraintsTipoInstitucion);
			
			
			
			
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
						&& tipoinstitucionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCurso(this.puedeCargarPorParteCurso,false,-1);
					
					if(this.tipoinstitucionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoInstitucion= new GridBagConstraints();
						this.gridBagConstraintsTipoInstitucion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoInstitucion.gridx = 0;
						this.jContentPaneDetalleTipoInstitucion.add(this.jTabbedPaneRelacionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoInstitucion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCurso(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoInstitucion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
					this.gridBagConstraintsTipoInstitucion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoInstitucion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoInstitucion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoInstitucion.add(jPanelCamposOcultosTipoInstitucion, gridBagConstraintsTipoInstitucion);
				
					this.jPanelCamposOcultosTipoInstitucion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoInstitucion.gridx = 0;
	        this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoInstitucion.add(this.jPanelAccionesFormularioTipoInstitucion, this.gridBagConstraintsTipoInstitucion);							
			
			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
	        this.gridBagConstraintsTipoInstitucion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoInstitucion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoInstitucion.add(this.jPanelAccionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoInstitucion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoInstitucion=   new JScrollPane(this.jPanelCamposTipoInstitucion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInstitucion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstitucion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInstitucion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoInstitucion.gridx = 0;
			this.gridBagConstraintsTipoInstitucion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoInstitucion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoInstitucion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInstitucion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoInstitucion, this.gridBagConstraintsTipoInstitucion);			
			
			this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
			this.gridBagConstraintsTipoInstitucion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInstitucion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
			
			
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		
			
		this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
		this.gridBagConstraintsTipoInstitucion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInstitucion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInstitucion, this.gridBagConstraintsTipoInstitucion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoInstitucion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoInstitucion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCurso(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cursoSessionBean=new CursoSessionBean();
		this.cursoSessionBean.setConGuardarRelaciones(false);
		this.cursoSessionBean.setEsGuardarRelacionado(true);

		this.cursoBeanSwingJInternalFrame=null;//new CursoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cursoBeanSwingJInternalFramePopup=new CursoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cursoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cursoSessionBean.getEsGuardarRelacionado()) {

				CursoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL;
				CursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoInstitucionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cursoSessionBean.setEsGuardarRelacionado(true);

				this.cursoBeanSwingJInternalFrame=new CursoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cursoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cursoBeanSwingJInternalFrame.setcursoSessionBean(this.cursoSessionBean);

				//this.gridBagConstraintsTipoInstitucion = new GridBagConstraints();
				//this.gridBagConstraintsTipoInstitucion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoInstitucion.gridx = 0;
				//this.jContentPaneDetalleTipoInstitucion.add(this.cursoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoInstitucion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoInstitucion.add("Cursos",this.cursoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoInstitucion.setComponentAt(iIndexTab,this.cursoBeanSwingJInternalFrame.getContentPane());
				}

				//CursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cursoSessionBean.setEsGuardarRelacionado(false);
				this.cursoBeanSwingJInternalFrame=null;//new CursoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cursoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCurso) {
					this.jTabbedPaneRelacionesTipoInstitucion.add("Cursos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCursoBeanSwingJInternalFrame(List<TipoInstitucion> tipoinstitucions,TipoInstitucion tipoinstitucion,CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cursoBeanSwingJInternalFrame=new CursoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cursoBeanSwingJInternalFrame.getCursoLogic().setConnexion(this.tipoinstitucionLogic.getConnexion());

					cursoBeanSwingJInternalFrame.settipoinstitucionsForeignKey(tipoinstitucions);
					cursoBeanSwingJInternalFrame.settipoinstitucionForeignKey(tipoinstitucion);
					cursoBeanSwingJInternalFrame.cursoSessionBean.setisBusquedaDesdeForeignKeySesionTipoInstitucion(true);
					cursoBeanSwingJInternalFrame.cursoSessionBean.setlidTipoInstitucionActual(tipoinstitucion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cursoBeanSwingJInternalFrame.cargarCombosForeignKeyCurso(cursoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cursoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoInstitucion(true);
					cursoBeanSwingJInternalFrame.setid_tipo_institucionFK_IdTipoInstitucion(tipoinstitucion.getId());

					if(!this.conCargarFormDetalle) {
						cursoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cursoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoInstitucionForeignKey(tipoinstitucion,1,false,true,true);
					cursoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cursoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoInstitucion");
					cursoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoInstitucion");
					cursoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCurso(true);
					cursoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCurso("n",cursoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cursoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cursoBeanSwingJInternalFrame.setAutoscrolls(true);
					cursoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cursoBeanSwingJInternalFrame.actualizarEstadoPanelsCurso("relacionado");
					} else {
						cursoBeanSwingJInternalFrame.actualizarEstadoPanelsCurso("no_relacionado");
					}

					cursoBeanSwingJInternalFrame.getjButtonRecargarInformacionCurso().setVisible(false);

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
