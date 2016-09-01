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
import com.bydan.erp.nomina.util.DetalleCursoConstantesFunciones;

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
public class DetalleCursoDetalleFormJInternalFrame extends DetalleCursoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleCurso;
	
	protected JMenuBar jmenuBarDetalleDetalleCurso;
	
	protected JMenu jmenuDetalleDetalleCurso;
	protected JMenu jmenuDetalleArchivoDetalleCurso;
	protected JMenu jmenuDetalleAccionesDetalleCurso;
	protected JMenu jmenuDetalleDatosDetalleCurso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCurso;	
	protected GridBagConstraints gridBagConstraintsDetalleCurso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleCursoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleCurso;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CursoBeanSwingJInternalFrame cursoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_curso="";
	
	public DetalleCursoSessionBean detallecursoSessionBean;
	
	
	
	
	public CursoSessionBean cursoSessionBean;	
	
	public DetalleCursoLogic detallecursoLogic;
	
	public JScrollPane jScrollPanelDatosDetalleCurso;
	public JScrollPane jScrollPanelDatosEdicionDetalleCurso;
	public JScrollPane jScrollPanelDatosGeneralDetalleCurso;
	
	protected JPanel jPanelCamposDetalleCurso;    
	protected JPanel jPanelCamposOcultosDetalleCurso;    	
	protected JPanel jPanelAccionesDetalleCurso;
	protected JPanel jPanelAccionesFormularioDetalleCurso;
    
	
	
	protected Integer iXPanelCamposDetalleCurso=0;
	protected Integer iYPanelCamposDetalleCurso=0;
	
	protected Integer iXPanelCamposOcultosDetalleCurso=0;
	protected Integer iYPanelCamposOcultosDetalleCurso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleCurso;
	public JButton jButtonModificarDetalleCurso;
	public JButton jButtonActualizarDetalleCurso;
    public JButton jButtonEliminarDetalleCurso;
	public JButton jButtonCancelarDetalleCurso;
    public JButton jButtonGuardarCambiosDetalleCurso;
	public JButton jButtonGuardarCambiosTablaDetalleCurso;
	protected JButton jButtonCerrarDetalleCurso;
	
	
	protected JButton jButtonProcesarInformacionDetalleCurso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleCurso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleCurso;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleCurso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCurso;
	protected JButton jButtonModificarToolBarDetalleCurso;
	protected JButton jButtonActualizarToolBarDetalleCurso;
    protected JButton jButtonEliminarToolBarDetalleCurso;
	protected JButton jButtonCancelarToolBarDetalleCurso;
    protected JButton jButtonGuardarCambiosToolBarDetalleCurso;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleCurso;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCurso;
	protected JButton jButtonCerrarToolBarDetalleCurso;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleCurso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCurso;
	protected JMenuItem jMenuItemModificarDetalleCurso;
	protected JMenuItem jMenuItemActualizarDetalleCurso;
    protected JMenuItem jMenuItemEliminarDetalleCurso;
	protected JMenuItem jMenuItemCancelarDetalleCurso;
    protected JMenuItem jMenuItemGuardarCambiosDetalleCurso;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCurso;
	protected JMenuItem jMenuItemCerrarDetalleCurso;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCurso;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCurso;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleCurso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCurso;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCurso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCurso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCurso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCurso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleCurso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleCurso;
	public JLabel jLabelIdDetalleCurso;
	public JLabel jLabelidDetalleCurso;
	public JButton jButtonidDetalleCursoBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetalleCurso;
	public JLabel jLabelnombreDetalleCurso;
	public JTextArea jTextAreanombreDetalleCurso;
	public JScrollPane jscrollPanenombreDetalleCurso;
	public JButton jButtonnombreDetalleCursoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleCurso;
	public JLabel jLabeldescripcionDetalleCurso;
	public JTextArea jTextAreadescripcionDetalleCurso;
	public JScrollPane jscrollPanedescripcionDetalleCurso;
	public JButton jButtondescripcionDetalleCursoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cursoDetalleCurso;
	public JLabel jLabelid_cursoDetalleCurso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cursoDetalleCurso;
	public JButton jButtonid_cursoDetalleCurso= new JButtonMe();
	public JButton jButtonid_cursoDetalleCursoUpdate= new JButtonMe();
	public JButton jButtonid_cursoDetalleCursoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleCurso;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleCursoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleCurso=new JPanel();
				this.jPanelAccionesFormularioDetalleCurso=new JPanel();
				this.jmenuBarDetalleDetalleCurso=new JMenuBar();
				this.jTtoolBarDetalleDetalleCurso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCursoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleCursoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCursoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCursoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCursoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCurso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleCurso() {
		return this.jButtonActualizarToolBarDetalleCurso;
	}
	
	public JButton getjButtonEliminarToolBarDetalleCurso() {
		return this.jButtonEliminarToolBarDetalleCurso;
	}
	
	public JButton getjButtonCancelarToolBarDetalleCurso() {
		return this.jButtonCancelarToolBarDetalleCurso;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleCurso() {
		return this.jButtonProcesarInformacionDetalleCurso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCurso)	{
		this.jButtonProcesarInformacionDetalleCurso = jButtonProcesarInformacionDetalleCurso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCurso() {
		return this.jComboBoxTiposAccionesDetalleCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCurso(
			JComboBox jComboBoxTiposRelacionesDetalleCurso) {
		this.jComboBoxTiposRelacionesDetalleCurso = jComboBoxTiposRelacionesDetalleCurso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCurso(
			JComboBox jComboBoxTiposAccionesDetalleCurso) {
		this.jComboBoxTiposAccionesDetalleCurso = jComboBoxTiposAccionesDetalleCurso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleCurso() {
		return this.jComboBoxTiposAccionesFormularioDetalleCurso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleCurso(
			JComboBox jComboBoxTiposAccionesFormularioDetalleCurso) {
		this.jComboBoxTiposAccionesFormularioDetalleCurso = jComboBoxTiposAccionesFormularioDetalleCurso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallecursoSessionBean=new DetalleCursoSessionBean();
		
		this.detallecursoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecursoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecursoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCursoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCursoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Curso MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleCursoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleCurso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleCurso=new JButtonMe();
				this.jButtonModificarToolBarDetalleCurso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleCurso,this.jTtoolBarDetalleDetalleCurso,
							"actualizar","actualizar","Actualizar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleCurso,this.jTtoolBarDetalleDetalleCurso,
							"eliminar","eliminar","Eliminar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleCurso,this.jTtoolBarDetalleDetalleCurso,
							"cancelar","cancelar","Cancelar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleCurso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleCurso,this.jTtoolBarDetalleDetalleCurso,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleCurso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleCurso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleCurso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleCurso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleCurso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCurso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCurso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCurso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleCurso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleCurso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleCurso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleCurso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleCurso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleCurso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleCurso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleCurso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleCurso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleCurso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleCurso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleCurso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleCurso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCurso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCurso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleCurso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleCurso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleCurso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCurso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCurso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCurso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCurso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleCurso.add(this.jMenuItemDetalleCerrarDetalleCurso);
		
		this.jmenuDetalleAccionesDetalleCurso.add(this.jMenuItemActualizarDetalleCurso);
		this.jmenuDetalleAccionesDetalleCurso.add(this.jMenuItemEliminarDetalleCurso);
		this.jmenuDetalleAccionesDetalleCurso.add(this.jMenuItemCancelarDetalleCurso);		
		
		//this.jmenuDetalleDatosDetalleCurso.add(this.jMenuItemDetalleAbrirOrderByDetalleCurso);				
		this.jmenuDetalleDatosDetalleCurso.add(this.jMenuItemDetalleMostarOcultarDetalleCurso);				
				
		//this.jmenuDetalleAccionesDetalleCurso.add(this.jMenuItemGuardarCambiosDetalleCurso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleCurso.add(this.jmenuDetalleArchivoDetalleCurso);		
		this.jmenuBarDetalleDetalleCurso.add(this.jmenuDetalleAccionesDetalleCurso);		
		this.jmenuBarDetalleDetalleCurso.add(this.jmenuDetalleDatosDetalleCurso);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleCurso);				
	}
	
	
	public void inicializarElementosCamposDetalleCurso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleCurso = new JLabelMe();
		jLabelIdDetalleCurso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleCurso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleCurso.setToolTipText(DetalleCursoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleCurso= new GridBagLayout();

		this.jPanelidDetalleCurso.setLayout(this.gridaBagLayoutDetalleCurso);

		jLabelidDetalleCurso = new JLabel();
		jLabelidDetalleCurso.setText("Id");

		jLabelidDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreDetalleCurso = new JLabelMe();
		this.jLabelnombreDetalleCurso.setText(""+DetalleCursoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDetalleCurso.setToolTipText("Nombre");
		this.jLabelnombreDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetalleCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetalleCurso.setToolTipText(DetalleCursoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetalleCurso = new GridBagLayout();
		this.jPanelnombreDetalleCurso.setLayout(this.gridaBagLayoutDetalleCurso);


		jTextAreanombreDetalleCurso= new JTextAreaMe();
		jTextAreanombreDetalleCurso.setEnabled(false);
		jTextAreanombreDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreDetalleCurso.setLineWrap(true);
		jTextAreanombreDetalleCurso.setWrapStyleWord(true);
		jTextAreanombreDetalleCurso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreDetalleCurso.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreDetalleCurso = new JScrollPane(jTextAreanombreDetalleCurso);
		jscrollPanenombreDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreDetalleCursoBusqueda= new JButtonMe();
		this.jButtonnombreDetalleCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetalleCursoBusqueda.setText("U");
		this.jButtonnombreDetalleCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetalleCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetalleCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetalleCursoBusqueda"));

		if(this.detallecursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetalleCursoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleCurso = new JLabelMe();
		this.jLabeldescripcionDetalleCurso.setText(""+DetalleCursoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleCurso.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleCurso.setToolTipText(DetalleCursoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleCurso = new GridBagLayout();
		this.jPaneldescripcionDetalleCurso.setLayout(this.gridaBagLayoutDetalleCurso);


		jTextAreadescripcionDetalleCurso= new JTextAreaMe();
		jTextAreadescripcionDetalleCurso.setEnabled(false);
		jTextAreadescripcionDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleCurso.setLineWrap(true);
		jTextAreadescripcionDetalleCurso.setWrapStyleWord(true);
		jTextAreadescripcionDetalleCurso.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleCurso.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleCurso = new JScrollPane(jTextAreadescripcionDetalleCurso);
		jscrollPanedescripcionDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleCursoBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleCursoBusqueda.setText("U");
		this.jButtondescripcionDetalleCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleCursoBusqueda"));

		if(this.detallecursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleCursoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleCurso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_cursoDetalleCurso = new JLabelMe();
		this.jLabelid_cursoDetalleCurso.setText(""+DetalleCursoConstantesFunciones.LABEL_IDCURSO+" : *");
		this.jLabelid_cursoDetalleCurso.setToolTipText("Curso");
		this.jLabelid_cursoDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cursoDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cursoDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cursoDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cursoDetalleCurso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cursoDetalleCurso.setToolTipText(DetalleCursoConstantesFunciones.LABEL_IDCURSO);
		this.gridaBagLayoutDetalleCurso = new GridBagLayout();
		this.jPanelid_cursoDetalleCurso.setLayout(this.gridaBagLayoutDetalleCurso);


		jComboBoxid_cursoDetalleCurso= new JComboBoxMe();
		jComboBoxid_cursoDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cursoDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cursoDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cursoDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cursoDetalleCurso= new JButtonMe();
		this.jButtonid_cursoDetalleCurso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cursoDetalleCurso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cursoDetalleCurso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cursoDetalleCurso.setText("Buscar");
		this.jButtonid_cursoDetalleCurso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cursoDetalleCurso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cursoDetalleCurso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cursoDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cursoDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cursoDetalleCurso"));

		this.jButtonid_cursoDetalleCursoBusqueda= new JButtonMe();
		this.jButtonid_cursoDetalleCursoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cursoDetalleCursoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cursoDetalleCursoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cursoDetalleCursoBusqueda.setText("U");
		this.jButtonid_cursoDetalleCursoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cursoDetalleCursoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cursoDetalleCursoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cursoDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cursoDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cursoDetalleCursoBusqueda"));

		if(this.detallecursoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cursoDetalleCursoBusqueda.setVisible(false);		}

		this.jButtonid_cursoDetalleCursoUpdate= new JButtonMe();
		this.jButtonid_cursoDetalleCursoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cursoDetalleCursoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cursoDetalleCursoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cursoDetalleCursoUpdate.setText("U");
		this.jButtonid_cursoDetalleCursoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cursoDetalleCursoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cursoDetalleCursoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cursoDetalleCurso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cursoDetalleCurso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cursoDetalleCursoUpdate"));



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
		//this.jInternalFrameDetalleDetalleCurso = new DetalleCursoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Curso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCurso= new GridBagLayout();
		

		
		String sToolTipDetalleCurso="";
		sToolTipDetalleCurso=DetalleCursoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCurso+="(Nomina.DetalleCurso)";
		}
		
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCurso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleCurso = new JButtonMe();
		this.jButtonModificarDetalleCurso = new JButtonMe();
        this.jButtonActualizarDetalleCurso = new JButtonMe();
        this.jButtonEliminarDetalleCurso = new JButtonMe();
        this.jButtonCancelarDetalleCurso = new JButtonMe();
        this.jButtonGuardarCambiosDetalleCurso = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleCurso = new JButtonMe();
		this.jButtonCerrarDetalleCurso = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCurso = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleCurso = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleCurso = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Curso";
		
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cursos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCurso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleCurso.setName("jPanelCamposDetalleCurso"); 

		this.jPanelCamposOcultosDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleCurso.setName("jPanelCamposOcultosDetalleCurso"); 

        this.jPanelAccionesDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCurso.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCurso.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleCurso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleCurso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleCurso.setText("Nuevo");
		this.jButtonModificarDetalleCurso.setText("Editar");
        this.jButtonActualizarDetalleCurso.setText("Actualizar");
        this.jButtonEliminarDetalleCurso.setText("Eliminar");
        this.jButtonCancelarDetalleCurso.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleCurso.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleCurso.setText("Guardar");
		this.jButtonCerrarDetalleCurso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCurso,"nuevo_button","Nuevo",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleCurso,"modificar_button","Editar",this.detallecursoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleCurso,"actualizar_button","Actualizar",this.detallecursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleCurso,"eliminar_button","Eliminar",this.detallecursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleCurso,"cancelar_button","Cancelar",this.detallecursoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleCurso,"guardarcambios_button","Guardar",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCurso,"guardarcambiostabla_button","Guardar",this.detallecursoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCurso,"cerrar_button","Salir",this.detallecursoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleCurso.setToolTipText("Nuevo"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleCurso.setToolTipText("Editar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleCurso.setToolTipText("Actualizar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleCurso.setToolTipText("Eliminar)"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleCurso.setToolTipText("Cancelar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleCurso.setToolTipText("Guardar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleCurso.setToolTipText("Guardar"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCurso.setToolTipText("Salir"+" "+DetalleCursoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCurso";
		inputMap = this.jButtonNuevoDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCurso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCurso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleCurso";
		inputMap = this.jButtonActualizarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleCurso"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleCurso";
		inputMap = this.jButtonEliminarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleCurso"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleCurso";
		inputMap = this.jButtonCancelarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleCurso"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleCurso";
		inputMap = this.jButtonCerrarDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCurso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCurso";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCurso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCurso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCurso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleCurso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleCurso.setToolTipText("Nuevo DetalleCurso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleCurso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleCurso.setToolTipText("Sin Cerrar Ventana DetalleCurso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleCurso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleCurso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleCurso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCurso.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCurso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleCurso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleCurso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleCurso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleCurso = new JLabelMe();
		
		this.jLabelAccionesDetalleCurso.setText("Acciones");		
		this.jLabelAccionesDetalleCurso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCurso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCurso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleCurso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleCurso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleCurso=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleCurso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleCurso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleCurso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCurso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCurso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCurso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleCurso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCurso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCurso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleCurso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleCurso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleCurso = new GridBagLayout();
		
		this.jPanelCamposDetalleCurso.setLayout(gridaBagLayoutCamposDetalleCurso);
		this.jPanelCamposOcultosDetalleCurso.setLayout(gridaBagLayoutCamposOcultosDetalleCurso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 0;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleCurso.add(jLabelIdDetalleCurso, this.gridBagConstraintsDetalleCurso);



	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 1;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleCurso.add(jLabelidDetalleCurso, this.gridBagConstraintsDetalleCurso);


	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 0;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cursoDetalleCurso.add(jLabelid_cursoDetalleCurso, this.gridBagConstraintsDetalleCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = 0;
		this.gridBagConstraintsDetalleCurso.gridx = 2;
		this.gridBagConstraintsDetalleCurso.ipadx = 0;
		this.gridBagConstraintsDetalleCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cursoDetalleCurso.add(jButtonid_cursoDetalleCursoBusqueda, this.gridBagConstraintsDetalleCurso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = 0;
		this.gridBagConstraintsDetalleCurso.gridx = 3;
		this.gridBagConstraintsDetalleCurso.ipadx = 0;
		this.gridBagConstraintsDetalleCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cursoDetalleCurso.add(jButtonid_cursoDetalleCursoUpdate, this.gridBagConstraintsDetalleCurso);
	}

	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 1;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cursoDetalleCurso.add(jComboBoxid_cursoDetalleCurso, this.gridBagConstraintsDetalleCurso);


	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 0;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetalleCurso.add(jLabelnombreDetalleCurso, this.gridBagConstraintsDetalleCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = 0;
		this.gridBagConstraintsDetalleCurso.gridx = 2;
		this.gridBagConstraintsDetalleCurso.ipadx = 0;
		this.gridBagConstraintsDetalleCurso.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetalleCurso.add(jButtonnombreDetalleCursoBusqueda, this.gridBagConstraintsDetalleCurso);
	}

	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 1;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetalleCurso.add(jscrollPanenombreDetalleCurso, this.gridBagConstraintsDetalleCurso);


	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 0;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleCurso.add(jLabeldescripcionDetalleCurso, this.gridBagConstraintsDetalleCurso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCurso.gridy = 0;
		this.gridBagConstraintsDetalleCurso.gridx = 2;
		this.gridBagConstraintsDetalleCurso.ipadx = 0;
		this.gridBagConstraintsDetalleCurso.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleCurso.add(jButtondescripcionDetalleCursoBusqueda, this.gridBagConstraintsDetalleCurso);
	}

	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCurso.gridy = 0;
	this.gridBagConstraintsDetalleCurso.gridx = 1;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleCurso.add(jscrollPanedescripcionDetalleCurso, this.gridBagConstraintsDetalleCurso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCurso.gridy = iYPanelCamposDetalleCurso;
	this.gridBagConstraintsDetalleCurso.gridx = iXPanelCamposDetalleCurso++;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCurso.add(this.jPanelidDetalleCurso, this.gridBagConstraintsDetalleCurso);



	if(iXPanelCamposDetalleCurso % 1==0) {
		iXPanelCamposDetalleCurso=0;
		iYPanelCamposDetalleCurso++;
	}
	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCurso.gridy = iYPanelCamposDetalleCurso;
	this.gridBagConstraintsDetalleCurso.gridx = iXPanelCamposDetalleCurso++;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCurso.add(this.jPanelid_cursoDetalleCurso, this.gridBagConstraintsDetalleCurso);



	if(iXPanelCamposDetalleCurso % 1==0) {
		iXPanelCamposDetalleCurso=0;
		iYPanelCamposDetalleCurso++;
	}
	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCurso.gridy = iYPanelCamposDetalleCurso;
	this.gridBagConstraintsDetalleCurso.gridx = iXPanelCamposDetalleCurso++;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCurso.add(this.jPanelnombreDetalleCurso, this.gridBagConstraintsDetalleCurso);



	if(iXPanelCamposDetalleCurso % 1==0) {
		iXPanelCamposDetalleCurso=0;
		iYPanelCamposDetalleCurso++;
	}
	this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCurso.gridy = iYPanelCamposDetalleCurso;
	this.gridBagConstraintsDetalleCurso.gridx = iXPanelCamposDetalleCurso++;
	this.gridBagConstraintsDetalleCurso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCurso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCurso.add(this.jPaneldescripcionDetalleCurso, this.gridBagConstraintsDetalleCurso);



	if(iXPanelCamposDetalleCurso % 1==0) {
		iXPanelCamposDetalleCurso=0;
		iYPanelCamposDetalleCurso++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleCurso= new GridBagLayout();
		this.jPanelAccionesDetalleCurso.setLayout(gridaBagLayoutAccionesDetalleCurso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleCurso= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleCurso.setLayout(gridaBagLayoutAccionesFormularioDetalleCurso);
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCurso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCurso.add(this.jComboBoxTiposAccionesFormularioDetalleCurso, this.gridBagConstraintsDetalleCurso);

		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCurso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCurso.add(this.jCheckBoxPostAccionNuevoDetalleCurso, this.gridBagConstraintsDetalleCurso);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallecursoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCurso.add(this.jCheckBoxPostAccionSinCerrarDetalleCurso, this.gridBagConstraintsDetalleCurso);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallecursoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallecursoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCurso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCurso.add(this.jCheckBoxPostAccionSinMensajeDetalleCurso, this.gridBagConstraintsDetalleCurso);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = 0;
		this.gridBagConstraintsDetalleCurso.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleCurso.add(this.jButtonModificarDetalleCurso, this.gridBagConstraintsDetalleCurso);							

		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCurso.gridy = 0;
		this.gridBagConstraintsDetalleCurso.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleCurso.add(this.jButtonEliminarDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
			
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = 0;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCurso.add(this.jButtonActualizarDetalleCurso, this.gridBagConstraintsDetalleCurso);


		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = 0;		
		this.gridBagConstraintsDetalleCurso.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCurso.add(this.jButtonGuardarCambiosDetalleCurso, this.gridBagConstraintsDetalleCurso);	
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = 0;		
		this.gridBagConstraintsDetalleCurso.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleCurso.add(this.jButtonCancelarDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCurso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCurso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecursoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCurso.gridx = 0;		
			//this.gridBagConstraintsDetalleCurso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCurso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCurso.gridx =0;
		this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCurso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCurso, this.gridBagConstraintsDetalleCurso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleCursoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleCurso = new DetalleCursoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Curso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Curso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Curso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleCursoModel detallecursoModel=new DetalleCursoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleCursoModel.DetalleCursoFocusTraversalPolicy detallecursoFocusTraversalPolicy = detallecursoModel.new DetalleCursoFocusTraversalPolicy(this);
			
			//detallecursoFocusTraversalPolicy.setdetallecursoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallecursoModel);
			
			
			this.jContentPaneDetalleDetalleCurso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleCurso = new GridBagLayout();	
			this.jContentPaneDetalleDetalleCurso.setLayout(gridaBagLayoutDetalleDetalleCurso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCurso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
				this.gridBagConstraintsDetalleCurso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleCurso.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleCurso.add(jTtoolBarDetalleDetalleCurso, gridBagConstraintsDetalleCurso);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleCurso=   new JScrollPane(jContentPaneDetalleDetalleCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleCurso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleCurso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleCurso.gridx = 0;
	        
			this.jContentPaneDetalleDetalleCurso.add(jPanelCamposDetalleCurso, gridBagConstraintsDetalleCurso);
			
			
			
			
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
						&& detallecursoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallecursoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleCurso= new GridBagConstraints();
						this.gridBagConstraintsDetalleCurso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleCurso.gridx = 0;
						this.jContentPaneDetalleDetalleCurso.add(this.jTabbedPaneRelacionesDetalleCurso, this.gridBagConstraintsDetalleCurso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleCurso.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleCurso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
					this.gridBagConstraintsDetalleCurso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleCurso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleCurso.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleCurso.add(jPanelCamposOcultosDetalleCurso, gridBagConstraintsDetalleCurso);
				
					this.jPanelCamposOcultosDetalleCurso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleCurso.gridx = 0;
	        this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleCurso.add(this.jPanelAccionesFormularioDetalleCurso, this.gridBagConstraintsDetalleCurso);							
			
			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
	        this.gridBagConstraintsDetalleCurso.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleCurso.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleCurso.add(this.jPanelAccionesDetalleCurso, this.gridBagConstraintsDetalleCurso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleCurso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleCurso=   new JScrollPane(this.jPanelCamposDetalleCurso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCurso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCurso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCurso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCurso.gridx = 0;
			this.gridBagConstraintsDetalleCurso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleCurso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleCurso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleCurso, this.gridBagConstraintsDetalleCurso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCurso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleCurso, this.gridBagConstraintsDetalleCurso);			
			
			this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
			this.gridBagConstraintsDetalleCurso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCurso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleCurso, this.gridBagConstraintsDetalleCurso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCurso, this.gridBagConstraintsDetalleCurso);
			
			
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCurso, this.gridBagConstraintsDetalleCurso);
		
			
		this.gridBagConstraintsDetalleCurso = new GridBagConstraints();
		this.gridBagConstraintsDetalleCurso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCurso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCurso, this.gridBagConstraintsDetalleCurso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleCurso;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleCurso;
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
