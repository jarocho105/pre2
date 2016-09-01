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
import com.bydan.erp.nomina.util.TipoCursoConstantesFunciones;

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
public class TipoCursoDetalleFormJInternalFrame extends TipoCursoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCurso;
	
	protected JMenuBar jmenuBarDetalleTipoCurso;
	
	protected JMenu jmenuDetalleTipoCurso;
	protected JMenu jmenuDetalleArchivoTipoCurso;
	protected JMenu jmenuDetalleAccionesTipoCurso;
	protected JMenu jmenuDetalleDatosTipoCurso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCurso;	
	protected GridBagConstraints gridBagConstraintsTipoCurso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCursoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCurso;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCursoSessionBean tipocursoSessionBean;
	
	

	public CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame=null;
	public CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCurso=false;
	public CursoSessionBean cursoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoCursoLogic tipocursoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCurso;
	public JScrollPane jScrollPanelDatosEdicionTipoCurso;
	public JScrollPane jScrollPanelDatosGeneralTipoCurso;
	
	protected JPanel jPanelCamposTipoCurso;    
	protected JPanel jPanelCamposOcultosTipoCurso;    	
	protected JPanel jPanelAccionesTipoCurso;
	protected JPanel jPanelAccionesFormularioTipoCurso;
    
	
	
	protected Integer iXPanelCamposTipoCurso=0;
	protected Integer iYPanelCamposTipoCurso=0;
	
	protected Integer iXPanelCamposOcultosTipoCurso=0;
	protected Integer iYPanelCamposOcultosTipoCurso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCurso;
	public JButton jButtonModificarTipoCurso;
	public JButton jButtonActualizarTipoCurso;
    public JButton jButtonEliminarTipoCurso;
	public JButton jButtonCancelarTipoCurso;
    public JButton jButtonGuardarCambiosTipoCurso;
	public JButton jButtonGuardarCambiosTablaTipoCurso;
	protected JButton jButtonCerrarTipoCurso;
	
	
	protected JButton jButtonProcesarInformacionTipoCurso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCurso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCurso;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCurso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCurso;
	protected JButton jButtonModificarToolBarTipoCurso;
	protected JButton jButtonActualizarToolBarTipoCurso;
    protected JButton jButtonEliminarToolBarTipoCurso;
	protected JButton jButtonCancelarToolBarTipoCurso;
    protected JButton jButtonGuardarCambiosToolBarTipoCurso;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCurso;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCurso;
	protected JButton jButtonCerrarToolBarTipoCurso;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCurso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCurso;
	protected JMenuItem jMenuItemModificarTipoCurso;
	protected JMenuItem jMenuItemActualizarTipoCurso;
    protected JMenuItem jMenuItemEliminarTipoCurso;
	protected JMenuItem jMenuItemCancelarTipoCurso;
    protected JMenuItem jMenuItemGuardarCambiosTipoCurso;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCurso;
	protected JMenuItem jMenuItemCerrarTipoCurso;
	protected JMenuItem jMenuItemDetalleCerrarTipoCurso;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCurso;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCurso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCurso;
	protected JMenuItem jMenuItemMostrarOcultarTipoCurso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCurso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCurso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCurso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCurso;
	public JLabel jLabelIdTipoCurso;
	public JLabel jLabelidTipoCurso;
	public JButton jButtonidTipoCursoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCurso;
	public JLabel jLabelcodigoTipoCurso;
	public JTextField jTextFieldcodigoTipoCurso;
	public JButton jButtoncodigoTipoCursoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCurso;
	public JLabel jLabelnombreTipoCurso;
	public JTextArea jTextAreanombreTipoCurso;
	public JScrollPane jscrollPanenombreTipoCurso;
	public JButton jButtonnombreTipoCursoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCurso;
	public JLabel jLabelid_empresaTipoCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCurso;
	public JButton jButtonid_empresaTipoCurso= new JButtonMe();
	public JButton jButtonid_empresaTipoCursoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCursoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCurso;
	
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
	
	public TipoCursoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCurso=new JPanel();
				this.jPanelAccionesFormularioTipoCurso=new JPanel();
				this.jmenuBarDetalleTipoCurso=new JMenuBar();
				this.jTtoolBarDetalleTipoCurso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCursoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCursoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCursoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCursoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCursoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCurso() {
		return this.jButtonActualizarToolBarTipoCurso;
	}
	
	public JButton getjButtonEliminarToolBarTipoCurso() {
		return this.jButtonEliminarToolBarTipoCurso;
	}
	
	public JButton getjButtonCancelarToolBarTipoCurso() {
		return this.jButtonCancelarToolBarTipoCurso;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCurso() {
		return this.jButtonProcesarInformacionTipoCurso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCurso)	{
		this.jButtonProcesarInformacionTipoCurso = jButtonProcesarInformacionTipoCurso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCurso() {
		return this.jComboBoxTiposAccionesTipoCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCurso(
			JComboBox jComboBoxTiposRelacionesTipoCurso) {
		this.jComboBoxTiposRelacionesTipoCurso = jComboBoxTiposRelacionesTipoCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCurso(
			JComboBox jComboBoxTiposAccionesTipoCurso) {
		this.jComboBoxTiposAccionesTipoCurso = jComboBoxTiposAccionesTipoCurso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCurso() {
		return this.jComboBoxTiposAccionesFormularioTipoCurso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCurso(
			JComboBox jComboBoxTiposAccionesFormularioTipoCurso) {
		this.jComboBoxTiposAccionesFormularioTipoCurso = jComboBoxTiposAccionesFormularioTipoCurso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocursoSessionBean=new TipoCursoSessionBean();
		
		this.tipocursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocursoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cursoSessionBean=new CursoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCursoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Curso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCurso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCurso=new JButtonMe();
				this.jButtonModificarToolBarTipoCurso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCurso,this.jTtoolBarDetalleTipoCurso,
							"actualizar","actualizar","Actualizar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCurso,this.jTtoolBarDetalleTipoCurso,
							"eliminar","eliminar","Eliminar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCurso,this.jTtoolBarDetalleTipoCurso,
							"cancelar","cancelar","Cancelar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCurso,this.jTtoolBarDetalleTipoCurso,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCurso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCurso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCurso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCurso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCurso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCurso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCurso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCurso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCurso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCurso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCurso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCurso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCurso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCurso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCurso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCurso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCurso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCurso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCurso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCurso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCurso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCurso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCurso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCurso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCurso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCurso.add(this.jMenuItemDetalleCerrarTipoCurso);
		
		this.jmenuDetalleAccionesTipoCurso.add(this.jMenuItemActualizarTipoCurso);
		this.jmenuDetalleAccionesTipoCurso.add(this.jMenuItemEliminarTipoCurso);
		this.jmenuDetalleAccionesTipoCurso.add(this.jMenuItemCancelarTipoCurso);		
		
		//this.jmenuDetalleDatosTipoCurso.add(this.jMenuItemDetalleAbrirOrderByTipoCurso);				
		this.jmenuDetalleDatosTipoCurso.add(this.jMenuItemDetalleMostarOcultarTipoCurso);				
				
		//this.jmenuDetalleAccionesTipoCurso.add(this.jMenuItemGuardarCambiosTipoCurso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCurso.add(this.jmenuDetalleArchivoTipoCurso);		
		this.jmenuBarDetalleTipoCurso.add(this.jmenuDetalleAccionesTipoCurso);		
		this.jmenuBarDetalleTipoCurso.add(this.jmenuDetalleDatosTipoCurso);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCurso.add(this.jmenuDetalleTipoCurso);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCurso);				
	}
	
	
	public void inicializarElementosCamposTipoCurso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCurso = new JLabelMe();
		jLabelIdTipoCurso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCurso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCurso.setToolTipText(TipoCursoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCurso= new GridBagLayout();

		this.jPanelidTipoCurso.setLayout(this.gridaBagLayoutTipoCurso);

		jLabelidTipoCurso = new JLabel();
		jLabelidTipoCurso.setText("Id");

		jLabelidTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCurso = new JLabelMe();
		this.jLabelcodigoTipoCurso.setText(""+TipoCursoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCurso.setToolTipText("Codigo");
		this.jLabelcodigoTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCurso.setToolTipText(TipoCursoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCurso = new GridBagLayout();
		this.jPanelcodigoTipoCurso.setLayout(this.gridaBagLayoutTipoCurso);


		jTextFieldcodigoTipoCurso= new JTextFieldMe();

		jTextFieldcodigoTipoCurso.setEnabled(false);
		jTextFieldcodigoTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCursoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCursoBusqueda.setText("U");
		this.jButtoncodigoTipoCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCursoBusqueda"));

		if(this.tipocursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCursoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCurso = new JLabelMe();
		this.jLabelnombreTipoCurso.setText(""+TipoCursoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCurso.setToolTipText("Nombre");
		this.jLabelnombreTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCurso.setToolTipText(TipoCursoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCurso = new GridBagLayout();
		this.jPanelnombreTipoCurso.setLayout(this.gridaBagLayoutTipoCurso);


		jTextAreanombreTipoCurso= new JTextAreaMe();
		jTextAreanombreTipoCurso.setEnabled(false);
		jTextAreanombreTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCurso.setLineWrap(true);
		jTextAreanombreTipoCurso.setWrapStyleWord(true);
		jTextAreanombreTipoCurso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCurso.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCurso = new JScrollPane(jTextAreanombreTipoCurso);
		jscrollPanenombreTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCursoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCursoBusqueda.setText("U");
		this.jButtonnombreTipoCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCursoBusqueda"));

		if(this.tipocursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCursoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCurso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCurso = new JLabelMe();
		this.jLabelid_empresaTipoCurso.setText(""+TipoCursoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCurso.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCurso.setToolTipText(TipoCursoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCurso = new GridBagLayout();
		this.jPanelid_empresaTipoCurso.setLayout(this.gridaBagLayoutTipoCurso);


		jComboBoxid_empresaTipoCurso= new JComboBoxMe();
		jComboBoxid_empresaTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCurso.setEnabled(false);

		this.jButtonid_empresaTipoCurso= new JButtonMe();
		this.jButtonid_empresaTipoCurso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCurso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCurso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCurso.setText("Buscar");
		this.jButtonid_empresaTipoCurso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCurso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCurso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCurso"));

		this.jButtonid_empresaTipoCursoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCursoBusqueda.setText("U");
		this.jButtonid_empresaTipoCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCursoBusqueda"));

		if(this.tipocursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCursoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCursoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCursoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCursoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCursoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCursoUpdate.setText("U");
		this.jButtonid_empresaTipoCursoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCursoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCursoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCursoUpdate"));



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
		//this.jInternalFrameDetalleTipoCurso = new TipoCursoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Curso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCurso= new GridBagLayout();
		

		
		String sToolTipTipoCurso="";
		sToolTipTipoCurso=TipoCursoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCurso+="(Nomina.TipoCurso)";
		}
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCurso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCurso = new JButtonMe();
		this.jButtonModificarTipoCurso = new JButtonMe();
        this.jButtonActualizarTipoCurso = new JButtonMe();
        this.jButtonEliminarTipoCurso = new JButtonMe();
        this.jButtonCancelarTipoCurso = new JButtonMe();
        this.jButtonGuardarCambiosTipoCurso = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCurso = new JButtonMe();
		this.jButtonCerrarTipoCurso = new JButtonMe();
		
		this.jScrollPanelDatosTipoCurso = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCurso = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCurso = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Curso";
		
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cursos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCurso.setName("jPanelCamposTipoCurso"); 

		this.jPanelCamposOcultosTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCurso.setName("jPanelCamposOcultosTipoCurso"); 

        this.jPanelAccionesTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCurso.setToolTipText("Acciones");
        this.jPanelAccionesTipoCurso.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCurso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCurso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCurso.setText("Nuevo");
		this.jButtonModificarTipoCurso.setText("Editar");
        this.jButtonActualizarTipoCurso.setText("Actualizar");
        this.jButtonEliminarTipoCurso.setText("Eliminar");
        this.jButtonCancelarTipoCurso.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCurso.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCurso.setText("Guardar");
		this.jButtonCerrarTipoCurso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCurso,"nuevo_button","Nuevo",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCurso,"modificar_button","Editar",this.tipocursoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCurso,"actualizar_button","Actualizar",this.tipocursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCurso,"eliminar_button","Eliminar",this.tipocursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCurso,"cancelar_button","Cancelar",this.tipocursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCurso,"guardarcambios_button","Guardar",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCurso,"guardarcambiostabla_button","Guardar",this.tipocursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCurso,"cerrar_button","Salir",this.tipocursoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCurso.setToolTipText("Nuevo"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCurso.setToolTipText("Editar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCurso.setToolTipText("Actualizar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCurso.setToolTipText("Eliminar)"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCurso.setToolTipText("Cancelar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCurso.setToolTipText("Guardar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCurso.setToolTipText("Guardar"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCurso.setToolTipText("Salir"+" "+TipoCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCurso";
		inputMap = this.jButtonNuevoTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCurso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCurso";
		inputMap = this.jButtonActualizarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCurso"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCurso";
		inputMap = this.jButtonEliminarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCurso"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCurso";
		inputMap = this.jButtonCancelarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCurso"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCurso";
		inputMap = this.jButtonCerrarTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCurso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCurso";
		inputMap = this.jButtonGuardarCambiosTablaTipoCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCurso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCurso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCurso.setToolTipText("Nuevo TipoCurso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCurso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCurso.setToolTipText("Sin Cerrar Ventana TipoCurso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCurso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCurso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCurso.setText("Accion");
		this.jComboBoxTiposAccionesTipoCurso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCurso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCurso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCurso = new JLabelMe();
		
		this.jLabelAccionesTipoCurso.setText("Acciones");		
		this.jLabelAccionesTipoCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCurso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCurso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCurso=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCurso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCurso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCurso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCurso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCurso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCurso = new GridBagLayout();
		
		this.jPanelCamposTipoCurso.setLayout(gridaBagLayoutCamposTipoCurso);
		this.jPanelCamposOcultosTipoCurso.setLayout(gridaBagLayoutCamposOcultosTipoCurso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 0;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCurso.add(jLabelIdTipoCurso, this.gridBagConstraintsTipoCurso);



	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 1;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCurso.add(jLabelidTipoCurso, this.gridBagConstraintsTipoCurso);


	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 0;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCurso.add(jLabelid_empresaTipoCurso, this.gridBagConstraintsTipoCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		//this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = 0;
		this.gridBagConstraintsTipoCurso.gridx = 2;
		this.gridBagConstraintsTipoCurso.ipadx = 0;
		this.gridBagConstraintsTipoCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCurso.add(jButtonid_empresaTipoCursoBusqueda, this.gridBagConstraintsTipoCurso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		//this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = 0;
		this.gridBagConstraintsTipoCurso.gridx = 3;
		this.gridBagConstraintsTipoCurso.ipadx = 0;
		this.gridBagConstraintsTipoCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCurso.add(jButtonid_empresaTipoCursoUpdate, this.gridBagConstraintsTipoCurso);
	}

	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 1;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCurso.add(jComboBoxid_empresaTipoCurso, this.gridBagConstraintsTipoCurso);


	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 0;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCurso.add(jLabelcodigoTipoCurso, this.gridBagConstraintsTipoCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		//this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = 0;
		this.gridBagConstraintsTipoCurso.gridx = 2;
		this.gridBagConstraintsTipoCurso.ipadx = 0;
		this.gridBagConstraintsTipoCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCurso.add(jButtoncodigoTipoCursoBusqueda, this.gridBagConstraintsTipoCurso);
	}

	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 1;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCurso.add(jTextFieldcodigoTipoCurso, this.gridBagConstraintsTipoCurso);


	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 0;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCurso.add(jLabelnombreTipoCurso, this.gridBagConstraintsTipoCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		//this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCurso.gridy = 0;
		this.gridBagConstraintsTipoCurso.gridx = 2;
		this.gridBagConstraintsTipoCurso.ipadx = 0;
		this.gridBagConstraintsTipoCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCurso.add(jButtonnombreTipoCursoBusqueda, this.gridBagConstraintsTipoCurso);
	}

	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCurso.gridy = 0;
	this.gridBagConstraintsTipoCurso.gridx = 1;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCurso.add(jscrollPanenombreTipoCurso, this.gridBagConstraintsTipoCurso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCurso.gridy = iYPanelCamposTipoCurso;
	this.gridBagConstraintsTipoCurso.gridx = iXPanelCamposTipoCurso++;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCurso.add(this.jPanelidTipoCurso, this.gridBagConstraintsTipoCurso);



	if(iXPanelCamposTipoCurso % 1==0) {
		iXPanelCamposTipoCurso=0;
		iYPanelCamposTipoCurso++;
	}
	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCurso.gridy = iYPanelCamposTipoCurso;
	this.gridBagConstraintsTipoCurso.gridx = iXPanelCamposTipoCurso++;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCurso.add(this.jPanelcodigoTipoCurso, this.gridBagConstraintsTipoCurso);



	if(iXPanelCamposTipoCurso % 1==0) {
		iXPanelCamposTipoCurso=0;
		iYPanelCamposTipoCurso++;
	}
	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCurso.gridy = iYPanelCamposTipoCurso;
	this.gridBagConstraintsTipoCurso.gridx = iXPanelCamposTipoCurso++;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCurso.add(this.jPanelnombreTipoCurso, this.gridBagConstraintsTipoCurso);



	if(iXPanelCamposTipoCurso % 1==0) {
		iXPanelCamposTipoCurso=0;
		iYPanelCamposTipoCurso++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCurso.gridy = iYPanelCamposOcultosTipoCurso;
	this.gridBagConstraintsTipoCurso.gridx = iXPanelCamposOcultosTipoCurso++;
	this.gridBagConstraintsTipoCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCurso.add(this.jPanelid_empresaTipoCurso, this.gridBagConstraintsTipoCurso);



	if(iXPanelCamposOcultosTipoCurso % 1==0) {
		iXPanelCamposOcultosTipoCurso=0;
		iYPanelCamposOcultosTipoCurso++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCurso= new GridBagLayout();
		this.jPanelAccionesTipoCurso.setLayout(gridaBagLayoutAccionesTipoCurso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCurso= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCurso.setLayout(gridaBagLayoutAccionesFormularioTipoCurso);
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCurso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCurso.add(this.jComboBoxTiposAccionesFormularioTipoCurso, this.gridBagConstraintsTipoCurso);

		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCurso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCurso.add(this.jCheckBoxPostAccionNuevoTipoCurso, this.gridBagConstraintsTipoCurso);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocursoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCurso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCurso.add(this.jCheckBoxPostAccionSinCerrarTipoCurso, this.gridBagConstraintsTipoCurso);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocursoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocursoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCurso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCurso.add(this.jCheckBoxPostAccionSinMensajeTipoCurso, this.gridBagConstraintsTipoCurso);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = 0;
		this.gridBagConstraintsTipoCurso.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCurso.add(this.jButtonModificarTipoCurso, this.gridBagConstraintsTipoCurso);							

		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCurso.gridy = 0;
		this.gridBagConstraintsTipoCurso.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCurso.add(this.jButtonEliminarTipoCurso, this.gridBagConstraintsTipoCurso);
		
			
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = 0;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCurso.add(this.jButtonActualizarTipoCurso, this.gridBagConstraintsTipoCurso);


		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = 0;		
		this.gridBagConstraintsTipoCurso.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCurso.add(this.jButtonGuardarCambiosTipoCurso, this.gridBagConstraintsTipoCurso);	
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = 0;		
		this.gridBagConstraintsTipoCurso.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCurso.add(this.jButtonCancelarTipoCurso, this.gridBagConstraintsTipoCurso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCurso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCurso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocursoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();						
			this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCurso.gridx = 0;		
			//this.gridBagConstraintsTipoCurso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCurso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCurso.gridx =0;
		this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCurso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCurso, this.gridBagConstraintsTipoCurso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCursoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCurso = new TipoCursoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Curso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Curso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Curso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCursoModel tipocursoModel=new TipoCursoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCursoModel.TipoCursoFocusTraversalPolicy tipocursoFocusTraversalPolicy = tipocursoModel.new TipoCursoFocusTraversalPolicy(this);
			
			//tipocursoFocusTraversalPolicy.settipocursoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocursoModel);
			
			
			this.jContentPaneDetalleTipoCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCurso = new GridBagLayout();	
			this.jContentPaneDetalleTipoCurso.setLayout(gridaBagLayoutDetalleTipoCurso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCurso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCurso = new GridBagConstraints();
				this.gridBagConstraintsTipoCurso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCurso.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCurso.add(jTtoolBarDetalleTipoCurso, gridBagConstraintsTipoCurso);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCurso=   new JScrollPane(jContentPaneDetalleTipoCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCurso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCurso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCurso.gridx = 0;
	        
			this.jContentPaneDetalleTipoCurso.add(jPanelCamposTipoCurso, gridBagConstraintsTipoCurso);
			
			
			
			
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
						&& tipocursoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCurso(this.puedeCargarPorParteCurso,false,-1);
					
					if(this.tipocursoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCurso= new GridBagConstraints();
						this.gridBagConstraintsTipoCurso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCurso.gridx = 0;
						this.jContentPaneDetalleTipoCurso.add(this.jTabbedPaneRelacionesTipoCurso, this.gridBagConstraintsTipoCurso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCurso.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCurso(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCurso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCurso = new GridBagConstraints();
					this.gridBagConstraintsTipoCurso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCurso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCurso.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCurso.add(jPanelCamposOcultosTipoCurso, gridBagConstraintsTipoCurso);
				
					this.jPanelCamposOcultosTipoCurso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCurso.gridx = 0;
	        this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCurso.add(this.jPanelAccionesFormularioTipoCurso, this.gridBagConstraintsTipoCurso);							
			
			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
	        this.gridBagConstraintsTipoCurso.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCurso.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCurso.add(this.jPanelAccionesTipoCurso, this.gridBagConstraintsTipoCurso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCurso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCurso=   new JScrollPane(this.jPanelCamposTipoCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCurso.gridx = 0;
			this.gridBagConstraintsTipoCurso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCurso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCurso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCurso, this.gridBagConstraintsTipoCurso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCurso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCurso, this.gridBagConstraintsTipoCurso);			
			
			this.gridBagConstraintsTipoCurso = new GridBagConstraints();
			this.gridBagConstraintsTipoCurso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCurso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCurso, this.gridBagConstraintsTipoCurso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCurso, this.gridBagConstraintsTipoCurso);
			
			
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCurso, this.gridBagConstraintsTipoCurso);
		
			
		this.gridBagConstraintsTipoCurso = new GridBagConstraints();
		this.gridBagConstraintsTipoCurso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCurso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCurso, this.gridBagConstraintsTipoCurso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCurso;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCurso;
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

				CursoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCursoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cursoSessionBean.setEsGuardarRelacionado(true);

				this.cursoBeanSwingJInternalFrame=new CursoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cursoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cursoBeanSwingJInternalFrame.setcursoSessionBean(this.cursoSessionBean);

				//this.gridBagConstraintsTipoCurso = new GridBagConstraints();
				//this.gridBagConstraintsTipoCurso.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCurso.gridx = 0;
				//this.jContentPaneDetalleTipoCurso.add(this.cursoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCurso);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCurso.add("Cursos",this.cursoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCurso.setComponentAt(iIndexTab,this.cursoBeanSwingJInternalFrame.getContentPane());
				}

				//CursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cursoSessionBean.setEsGuardarRelacionado(false);
				this.cursoBeanSwingJInternalFrame=null;//new CursoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cursoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCurso) {
					this.jTabbedPaneRelacionesTipoCurso.add("Cursos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCursoBeanSwingJInternalFrame(List<TipoCurso> tipocursos,TipoCurso tipocurso,CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cursoBeanSwingJInternalFrame=new CursoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cursoBeanSwingJInternalFrame.getCursoLogic().setConnexion(this.tipocursoLogic.getConnexion());

					cursoBeanSwingJInternalFrame.settipocursosForeignKey(tipocursos);
					cursoBeanSwingJInternalFrame.settipocursoForeignKey(tipocurso);
					cursoBeanSwingJInternalFrame.cursoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCurso(true);
					cursoBeanSwingJInternalFrame.cursoSessionBean.setlidTipoCursoActual(tipocurso.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cursoBeanSwingJInternalFrame.cargarCombosForeignKeyCurso(cursoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cursoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCurso(true);
					cursoBeanSwingJInternalFrame.setid_tipo_cursoFK_IdTipoCurso(tipocurso.getId());

					if(!this.conCargarFormDetalle) {
						cursoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cursoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCursoForeignKey(tipocurso,1,false,true,true);
					cursoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cursoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCurso");
					cursoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCurso");
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
